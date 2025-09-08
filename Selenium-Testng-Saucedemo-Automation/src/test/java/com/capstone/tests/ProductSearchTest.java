package com.capstone.tests;

import org.testng.annotations.Test;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.LoginPage;
import com.capstone.framework.pages.ProductSearchPage;

public class ProductSearchTest extends BaseTest {
/*
	@Test
	public void login() throws InterruptedException {
		
		// Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
	}
*/
	@Test
	public void productAddedToCart() throws InterruptedException {
		
		// Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        
        //Product Search
        ProductSearchPage product = new ProductSearchPage(driver);
        product.addFirstProductToCart();
        product.addSecondProductToCart();
        product.openCart();
	}
	
	
}
