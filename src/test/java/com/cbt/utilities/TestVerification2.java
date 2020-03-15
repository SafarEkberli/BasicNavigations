package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TestVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://wayfair.com","https://walmart.com","https://westelm.com/");
        for (String url :urls){
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(url);


            url = url.replace("https://","");
            String result = driver.getTitle();

            if (url.equalsIgnoreCase(result)){
                System.out.println("Test Passed");

            }else {
                System.out.println("Test Failed");
            }

            driver.quit();
        }

    }
}
