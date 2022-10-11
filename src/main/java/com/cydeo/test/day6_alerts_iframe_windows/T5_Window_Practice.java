package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class T5_Window_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }


    @Test
    public void windowTask(){

        //4. Assert: Title is "Windows
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Before opening new page window " + actualTitle);

        //5. Click to: "Click Here" link
        WebElement clickHereBtn = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHereBtn.click();

        actualTitle = driver.getTitle();
        System.out.println("After opening new page window " + actualTitle);

        //6. Switch to new Window.
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            driver.getTitle();
        }
        
        actualTitle = driver.getTitle();
        String actualTitleWindows = "New Window";

        Assert.assertEquals(actualTitleWindows, actualTitle);

        
    }
}
