package com.galen.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Test;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            // System.out.println( "Hello World!" );

            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("http://www.google.com/");

            Thread.sleep(5000); // Let the user actually see something!
            /*
             * WebElement searchBox = driver.findElement(By.name("q"));
             * searchBox.sendKeys("ChromeDriver"); searchBox.submit(); /
             **/
            Thread.sleep(5000); // Let the user actually see something!
            driver.quit();
        } catch (Exception e) {
            System.out.println("exception has occurred");
        }

    }
}