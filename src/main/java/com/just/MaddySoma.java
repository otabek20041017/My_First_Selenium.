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

public class MaddySoma {

    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void testOKE() throws Exception {
        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("maddy soma oke");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("(//*[contains(text(), 'Maddy Soma - OKE')])[1]")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("(//yt-formatted-string[contains(text(), 'Maddy Soma - OKE')])")).getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(@title, 'Pause (k)')]")).click();

    }

    @AfterMethod
    public void quitBrowser() {
        driver.close();
    }
}
