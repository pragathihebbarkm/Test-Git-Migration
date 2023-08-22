package com.tgs.utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverHelper {

	private static WebDriver driver;
	

	static void setDriver() throws IOException {

		String browser = PropertiesHelper.getValue("Browser");
		
		if (browser != null) {
			if (browser.toLowerCase().contains("chrome")) {
				driver = new ChromeDriver();
			}
			if (browser.toLowerCase().contains("firefox")) {
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
		}
		else
			throw new RuntimeException("Invalid Browser key or empty");
	}

	public static WebDriver getDriver() throws IOException {
		setDriver();
		return driver;
	}

}
