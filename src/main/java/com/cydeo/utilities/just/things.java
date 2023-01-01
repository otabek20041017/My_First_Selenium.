package com.cydeo.utilities.just;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class things {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com");
    }

    @Test
    public void title() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Miki Matsubara - Stay With Me HD (Club Mix)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='video-title'][1]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("(//*[contains(@title, 'Miki Matsubara - Stay With Me HD (Club Mix)')])[1]")).getText();
        System.out.println(title);
    }

    @AfterClass
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        driver.close();
    }
}
// 5 MINUT TANAFUS