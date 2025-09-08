package com.capstone.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMsg = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        Thread.sleep(2000);
    }

    public void login(String user, String pass) throws InterruptedException {
        driver.findElement(username).sendKeys(user);
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(pass);
        Thread.sleep(2000);
        driver.findElement(loginBtn).click();
        Thread.sleep(2000);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }
}
