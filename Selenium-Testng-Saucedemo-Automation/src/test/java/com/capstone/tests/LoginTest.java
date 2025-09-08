package com.capstone.tests;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.LoginPage;
import com.capstone.framework.pages.ProductSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidUser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductSearchPage productsPage = new ProductSearchPage(driver);
        Assert.assertEquals(productsPage.getTitle(), "Products");
    }

    @Test
    public void loginWithInvalidUser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "wrong_pass");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
    }
}
