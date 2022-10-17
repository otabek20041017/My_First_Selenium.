package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    //Method #1 info:
    //* Name: login_crm()
    //* Return type: void
    //* Arg1: WebDriver driver
    public static void login_crm(WebDriver driver){

        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("hr@cydeo.com");
        WebElement pass = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        pass.sendKeys("UserUser");

        WebElement logButton = driver.findElement(By.xpath("//input[@type='submit']"));
        logButton.click();
    }

    public static void login_crm(WebDriver driver, String username, String password){

        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys(username);
        WebElement pass = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        pass.sendKeys(password);

        WebElement logButton = driver.findElement(By.xpath("//input[@type='submit']"));
        logButton.click();

    }

}