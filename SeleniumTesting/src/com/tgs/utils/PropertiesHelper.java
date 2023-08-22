package com.tgs.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {

	public static String getValue(String key) throws IOException {
		FileReader f = new FileReader(new File("./Resources/config.properties"));
		Properties prop = new Properties();
		prop.load(f);
		return prop.getProperty(key);
		
	}

	public static void main(String[] args) throws IOException {
		getValue("Browser");
	}

}
