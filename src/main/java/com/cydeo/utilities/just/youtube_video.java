package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class youtube_video {

    WebDriver driver;

    @BeforeMethod
    public void setDrivers() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com");
    }

    @Test
    public void testing() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("BMW M5 F90");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(), '1000HP BMW M5 F90 REVIEW ON AUTOBAHN [NO SPEED LIMIT] by AutoTopNL')]")).click();
        driver.findElement(By.xpath("//*[contains(@title, 'Pause (k)')]")).click();
        String videos_name = driver.findElement(By.xpath("(//*[contains(text(), '1000HP BMW M5 F90 REVIEW ON AUTOBAHN [NO SPEED LIMIT] by AutoTopNL')])[4]")).getText();
        System.out.println(videos_name);
        System.out.println("Website's Title = " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
/*
//*[contains(text(), '1000HP BMW M5 F90 REVIEW ON AUTOBAHN [NO SPEED LIMIT] by AutoTopNL')]
 */
