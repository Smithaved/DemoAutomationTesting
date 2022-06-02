package com.DemoAutomationTesting.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoAutomationTesting.GenericUtility.WebDriverLibrary;

public class ProductDetailPage {
	public ProductDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-product_id='181']")
	private WebElement addToBasketBtn;
	
	@FindBy(xpath = "//div[@class='related products']")
	private WebElement scroolElement;
	
	@FindBy(xpath = "//a[@class='added_to_cart wc-forward']")
	private WebElement viewBasketLink;
	
	public void addToBasket(WebDriverLibrary webDriverLibrary, WebDriver driver)
	{
		webDriverLibrary.initializeJs(driver);
		webDriverLibrary.scroolTillElement(scroolElement);
		addToBasketBtn.click();
		viewBasketLink.click();
	}
	
}
