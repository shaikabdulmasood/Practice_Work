package com.capstone.tests;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.CartPage;
import com.capstone.framework.pages.HomePage;
import com.capstone.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() throws InterruptedException {
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

       //cart page
        
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOpenCart();
        cartPage.clikAcceptTerm();
        cartPage.proceedToCheckout();
        System.out.println("Navigated to cart and proceeding to checkout");        
        

    }
}
