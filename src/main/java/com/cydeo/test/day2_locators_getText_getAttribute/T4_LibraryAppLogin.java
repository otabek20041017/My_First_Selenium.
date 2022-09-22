package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {

    public static void main(String[] args) throws InterruptedException{

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        Thread.sleep(3000);
        //2. Go to https://library2.cydeo.com/login.html
        driver.get("https://library2.cydeo.com/login.html");


        Thread.sleep(3000);
        //3 Enter username: incorrect@email.com"
        WebElement usernameInput = driver.findElement(By.id("inputEmail"));
        usernameInput.sendKeys("incorrect@email.com" + Keys.ENTER);

        Thread.sleep(3000);
        //4. Enter password: "incorrect password"
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password" + Keys.ENTER);


        Thread.sleep(3000);
        //5. Click to Sign in button
        WebElement signinBtn = driver.findElement(By.tagName("button"));
        signinBtn.click();


        driver.quit();


        //6. Verify: visually "Sorry, Wrong Email or Password" displayed
        
    }
}
