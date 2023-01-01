package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Translate {

    WebDriver driver;
    @BeforeMethod
    public void setUpDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @Test
    public void translateWords(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("eng uzb translate", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='tw-source-text-ta']")).sendKeys("hello");
        driver.findElement(By.xpath("(//span[contains(@class, 'tw-menu-btn-image z1asCe JKu1je')])[1]")).click();
    }

    @AfterMethod
    public void shuttingDown(){
        driver.quit();
    }
}
