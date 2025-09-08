package com.capstone.tests;

import org.testng.annotations.Test;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.CartPage;
import com.capstone.framework.pages.LoginPage;

public class CartTest extends BaseTest {
/*
	@Test
	public void login() throws InterruptedException {
		
		// Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
	}
*/
	@Test
	public void openChekoutPage() throws InterruptedException {
		// Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
		// Add product
        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();
        cartPage.proceedToCheckout();
	}
}
