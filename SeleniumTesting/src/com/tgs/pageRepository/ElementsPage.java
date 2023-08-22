package com.tgs.pageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage {

	public static String placeHolderFullName = "Full Name";
	public static String placeHolderEmail = "name@example.com";
	public static String placeHolderCurrentAddr = "Current Address";
	
	
	public static String labelFullName="Full Name";
	public static String labelUserEmail="Email";
	public static String labelCurrAdd="Current Address";
	public static String labelPermAdd="Permanent Address";
	
	public static String fullName_value= "Pragathi";
	public static String email_value= "Pragathi@some.com";
	public static String currAdd_value= "#2, 7th cross, 8th main, Bangalore";
	public static String permAdd_value= "#2, 7th cross, 8th main, Bangalore";
	
	@FindBy(id="userName")
	public WebElement textBoxFullName;
	

	@FindBy(xpath="//input[@placeholder='name@example.com']")
	public WebElement textBoxEmail;
	
	@FindBy(id="currentAddress")
	public WebElement textBoxCurrentAddress;
	
	@FindBy(id="permanentAddress")
	public WebElement textBoxPermanentAddress;

	@FindBy(xpath="//span[text()='Text Box']")
	public WebElement textBoxMenu;
	
	@FindBy(xpath="//div[@id='userName-wrapper']/div[1]/label[@id='userName-label']")
	public WebElement label_FullName;
	
	@FindBy(id="userEmail-label")
	public WebElement label_userEmail;
	
	@FindBy(id="currentAddress-label")
	public WebElement label_currAdd;
	
	@FindBy(id="permanentAddress-label")
	public WebElement label_permAdd;

	@FindBy(xpath="//button[@id='submit']")
	public WebElement submit_button;
	
	@FindBy(xpath="//div[@id='output']/div/p[@id='name']")
	public WebElement text_box;
	
	@FindBy(xpath="//div[@id='output']/div/p[1]")
	public WebElement output_name;
	
	@FindBy(xpath="//div[@id='output']/div/p[2]")
	public WebElement output_email;
	
	@FindBy(xpath="//div[@id='output']/div/p[3]")
	public WebElement output_currAdd;
	
	@FindBy(xpath="//div[@id='output']/div/p[4]")
	public WebElement output_permAdd;
	
	@FindBy(id="item-1")
	public WebElement checkBox_Menu;
	
	@FindBy(xpath="//span[text()='Home']/../span[1]/*[local-name()='svg']")
	public WebElement checkBox_Home;
	
	@FindBy(id="item-2")
	public WebElement radioButton_Menu;
	
	@FindBy(xpath="//label[@for='yesRadio']")
	public WebElement radioButton_OptionYes;
	
	@FindBy(xpath="//p[@class='mt-3']/span[text()='Yes']")
	public WebElement paraElement_radio;
	
	
}
