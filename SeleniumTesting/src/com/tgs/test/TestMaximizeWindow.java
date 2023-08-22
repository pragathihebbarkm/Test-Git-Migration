package com.tgs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMaximizeWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\phebbarkm\\Documents\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/sortable");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().to("https://demoqa.com/forms");
		
		
		
		
		
		
		
		//driver.quit();
	}

}
