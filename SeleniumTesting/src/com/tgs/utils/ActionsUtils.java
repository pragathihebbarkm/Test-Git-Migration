package com.tgs.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsUtils implements DriverActions{

	@Override
	public void jsClick(WebDriver driver, WebElement findElement) {
		
		try {
			JavascriptExecutor jse = (JavascriptExecutor) DriverHelper.getDriver();
			jse.executeScript("arguments[0].click();", findElement);
		}
		catch(Exception e) {
			throw new RuntimeException("Unable to click");
		}
		
		
	}

	@Override
	public void elementClick() {
		
		
	}


	@Override
	public void sendKeys() {
		
		
	}

	
	

}
