package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class dell {

    WebDriver driver;
    @BeforeMethod
    public void setting(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }

    @Test
    public void dell() throws Exception{
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("dell" + Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='Computers, Monitors & Technology Solutions | Dell USA']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 5000; i += 7) {
            js.executeScript("window.scrollTo(0, " + i + ")");



        }
        WebElement clickable = driver.findElement(By.xpath("(//figure[@class='dds__m-0'])[4]"));
        new Actions(driver)
                .clickAndHold(clickable)
                .perform();

        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[contains(@class, 'dds__link--standalone')])[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@data-testid='subCategory'])[24]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(@target, '_self')])[14]")).click();
        Thread.sleep(3000);
        String name = driver.findElement(By.xpath("//div[@class='pg-title']/h1")).getText();
        System.out.println(name);
    }
}
