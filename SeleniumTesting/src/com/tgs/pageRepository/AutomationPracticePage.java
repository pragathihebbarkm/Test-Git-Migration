package com.tgs.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticePage {

	@FindBy(id="firstName")
	public WebElement textBoxFirstName;
	
	
	@FindBy(id="lastName")
	public WebElement textBoxLastName;

}
