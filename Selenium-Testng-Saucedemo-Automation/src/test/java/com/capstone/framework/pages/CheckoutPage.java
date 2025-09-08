package com.capstone.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By successMsg = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCustomerInfo(String fName, String lName, String zip) throws InterruptedException {
        driver.findElement(firstName).sendKeys(fName);
        Thread.sleep(2000);
        driver.findElement(lastName).sendKeys(lName);
        Thread.sleep(2000);
        driver.findElement(postalCode).sendKeys(zip);
        Thread.sleep(2000);
        driver.findElement(continueBtn).click();
    }

    public void finishCheckout() throws InterruptedException {
        driver.findElement(finishBtn).click();
        Thread.sleep(2000);
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}
