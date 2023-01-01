package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class etsy {

    WebDriver driver;
    @BeforeMethod
    public void testNG(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bbc.com/news");
    }

    @Test
    public void testing_elements() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 3250; i+= 7) {
            js.executeScript("window.scrollTo(0, " + i + ")");
        }
        driver.findElement(By.xpath("(//h3[contains(@class, 'gs-c-promo-heading__title gel-double-pica-bold nw-o-link-split__text')])[2]")).click();

    }
}
