package com.fedex.smartpost.utilities;

import com.fedex.smartpost.common.business.FxspPackage;
import com.fedex.smartpost.common.business.FxspPackageFactory;
import com.fedex.smartpost.utilities.dao.ECustomerDao;
import com.fedex.smartpost.utilities.helper.CommonHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class WhoIs {
	private static Set<String> readFile(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		Set<String> packageIds = new TreeSet<String>();

		while (br.ready()) {
			String packageId = extractPackageId(br.readLine());
			if (packageId != null) {
				packageIds.add(packageId);
			}
		}
		br.close();
		return packageIds;
	}

	private static Set<String> extractMailerIds(Collection<String> packageIds) {
		Set<String> mailerIds = new TreeSet<String>();

		for (String packageId : packageIds) {
			FxspPackage fxspPackage = FxspPackageFactory.createFromTrackingId(packageId);
			mailerIds.add(fxspPackage.getMailerId());
		}
		return mailerIds;
	}

	private static void process(String fileList) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context/jarBeans.xml");
		ECustomerDao eCustomerDao = (ECustomerDao)context.getBean("eCustomer");
		Set<String> mailerIds = new TreeSet<String>();

		for (String filename : CommonHelper.loadFilenames(fileList)) {
			mailerIds.addAll(extractMailerIds(readFile(CommonHelper.buildDifferenceFilename(filename))));
		}
		for (String mailerId : mailerIds) {
			System.out.println(eCustomerDao.retrieveCustomerName(mailerId) + " [Mailer Id: " + mailerId + ']');
		}
	}

	private static String extractPackageId(String record) {
		if (record.startsWith("[Package Id: ")) {
			return record.substring(13, record.indexOf("]"));
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
	  	WhoIs whoIs = new WhoIs();
		process("/ECI_Files.txt");
	}
}
