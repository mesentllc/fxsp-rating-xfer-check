package com.fedex.smartpost.utilities.helper;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 796812 on 5/11/2015.
 */
public class ResourceHelper {
	public static String classPathResource(String path) {
		BufferedReader bufferedReader = null;
		StringBuffer stringBuffer = new StringBuffer();

		try {
			ClassPathResource classPathResource = new ClassPathResource(path);
			bufferedReader = new BufferedReader(new InputStreamReader(classPathResource.getInputStream()));
			String line = bufferedReader.readLine();
			while (line != null) {
				stringBuffer.append(line + "\n");
				line = bufferedReader.readLine();
			}
		}
		catch (IOException ioe) {
			throw new IllegalArgumentException("FAILED_TO_LOAD_RESOURCE_EXCEPTION_MESSAGE", ioe);
		}
		finally {
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new IllegalStateException("FAILED_TO_CLOSE_RESOURCE_EXCEPTION_MESSAGE", e);
				}
			}
		}
		return stringBuffer.toString();
	}
}
