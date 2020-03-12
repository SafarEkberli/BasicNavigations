package com.cbt.utilities;

public class StringUtilities {

    public static void verifyEquals(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }
    }
}
