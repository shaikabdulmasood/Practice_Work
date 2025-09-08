package com.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.CartPage;
import com.capstone.framework.pages.CheckoutPage;
import com.capstone.framework.pages.LoginPage;
import com.capstone.framework.pages.ProductSearchPage;

@Test
public class E2ELogin2CheckoutTest extends BaseTest {
	
	 public void completeCheckoutFlow() throws InterruptedException {
	        // Login
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("standard_user", "secret_sauce");

	        // Add product
	        ProductSearchPage productsPage = new ProductSearchPage(driver);
	        productsPage.addFirstProductToCart();
	        productsPage.addSecondProductToCart();

	        // Open Cart
	        CartPage cartPage = new CartPage(driver);
	        cartPage.openCart();
	        cartPage.proceedToCheckout();

	        // Fill details & finish checkout
	        CheckoutPage checkoutPage = new CheckoutPage(driver);
	        checkoutPage.enterCustomerInfo("Shaik", "Abdul", "12345");
	        checkoutPage.finishCheckout();

	        // Verify success
	        Assert.assertEquals(checkoutPage.getSuccessMessage(), "Thank you for your order!");
	    }
}
