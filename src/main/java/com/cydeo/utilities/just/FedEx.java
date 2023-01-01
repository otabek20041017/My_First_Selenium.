package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FedEx {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void testing_google_dishes() {
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Jjamppong" + Keys.ENTER);
        driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[5]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 3000; i += 7) {
            js.executeScript("window.scrollTo(0, " + i + ")");
        }
    }
}
