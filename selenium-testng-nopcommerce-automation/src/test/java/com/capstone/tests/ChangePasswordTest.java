package com.capstone.tests;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.ChangePasswordPage;
import com.capstone.framework.pages.HomePage;
import com.capstone.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordTest extends BaseTest {

    @Test
    public void PasswordTest() throws InterruptedException {
    	 // Step 1: Go to Login Page
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
   
        // Step 2: Login with valid credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("mas123@gmail.com");   // change with a valid user
        loginPage.enterPassword("12341234");       // change with the right password
        loginPage.clickLogin();
        
        // Verify login
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed!");
        System.out.println("Login successful");

        //Change password
        
        ChangePasswordPage passpage = new ChangePasswordPage(driver);
        passpage.clickOpenMyAccount();
        passpage.enterOldPassword("12341234");
        passpage.enterNewPassword("1234512345");
        passpage.confirNewPassword("1234512345");
        passpage.clickChangePassword();
        

    }
}
