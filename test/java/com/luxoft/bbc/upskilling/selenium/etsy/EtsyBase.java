package com.luxoft.bbc.upskilling.selenium.etsy;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class EtsyBase {
    protected static WebDriver webDriver;


    @BeforeAll
    public static void seUp(){
        ChromeOptions opt = new ChromeOptions();

        webDriver = new ChromeDriver(opt);

//        webDriver.manage().deleteAllCookies();

//        Set<Cookie> allCookies = webDriver.manage().getCookies();
//        for (Cookie cookie : allCookies) {
//            webDriver.manage().deleteCookieNamed(cookie.getName());
//        }

        System.out.println("1");
    }

    @AfterAll
    public static void tearDown(){
        webDriver.quit();
    }
}
