package com.capstone.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capstone.framework.core.BaseTest;
import com.capstone.framework.pages.AddressPage;
import com.capstone.framework.pages.HomePage;
import com.capstone.framework.pages.LoginPage;

public class AddressTest extends BaseTest {
	
	@Test
	public void addNewAddress() throws InterruptedException {
		// Go to login page
        HomePage home = new HomePage(driver);
        home.clickLogin();
   
        LoginPage login = new LoginPage(driver);
        login.enterEmail("masood123@gmail.com");
        login.enterPassword("123123123");
        login.clickLogin();
     // Verify login
        Assert.assertTrue(login.isLoginSuccessful(), "Login failed!");
        System.out.println("Login successful");
        
	// Open Address Page
    AddressPage addressPage = new AddressPage(driver);

    // Navigate to "My Account -> Addresses -> Add New"
    addressPage.clickOpenAddresses();

    // Fill Address Form
    addressPage.enterFirstName("Abdul");
    addressPage.enterLastName("Masood");
    String email = "masood123@gmail.com";
    addressPage.enterEmail(email);
    addressPage.selectCountry(); // Select India
    addressPage.selectState();   // Select Andhra Pradesh
    addressPage.enterCity("Hyderabad");
    addressPage.enterFirstAddress("123 Test Street");
    addressPage.enterPostalCode("500001");
    addressPage.enterPhoneNumber("9876543210");

    // Click Save
    addressPage.clickSave();

    // Assert Result
    if (addressPage.isAddressSaved()) {
        System.out.println("Address saved successfully!");
        Assert.assertTrue(true);
    } else {
        String error = addressPage.getAddressSaveErrorMessage();
        System.out.println("Address save failed: " + error);
        Assert.fail("Address save failed: " + error);
    }
}	
	
}
