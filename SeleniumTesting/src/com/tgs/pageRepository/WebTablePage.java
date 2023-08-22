package com.tgs.pageRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage {

	@FindBy(xpath="//div[@role='rowgroup']")
	public By totalRow;
    
    
    
    public int getTotalRow(By by, WebDriver driver) {
        var rowCount = 0;
    
        try {
            List<WebElement> rowList = driver.findElements(by);
            rowCount = rowList.size();
            
        } catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
            
            
        }
        
        
        return rowCount;
    }
    
    
    
    
    public WebElement getWebElementOftable(WebDriver driver, int rowNum, int colNum) {
        
        WebElement webTableElement = null ;
        try {
            String webTableXpath = String.format("//div[@role='rowgroup'][%s]/div/div[@class='rt-td'][%s]", rowNum,colNum);
            
            webTableElement  = driver.findElement(By.xpath(webTableXpath));
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return webTableElement;
        
    }

}
