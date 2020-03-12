package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationTests {
    public static void main(String[] args) {
        chromeTest();
        //IETest();

    }

    public static void chromeTest() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title = driver.getTitle();
        String expectedTitle = "Google";

        driver.navigate().to("https://www.etsy.com/");
        String title2 = driver.getTitle();
        String expectedTitle2 = "etsy";

        driver.navigate().back();

        if (expectedTitle.equals(title)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.navigate().forward();

        if (expectedTitle.equals(title2)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.quit();

    }
}
