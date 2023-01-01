package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SpanishMusic {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com");
    }
    @Test
    public void testingSpanishMusic(){
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("N2C ft. Hulk & Hiro Remix (Instrumental)");
        driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("(//*[contains(@title, 'N2C ft. Hulk & Hiro Remix (Instrumental)')])[1]")).click();
        driver.findElement(By.xpath("//*[contains(@title,'Pause (k)')]")).click();
        String spanish_music_name =  driver.findElement(By.xpath("(//yt-formatted-string[starts-with(text(), 'N2C ft. Hulk & Hiro Remix (Instrumental)')])[1]")).getText();
        System.out.println(spanish_music_name);
    }
}

/*
 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("N2C ft. Hulk & Hiro Remix (Instrumental)" + Keys.ENTER);
        driver.findElement(By.xpath("(//*[contains(@title, 'N2C ft. Hulk & Hiro Remix (Instrumental)')])[1]")).click();
 */
