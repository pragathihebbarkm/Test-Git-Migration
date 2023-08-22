package com.tgs.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQA1 {

	WebDriver driver;
	
	@BeforeMethod
	void getChromeDriver() {
		System.getProperty("webdriver.chromedriver", "C:\\\\Users\\\\phebbarkm\\\\Documents\\\\Automation\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	void TC01_ValidateAuthor() throws InterruptedException {
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebElement bookStoreMenu = driver.findElement(By.xpath("//div[@class='category-cards']/div[6]"));
		bookStoreMenu.click();
		Thread.sleep(3000);
		WebElement prg_JS = driver.findElement(By.linkText("Learning JavaScript Design Patterns"));
		prg_JS.click();
		Thread.sleep(3000);
		WebElement author_Name = driver.findElement(By.xpath("//div[@id='author-wrapper']/div[2]/label"));
		assertEquals(author_Name.getText(), "Addy Osmani");
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
