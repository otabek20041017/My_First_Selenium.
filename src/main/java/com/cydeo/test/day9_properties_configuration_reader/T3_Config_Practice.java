package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class T3_Config_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void google_search_test_using_properties(){
         //2- Go to: https://www.google.com
        driver.get("https://www.google.com");

        //3- Write "apple" in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("apple" +  Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple - Google qidiruvi";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
