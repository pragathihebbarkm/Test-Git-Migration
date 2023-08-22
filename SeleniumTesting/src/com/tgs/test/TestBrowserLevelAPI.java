package com.tgs.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBrowserLevelAPI {

	WebDriver driver;
	
	@BeforeTest
	void getDriver() {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\phebbarkm\\Documents\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	void maximizeAndGoToURL() {
		
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/forms");
		assertEquals(driver.getTitle(), "ToolsQA");
		
	}
	
	@Test
	void maximizeGotoAndBack() {
		
		driver.get("https://demoqa.com/forms");
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/sortable");
		driver.navigate().back();
	}
	
	
	@AfterTest
	void closeDriver() {
		driver.quit();
	}

}
