package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Google {

    WebDriver driver;

    @BeforeMethod
    public void  setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");

    }
    @Test
    public void gmail() throws Exception{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("otabek20041017");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tesla2004");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
    }
}
