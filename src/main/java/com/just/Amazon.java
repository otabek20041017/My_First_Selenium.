package com.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Amazon {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    @Test
    public void amazon() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@id, 'twotabsearchtextbox')]")).sendKeys("Create with strip lights", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[starts-with(text(), 'Philips Hue Gradient LightStrip 75')]")).click();
        Thread.sleep(3000);
        String getText = driver.findElement(By.xpath("//*[@id='title']")).getText();
        System.out.println(getText);
        
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
