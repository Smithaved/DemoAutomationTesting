package com.DemoAutomationTesting.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='text-22-sub_row_1-0-2-1-0']//a[@class='woocommerce-LoopProduct-link']")
	private WebElement bookLink;
	
	public void clickOnBook()
	{
		bookLink.click();
	}
}
