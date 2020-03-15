package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String > urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        for (String url: urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(url);

            if(url.contains("http://practice.cybertekschool.com")){
                System.out.println("Test passed");
            }

            driver.quit();
        }
    }
}
