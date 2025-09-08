package com.capstone.tests;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.*;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E2ERegisterTest extends BaseTest {

    @Test
    public void testEndToEndEcommerceFlow() throws InterruptedException {
        // Step 1: Go to Login Page
        HomePage homePage = new HomePage(driver);
        homePage.clickRegister();

        // Step 2:Registration
        RegisterPage register = new RegisterPage(driver);
        register.selectGenderMale();
        register.enterFirstName("John");
        register.enterLastName("Doe");

        // Generate unique email to avoid duplicate
        //String email = "user25709@example.com";
        String email = "user" + UUID.randomUUID().toString().substring(0,5) + "@example.com"; // New user
        register.enterEmail(email);

        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
        register.clickRegister();

        Thread.sleep(2000); 

        // Verify Register
        Assert.assertTrue(register.isRegisterSuccessful(), "Registration failed!");
        System.out.println("Registration successful");

        // Step 3: Search for a product
        ProductSearchPage searchPage = new ProductSearchPage(driver);
        searchPage.searchProduct("laptop");   // search keyword
        searchPage.selectFirstProduct();
        searchPage.addToCart();
        searchPage.clickClose();
        System.out.println("Product added to cart");

        // Step 4: Proceed to cart
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOpenCart();
        cartPage.clikAcceptTerm();
        cartPage.proceedToCheckout();
        System.out.println("Navigated to cart and proceeding to checkout");   

        //complete checkout process
        
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedThroughCheckout();

        // Step 6: Assert order confirmation page
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Your order"), "Order not confirmed!");
        System.out.println("Order placed successfully!");
    }
}
