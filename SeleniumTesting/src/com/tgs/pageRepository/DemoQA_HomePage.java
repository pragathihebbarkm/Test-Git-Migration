package com.tgs.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQA_HomePage {

	//@FindBy(xpath="//div[@class='category-cards']/div[1]")
	
	@FindBy(xpath="div[@class='card-body']/h5")
	public WebElement menuElements;

}
