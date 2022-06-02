package com.DemoAutomationTesting.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoAutomationTesting.GenericUtility.WebDriverLibrary;

public class BasketPage {
	public BasketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement procedToCheckoutBtn;
	
	@FindBy(xpath = "//div[@class='cart_totals calculated_shipping']")
	private WebElement scroolElement;
	
	@FindBy(xpath = "//a[@class='added_to_cart wc-forward']")
	private WebElement viewBasketLink;
	
	public void procedToCheckout(WebDriverLibrary webDriverLibrary, WebDriver driver)
	{
//		webDriverLibrary.initializeJs(driver);
//		webDriverLibrary.scroolTillElement(scroolElement);
		procedToCheckoutBtn.click();
	}
}
