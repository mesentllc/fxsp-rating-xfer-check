package com.fedex.smartpost.utilities;

import com.fedex.smartpost.utilities.dao.PackageDetailXref;
import com.fedex.smartpost.utilities.helper.CommonHelper;
import com.fedex.smartpost.utilities.helper.DifferenceHelper;
import com.fedex.smartpost.utilities.helper.ResourceHelper;
import com.fedex.smartpost.utilities.model.Difference;
import com.fedex.smartpost.utilities.model.PackageDetail;
import com.fedex.smartpost.utilities.types.ECIPackages;
import com.fedex.smartpost.utilities.types.PfiPackage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RodsCompare {
	private static final String extractTemplate = ResourceHelper.classPathResource("/xsl/ECI-extract.xsl");
	private static final String translateTemplate = ResourceHelper.classPathResource("/xsl/ECI-transform.xsl");
	private static final String extractionTempFile = "xmlExtract.xml";
	private static final String transformedTempFile = "xmlTranformed.xml";
	private static final JAXBContext context = initContext();

	private static JAXBContext initContext() {
		try {
			return JAXBContext.newInstance("com.fedex.smartpost.utilities.types", ECIPackages.class.getClassLoader());
		}
		catch (JAXBException e) {
			return null;
		}
	}

	private static void showHelp() {
		System.exit(-1);
	}

	private void extractXmlFromPFIMessage(String messageFile) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer(
				new StreamSource(new ByteArrayInputStream(extractTemplate.getBytes())));
		Source source = new StreamSource(new File(messageFile));
		Result result = new StreamResult(new File(extractionTempFile));
		transformer.transform(source, result);
	}

	private void formatDataFromPFIMessage() throws TransformerException {
		File inputFile = new File(extractionTempFile);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer(
				new StreamSource(new ByteArrayInputStream(translateTemplate.getBytes())));
		Source source = new StreamSource(inputFile);
		Result result = new StreamResult(new File(transformedTempFile));
		transformer.transform(source, result);
		inputFile.delete();
	}

	private ECIPackages retreivePackages() throws JAXBException, FileNotFoundException {
		File inputFile = new File(transformedTempFile);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		FileReader fileReader = new FileReader(inputFile);
		ECIPackages eciPackages = (ECIPackages)unmarshaller.unmarshal(fileReader);
		inputFile.delete();
		return eciPackages;
	}

	private List<String> retrievePackageIds(ECIPackages eciPackages) {
		List<String> packageIds = new ArrayList<String>();
		if (eciPackages != null) {
			for (PfiPackage pkg : eciPackages.getPfiPackage()) {
				packageIds.add(StringUtils.rightPad(pkg.getSpPackageNum(), 24));
			}
		}
		return packageIds;
	}

	private void process(String filename) throws TransformerException, JAXBException, IOException, ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context/jarBeans.xml");
		PackageDetailXref packageDetailXref = (PackageDetailXref)context.getBean("packageDetailXref");

		extractXmlFromPFIMessage(filename);
		formatDataFromPFIMessage();
		ECIPackages eciPackages = retreivePackages();
		List<String> packageIds = retrievePackageIds(eciPackages);
		writePackageIds(filename, packageIds);
		Map<String, PackageDetail> packageDetails = packageDetailXref.retrievePackageDetails(packageIds);
		writeDifferences(filename, eciPackages, packageDetails);
	}

	private void writeDifferences(String arg, ECIPackages eciPackages, Map<String, PackageDetail> packageDetails) throws
																												  IOException,
																												  ParseException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(CommonHelper.buildDifferenceFilename(arg)));
		for (PfiPackage pkg : eciPackages.getPfiPackage()) {
			List<Difference> differences = DifferenceHelper
					.findDifferences(pkg, packageDetails.get(pkg.getSpPackageNum()));
			if (differences.size() > 0) {
				for (Difference difference : differences) {
					bufferedWriter.write(difference + "\r\n");
					System.out.println(difference);
				}
			}
		}
		bufferedWriter.close();
	}

	private void writePackageIds(String arg, List<String> packageIds) throws IOException {
		BufferedWriter packageWriter = new BufferedWriter(new FileWriter("/packageIds-" +
																		 arg.substring(arg.lastIndexOf("/") + 1,
																					   arg.lastIndexOf(".")) + ".txt"));
		for (String packageId : packageIds) {
			packageWriter.write(packageId + "\r\n");
		}
		packageWriter.close();
	}

//	public static void main(String[] args) throws TransformerException, JAXBException, IOException,
//												  ParseException {
//		RodsCompare rodsTransform = new RodsCompare();
//		rodsTransform.process("/Projects/local/fxsp-rodes-eci-compare/WIP/ECI_Invoice_JVM_1_201558_1431108595421.xml");
//	}

	public static void main(String[] args) throws TransformerException, JAXBException, IOException, ParseException {
		RodsCompare rodsCompare = new RodsCompare();

		for (String filename : CommonHelper.loadFilenames("/Projects/local/fxsp-rating-xfer-check/WIP/ECI_Files.txt")) {
			rodsCompare.process(filename);
		}
	}
}
