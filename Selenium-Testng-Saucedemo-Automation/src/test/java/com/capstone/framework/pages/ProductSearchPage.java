package com.capstone.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearchPage {
    private WebDriver driver;

    private By productTitle = By.className("title");
    private By firstAddToCartBtn = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    private By secondAddToCartBtn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductSearchPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        Thread.sleep(2000);
    }

    public String getTitle() {
        return driver.findElement(productTitle).getText();
    }

    public void addFirstProductToCart() throws InterruptedException {
        driver.findElement(firstAddToCartBtn).click();
        Thread.sleep(2000);
    }
    
    public void addSecondProductToCart() throws InterruptedException {
    	driver.findElement(secondAddToCartBtn).click();
    	Thread.sleep(2000);
    }

    public void openCart() throws InterruptedException {
        driver.findElement(cartIcon).click();
        Thread.sleep(2000);
    }
}
