package com.fedex.smartpost.utilities.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 796812 on 5/14/2015.
 */
public class CommonHelper {
	public static List<String> loadFilenames(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		List<String> returnList = new ArrayList<String>();

		while (br.ready()) {
			returnList.add(br.readLine().trim());
		}
		br.close();
		return returnList;
	}

	public static String buildDifferenceFilename(String filename) {
		return "/differences-" + filename.substring(filename.lastIndexOf("/") + 1, filename.lastIndexOf(".")) + ".txt";
	}
}
