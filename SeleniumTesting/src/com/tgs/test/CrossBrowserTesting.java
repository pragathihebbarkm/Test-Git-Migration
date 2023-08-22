package com.tgs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

WebDriver driver;
	
	@BeforeMethod
	void getDriver() {
		driver = new FirefoxDriver();
	}

	
	@Test
	void TC01_validateDemoQATitle() {
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "ToolsQA");
		
	}

}
