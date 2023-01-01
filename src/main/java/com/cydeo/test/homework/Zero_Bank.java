//package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class Zero_Bank {

//    1. Open Chrome browser
//2. Go to http://zero.webappsecurity.com/login.html
//            3. Verify header text
//    Expected: “Log in to ZeroBank

//    public static void main(String[] args) throws InterruptedException {
//
//        WebDriverManager.chromedriver().setup();
//        //1. Open Chrome browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//        //2. Go to http://zero.webappsecurity.com/login.html
//        driver.get("http://zero.webappsecurity.com/login.html");
//
//        String expectedTitle = "Zero - Log in";
//        String actualTitle = driver.getTitle();
//
//        if (expectedTitle.equals(actualTitle)){
//            System.out.println("Title is verification passed!");
//        } else {
//            System.out.println("Title is verification failed!");
//        }
//
//        Thread.sleep(2000);
//        driver.quit();
//    }
//}
