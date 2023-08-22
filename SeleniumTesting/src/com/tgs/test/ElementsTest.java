package com.tgs.test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tgs.pageRepository.DemoQA_HomePage;
import com.tgs.pageRepository.ElementsPage;
import com.tgs.utils.DriverHelper;

public class ElementsTest {

	WebDriver driver;
	ElementsPage elementsObj;
	DemoQA_HomePage homeObj;
	//
	
	@BeforeTest
	void beforeMethod() throws IOException, InterruptedException {
		driver = DriverHelper.getDriver();
		elementsObj = PageFactory.initElements(driver, ElementsPage.class);
		//homeObj = PageFactory.initElements(driver, DemoQA_HomePage.class);
		driver.get("https://demoqa.com/elements");
	
	}
	
	
	/** 
	 * Validate text box
	 * 1.Validate first, last name, email, current address place holder
	 * 2. Validate labels
	 * 3. Enter text inside first, last name, email, current address and permanent address
	 * 4. Validate values entered inside text boxes
	 * 5. Submit and validate entered text matching with submitted test
	 * @throws InterruptedException 
	 */
	
	@Test
	void TC01() throws InterruptedException {
		elementsObj.textBoxMenu.click();
		String placeHolderFullName  = elementsObj.textBoxFullName.getAttribute("placeholder");
		Assert.assertEquals(placeHolderFullName, ElementsPage.placeHolderFullName);
		Assert.assertEquals(elementsObj.textBoxCurrentAddress.getAttribute("placeholder"), ElementsPage.placeHolderCurrentAddr);
		Assert.assertEquals(elementsObj.textBoxEmail.getAttribute("placeholder"), ElementsPage.placeHolderEmail);
			
	}
	
	@Test
	void TC02() {
		
		Assert.assertEquals(elementsObj.label_FullName.getText(), ElementsPage.labelFullName);
		Assert.assertEquals(elementsObj.label_userEmail.getText(), ElementsPage.labelUserEmail);
		Assert.assertEquals(elementsObj.label_currAdd.getText(), ElementsPage.labelCurrAdd);
		Assert.assertEquals(elementsObj.label_permAdd.getText(), ElementsPage.labelPermAdd);
		
	}
	
	@Test
	void TC03_04() throws InterruptedException {
		
		elementsObj.textBoxFullName.sendKeys(ElementsPage.fullName_value);
		Assert.assertEquals(elementsObj.textBoxFullName.getAttribute("value"),ElementsPage.fullName_value);
		
		elementsObj.textBoxEmail.sendKeys(ElementsPage.email_value);
		Assert.assertEquals(elementsObj.textBoxEmail.getAttribute("value"),ElementsPage.email_value);
		
		elementsObj.textBoxCurrentAddress.sendKeys(ElementsPage.currAdd_value);
		Assert.assertEquals(elementsObj.textBoxCurrentAddress.getAttribute("value"),ElementsPage.currAdd_value);
		
		elementsObj.textBoxPermanentAddress.sendKeys(ElementsPage.permAdd_value);
		Assert.assertEquals(elementsObj.textBoxPermanentAddress.getAttribute("value"),ElementsPage.permAdd_value);
		
		
		
	}
	
	@Test
	void TC05() throws InterruptedException {
		
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		elementsObj.submit_button.click();
		
		Assert.assertTrue(elementsObj.output_name.getText().contains(ElementsPage.fullName_value));
		Assert.assertTrue(elementsObj.output_email.getText().contains(ElementsPage.email_value));
		Assert.assertTrue(elementsObj.output_currAdd.getText().contains(ElementsPage.currAdd_value));
		Assert.assertTrue(elementsObj.output_permAdd.getText().contains(ElementsPage.permAdd_value));
	}
	
	@Test
	void TC06() throws InterruptedException {
		Thread.sleep(2000);
		elementsObj.checkBox_Menu.click();
		elementsObj.checkBox_Home.click(); 
		Assert.assertTrue(elementsObj.checkBox_Home.getAttribute("class").contains("rct-icon rct-icon-check"));
	}
	
	@Test
	void TC07() throws InterruptedException {
		Thread.sleep(2000);
		elementsObj.radioButton_Menu.click();
		elementsObj.radioButton_OptionYes.click();
		Assert.assertTrue(elementsObj.paraElement_radio.getText().contains("Yes"));
	}
	
	@AfterTest
	void tearDownDriver() throws InterruptedException {
		driver.quit();
	}

}
