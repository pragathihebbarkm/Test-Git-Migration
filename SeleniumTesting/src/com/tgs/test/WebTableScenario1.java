package com.tgs.test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tgs.pageRepository.DemoQA_HomePage;
import com.tgs.pageRepository.WebTablePage;
import com.tgs.utils.ActionsUtils;
import com.tgs.utils.DriverHelper;

public class WebTableScenario1 {
	
	WebDriver driver;
    DemoQA_HomePage homeObj;
    WebTablePage webTableObj;
    ActionsUtils act = new ActionsUtils();
    
    @BeforeMethod
    void beforeMethod() throws IOException, InterruptedException {
        driver = DriverHelper.getDriver();
        webTableObj = PageFactory.initElements(driver, WebTablePage.class);
        driver.get("https://demoqa.com/webtables");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //500ms
    }
    
    @Test
    void addRows() {
    	
    	String[] firstNames = {"amit","bindu","chetan","divya","gita","krish","vinay","siya"};
    	String[] lastNames = {"guha","bhat","singh","rao","guha","bhat","singh","rao"};
    	String[] email = {"abc@htmail.com","cde@htmail.com","abc@htmail.com","cde@htmail.com","abc@htmail.com","cde@htmail.com","abc@htmail.com","cde@htmail.com","abc@htmail.com","cde@htmail.com","abc@htmail.com"};
    	String[] age = {"30","23","25","34","52","30","23","25","34","52","44"};
    	String[] salary = {"35000","78000","23400","34210","43200","33200","35000","78000","23400","34210","43200"};
    	String[] dept = {"accounts","billing","IT","Sales","communication","accounts","billing","IT","Sales","communication","biotech"};
    	
    	WebElement add_button = driver.findElement(By.id("addNewRecordButton"));
    	add_button.click();
    	
    	for(int i=0;i<firstNames.length;i++) {
    	WebElement txtbox_Fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
    	txtbox_Fname.sendKeys(firstNames[i]);
    	WebElement txtbox_Lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
    	txtbox_Lname.sendKeys(lastNames[i]);
    	WebElement txtbox_Email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
    	txtbox_Email.sendKeys(email[i]);
    	WebElement txtbox_Age = driver.findElement(By.xpath("//input[@placeholder='Age']"));
    	txtbox_Age.sendKeys(age[i]);
    	WebElement txtbox_Salary = driver.findElement(By.xpath("//input[@placeholder='Salary']"));
    	txtbox_Salary.sendKeys(salary[i]);
    	WebElement txtbox_Dept = driver.findElement(By.xpath("//input[@placeholder='Department']"));
    	txtbox_Dept.sendKeys(dept[i]);
    	WebElement btn_submit = driver.findElement(By.xpath("//button[@id='submit']"));
    	btn_submit.click();
    	add_button.click();
    	}
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
    	WebElement btn_close =driver.findElement(By.xpath("//button[@class='close']"));
    	btn_close.click();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
    	WebElement btn_next = driver.findElement(By.xpath("//button[text()='Next']"));
    	btn_next.click();
    	
    	webTableObj.getWebElementOftable(driver, 1, 7).findElement(By.xpath("//div[@class='action-buttons']//span[@title='Delete']")).click();
    	webTableObj.getWebElementOftable(driver, 10, 7).findElement(By.xpath("//div[@class='action-buttons']//span[@title='Delete']")).click();
    	
    	 System.out.println(webTableObj.getTotalRow(webTableObj.totalRow,driver));
    	
    }
}
