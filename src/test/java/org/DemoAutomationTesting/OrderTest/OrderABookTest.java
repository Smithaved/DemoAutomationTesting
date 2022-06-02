package org.DemoAutomationTesting.OrderTest;

import org.testng.annotations.Test;

import com.DemoAutomationTesting.ElementRepository.BasketPage;
import com.DemoAutomationTesting.ElementRepository.CheckoutPage;
import com.DemoAutomationTesting.ElementRepository.HomePage;
import com.DemoAutomationTesting.ElementRepository.ProductDetailPage;
import com.DemoAutomationTesting.GenericUtility.BaseClass;

public class OrderABookTest extends BaseClass{
@Test
public void orderABookTest()
{
	String firstName = fileLibrary.getTestData("Order", 2, 1);
	String lastName=fileLibrary.getTestData("Order", 2, 2);
	String email=fileLibrary.getTestData("Order", 2, 3);
	String phoneno=fileLibrary.getTestData("Order", 2, 4);
	String address=fileLibrary.getTestData("Order", 2, 5);
	String city=fileLibrary.getTestData("Order", 2, 6);
	String state=fileLibrary.getTestData("Order", 2, 7);
	String pincode=fileLibrary.getTestData("Order", 2, 8);
	HomePage homePage=new HomePage(driver);
	ProductDetailPage productDetailPage=new ProductDetailPage(driver);
	BasketPage basketPage=new BasketPage(driver);
	CheckoutPage checkoutPage=new CheckoutPage(driver);
	homePage.clickOnBook(webDriverLibrary, driver);
	productDetailPage.addToBasket(webDriverLibrary, driver);
	basketPage.procedToCheckout(webDriverLibrary, driver);
	checkoutPage.enterTheDetail(firstName, lastName, email, phoneno, address, city, state, pincode);	
}
}
