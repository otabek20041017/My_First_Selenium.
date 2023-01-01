package com.cydeo.test.homework;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class youtube_musics {

    WebDriver driver;
    @BeforeMethod
    public void setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://youtube.com");
    }

    @Test
    public void set() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Martin Garrix - Forbidden Voices (Official Music Video)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.xpath("(//*[starts-with(@title, 'Martin Garrix - Forbidden Voices (Official Music Video)')])[3]")).getText();
        System.out.println(text);
    }
}
