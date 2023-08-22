package com.tgs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface DriverActions {

	void elementClick();
	void jsClick(WebDriver driver, WebElement findElement);
	void sendKeys();
}
