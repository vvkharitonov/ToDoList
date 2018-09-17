package com.luxoft.bbc.upskilling.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
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
    }


    @AfterAll
    public static void tearDown(){
        webDriver.quit();
    }
}
