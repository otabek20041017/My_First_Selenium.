package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class tesla {

    WebDriver driver;

    @BeforeMethod
    public void setDrivers() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tesla.com");
    }

    @Test
    public void tesla() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i <= 300; i += 7) {
            js.executeScript("window.scrollTo(0, " + i + ")");

        }

        driver.findElement(By.xpath("(//*[@class='tds-icon tds-icon-chevron-filled-180'])[1]")).click();
        for (int j = 0; j < 3000; j+= 6) {
            js.executeScript("word.scrollTo(0, " + j + ")");
        }
    }

}
