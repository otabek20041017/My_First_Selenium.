package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class otabek {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void testing_bmw(){
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("Uyghur Manti" + Keys.ENTER);
        driver.findElement(By.xpath("//h3[contains(text(), 'Manti Steamed Dumplings - Peter')]")).click();
        driver.getTitle();
        String text = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        System.out.println(text);
    }
}
