package com.tgs.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tgs.pageRepository.AutomationPracticePage;
import com.tgs.utils.DriverHelper;

public class AutomationPracticeFormTest {
	WebDriver driver;
		@BeforeMethod
		void initWebDriver() throws IOException {
			driver = DriverHelper.getDriver();
		}
	
		/**
		 * Test case: Verify placeholder name in first name
		 * Expected: First Name
		 */
		
		@Test
		void TC01() {
			driver.get("https://demoqa.com/automation-practice-form");
			AutomationPracticePage initObj = PageFactory.initElements(driver, AutomationPracticePage.class);
			
			String firstNamePlaceHolder = initObj.textBoxFirstName.getAttribute("placeholder");
			System.out.println(initObj.textBoxFirstName.getAttribute("baseURI"));
			Assert.assertEquals(firstNamePlaceHolder, "First Name");
		}
		/**
		 * Test case: Verify placeholder name in last name
		 * Expected: Last Name
		 */
		
		@Test
		void TC02() {
			driver.get("https://demoqa.com/automation-practice-form");
			AutomationPracticePage initObj = PageFactory.initElements(driver, AutomationPracticePage.class);
			
			String laststNamePlaceHolder = initObj.textBoxLastName.getAttribute("placeholder");
			Assert.assertEquals(laststNamePlaceHolder, "Last Name");
		}
		
		
		
		@AfterMethod
		void tearDownDriver() {
			
			driver.quit();
		}
}

