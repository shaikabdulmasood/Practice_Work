package com.capstone.tests;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.HomePage;
import com.capstone.framework.pages.LoginPage;
import com.capstone.framework.pages.ProductSearchPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {
    	 // Step 1: Go to Login Page
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
   
        // Step 2: Login with valid credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("masood123@gmail.com");   // change with a valid user
        loginPage.enterPassword("123123123");       // change with the right password
        loginPage.clickLogin();
        
        // Verify login
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed!");
        System.out.println("Login successful");

        // Step 3: Search for a product
        ProductSearchPage searchPage = new ProductSearchPage(driver);
        searchPage.searchProduct("laptop");   // search keyword
        searchPage.selectFirstProduct();
        searchPage.addToCart();
        searchPage.clickClose();
        System.out.println("Product added to cart");
        
        

    }
}
