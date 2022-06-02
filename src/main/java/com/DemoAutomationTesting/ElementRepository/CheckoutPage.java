package com.DemoAutomationTesting.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "billing_first_name")
	private WebElement firstNameText;
	
	@FindBy(id = "billing_last_name")
	private WebElement lastNameText;
	
	@FindBy(id = "billing_email")
	private WebElement emailTxt;
	
	@FindBy(id = "billing_phone")
	private WebElement phoneText;
	
	@FindBy(id = "billing_address_1")
	private WebElement addressText;
	
	@FindBy(id = "billing_city")
	private WebElement cityText;
	
	@FindBy(id = "select2-chosen-2")
	private WebElement selectArrow;
	
	@FindBy(id = "s2id_autogen2_search")
	private WebElement searchText;
	
	@FindBy(xpath = "//span[@class='select2-match']")
	private WebElement resultText;
	
	@FindBy(id = "billing_postcode")
	private WebElement pincodeText;
	
	public void enterTheDetail(String firstname, String lastname, String email, String phonenumber, String address, String city, String state, String pincode)
	{
		firstNameText.sendKeys(firstname);
		lastNameText.sendKeys(lastname);
		emailTxt.sendKeys(email);
		phoneText.sendKeys(phonenumber);
		addressText.sendKeys(address);
		cityText.sendKeys(city);
		selectArrow.click();
		searchText.sendKeys(state);
		resultText.click();
		pincodeText.sendKeys(pincode);
	}
}
