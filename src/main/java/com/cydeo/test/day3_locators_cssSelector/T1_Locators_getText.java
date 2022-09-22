package com.cydeo.test.day3_locators_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {

    public static void main(String[] args) throws InterruptedException{

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        Thread.sleep(2000);
        //3- Enter incorrect username: "incorrect"
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");

        Thread.sleep(3000);
        //4- Enter incorrect password: "incorrect"
        // Mac: option + enter
        // windows: alt + enter
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));

        Thread.sleep(3000);
        //5- Click to login button
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Error message verification passed!");
        } else {
            System.out.println("Error message verification failed!");
        }

        driver.quit();
    }
}
