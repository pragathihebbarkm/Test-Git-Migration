package com.tgs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TestChrome {
//
//	@FindBy(xpath="//input[@id=\"firstName\"]e")
//	public static WebElement txt_FN;
	public static void main(String[] args) {
		
		/**
         * Set the webdriver.chrome.driver key to path of chrome driver
         */
		//System.setProperty("webdriver.chromedriver", "C:\\Users\\phebbarkm\\Documents\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement txtBox_firstName = driver.findElement(By.id("firstName"));
		txtBox_firstName.sendKeys("Rahul");
		
		driver.manage().window().maximize();
//		txt_FN.sendKeys("Rahul");
		

		
		WebElement txtBox_lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtBox_lastName.sendKeys("Prabhu");
		 
	}

}
