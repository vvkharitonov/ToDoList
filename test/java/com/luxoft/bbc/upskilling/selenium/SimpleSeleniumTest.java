package com.luxoft.bbc.upskilling.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.xml.ws.WebEndpoint;

public class SimpleSeleniumTest {
    private static WebDriver webDriver;

    @BeforeAll
    public static void seUp(){
        ChromeOptions opt = new ChromeOptions();

        webDriver = new ChromeDriver(opt);

    }


    @Test
    public void googleComSimpleTest(){
        String address ="http://www.google.com";
        webDriver.get(address);
        Assertions.assertTrue(webDriver.getTitle().equals("Google"));
        WebElement searchField = webDriver.findElement(By.name("q"));
//        searchField.sendKeys("Selenium"+ Keys.ENTER);
        searchField.sendKeys("Selenium");
        searchField.submit();


        Assertions.assertTrue(webDriver.getTitle().contains("Selenium"));

    }


    @AfterAll
    public static void tearDown(){
        webDriver.quit();
    }
}
