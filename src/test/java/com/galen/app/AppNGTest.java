package com.galen.app;

import java.util.logging.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppNGTest {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ; 
     
    @Test
    public void verifyHomepageTitle() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        System.out.println("TEST2 ----> Im already runing TestNG Test!!!");

        /* 
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
        /**/

    }


    @Test
    public void googleSearch(){

        System.out.println("TEST1 ----> Im already runing TestNG Test!!!");

        try {
            // System.out.println( "Hello World!" );

            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "D:/Sopra/04.Downloads/chromedriver_win32_79/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("http://www.google.com/");

            Thread.sleep(5000); // Let the user actually see something!
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("ChromeDriver"); searchBox.submit();
            
            Thread.sleep(5000); // Let the user actually see something!
            driver.quit();
        } catch (Exception e) {
            System.out.println("exception has occurred");
            e.printStackTrace();
            
        }

    }
}