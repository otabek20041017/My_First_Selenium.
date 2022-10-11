package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class Testtesttest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }

    @Test
    public void googleThings() throws Exception {

        Thread.sleep(3000);
        WebElement search = driver.findElement(xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys("Uyghur Lagman" + Keys.ENTER);

        Thread.sleep(3000);
        WebElement site = driver.findElement(xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        site.click();

        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        String actualResult = "Uyghur Noodles Home Style Leghman Recipe — DolanChick";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Title verification is passed!");
        } else {
            System.out.println("Title verification is failed!");
        }

        Thread.sleep(3000);
        // WebElement video = driver.findElement(By.xpath("(//*[contains(@aria-label, 'Watch on YouTube')])"));
        WebElement clickBtn = driver.findElement(By.xpath("//iframe[contains(@title, 'How to make Uyghur-Style Hand-pulled Noodle Homemade Lagman Recipe How to Make Handmade Spaghetti')]"));
        clickBtn.click();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("(//*[contains(@title, 'Pause (k)')])[1]")).click();

        // By.xpath("(//*[contains(@aria-label, 'Watch on YouTube')])"
    }

    @AfterMethod
    public void quitSetup() throws Exception{
        Thread.sleep(2000);
        driver.quit();
    }


}
