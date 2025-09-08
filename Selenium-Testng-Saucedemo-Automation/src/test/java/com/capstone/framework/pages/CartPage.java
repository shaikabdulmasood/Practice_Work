package com.capstone.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By openCart = By.className("shopping_cart_link");
    private By checkoutBtn = By.id("checkout");

    public CartPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        Thread.sleep(2000);
    }

    public void openCart() throws InterruptedException {
    	driver.findElement(openCart).click();
    	Thread.sleep(2000);
    }

    public void proceedToCheckout() throws InterruptedException {
        driver.findElement(checkoutBtn).click();
        Thread.sleep(2000);
    }
}
