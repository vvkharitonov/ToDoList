package com.luxoft.bbc.upskilling.selenium.etsy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.*;

public class EtsyEmptyCartTest extends EtsyBase{

    private final String PRIVACY_POLICY_FORM="/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/button";
    private final String SHOPPING_CART_ICON=".etsy-icon-cart";
    private final String EMPTY_CART_HEADER="//*[@id=\"newempty\"]/div";

    @Test
    public void shoppingCartIsEmptyOnFirstLoad(){

        webDriver.get("http://www.etsy.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        WebElement acceptButton = webDriver.findElement(By.xpath(PRIVACY_POLICY_FORM));
        acceptButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        webDriver.findElement(By.cssSelector(SHOPPING_CART_ICON)).click();;

        Assertions.assertTrue(webDriver.findElement(By.xpath(EMPTY_CART_HEADER)).isDisplayed());


    }
}
