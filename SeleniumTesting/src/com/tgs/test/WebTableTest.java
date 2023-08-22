package com.tgs.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tgs.pageRepository.DemoQA_HomePage;
import com.tgs.pageRepository.WebTablePage;
import com.tgs.utils.ActionsUtils;
import com.tgs.utils.DriverHelper;

public class WebTableTest {

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
    
    
    @Test(description = "verify 1st row and 4 column text as cierra@example.com")
    
    void verify1stRow4thCol() {
    
        String text = webTableObj.getWebElementOftable(driver, 1, 4).getText();
        System.out.println("Output="+text);
        System.out.println(webTableObj.getTotalRow(webTableObj.totalRow,driver));
        
    }
    
    @Test(description = "Delete the 3rd row")
    
     void delete3rdRow() {
    	
    	webTableObj.getWebElementOftable(driver, 3, 7).findElement(By.xpath("//div[@class='action-buttons']//span[@title='Delete']")).click();
//        act.jsClick(driver, webTableObj.getWebElementOftable(driver, 3, 7).
//                findElement(By.xpath("//div[@class='action-buttons']//span[@title='Delete']")));
    }
    
    @AfterMethod
    void tearDown() {
        //driver.quit();
    }
}
