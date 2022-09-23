package com.cydeo.test.day3_locators_cssSelector;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getText_cssSelector {

    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify "Log in" button text is as expected
        //Expected: Log In


        // Locate with using cssSelector by type attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        // Locate with using cssSelector by value attribute:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

        // Locate with using cssSelector by class attribute:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        // Locate with using cssSelected by class attribute: with Syntax #2:
        WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick='BX.addClass(this, 'wait');']"));
        
    }
}
