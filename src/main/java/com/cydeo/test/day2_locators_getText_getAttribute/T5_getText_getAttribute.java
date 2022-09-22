package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text verification passed!");
        } else {
            System.out.println("Header text verification failed!");
        }

        //4- Locate "First name" input box
        WebElement firstName = driver.findElement(By.name("first name"));



        //5- Verify placeholder attribute's value is as expected: Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstName.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PlaceHolder text verification passed!");
        } else {
            System.out.println("PlaceHolder text verification failed!");
        }
        driver.quit();
    }
}




























