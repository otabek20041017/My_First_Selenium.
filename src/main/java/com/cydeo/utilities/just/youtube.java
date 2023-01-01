package com.cydeo.utilities.just;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class youtube {
    WebDriver driver;
    @BeforeMethod
    public void tesing(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com");
    }

    @Test
    public void werr() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("AK 47");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(), 'AK-47.')]")).click();
        Thread.sleep(2000);
        String name = driver.findElement(By.xpath("(//a[contains(@aria-label, 'AK-47.')])[1]")).getText();
        System.out.println(name);
    }

    @AfterClass
    public void tearDown()throws InterruptedException{
        Thread.sleep(4000);
        driver.quit();
    }

}
