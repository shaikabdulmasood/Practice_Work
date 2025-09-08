package com.capstone.tests;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.CartPage;
import com.capstone.framework.pages.CheckoutPage;
import com.capstone.framework.pages.LoginPage;
import com.capstone.framework.pages.ProductSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutFlow() throws InterruptedException {
        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add product
        ProductSearchPage productsPage = new ProductSearchPage(driver);
        productsPage.addFirstProductToCart();
        productsPage.openCart();

        // Proceed to checkout
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        // Fill details & finish checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCustomerInfo("John", "Doe", "12345");
        checkoutPage.finishCheckout();

        // Verify success
        Assert.assertEquals(checkoutPage.getSuccessMessage(), "Thank you for your order!");
    }
}
