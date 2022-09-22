package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.sql.DriverManager.getDriver;

public class Back_and_forth_navigation {

    public static void main(String[] args) throws InterruptedException {


//        1- Open a chrome browser
//        2- Go to: https://google.com
//        3- Click to Gmail from top right.
//        4- Verify title contains:
//        Expected: Gmail
//        5- Go back to Google by using the .back();
//        6- Verify title equals:
//        Expected: Google
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-GB");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //2- Go to: https://google.com
        driver.get("https://google.com");

        WebElement gmailClick = driver.findElement(By.className("gb_d"));
        
        


        }
        
    }

