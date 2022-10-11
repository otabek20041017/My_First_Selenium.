package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class YouTube {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.getTitle();
    }

    @Test
    public void METHOD() throws InterruptedException {

        Thread.sleep(3000);
        WebElement searchYtB = driver.findElement(By.xpath("//input[@id='search']"));
        searchYtB.sendKeys("Eminem");


        Thread.sleep(3000);
        WebElement clickSearchYTBbtn = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        clickSearchYTBbtn.click();

        Thread.sleep(4000);
        WebElement clickVideo = driver.findElement(By.xpath("(//*[@class='style-scope ytd-video-renderer'])[1]"));
        clickVideo.click();


//        String expectedResult = "Eminem - Lose Yourself [HD]";
        String expectedResult = driver.findElement(By.xpath("(//a[contains(@title,'Eminem - Lose Yourself [HD]')])[1]")).getText();
        System.out.println(expectedResult);

        String exPectedResult = expectedResult;
        String actualResult = "Eminem - Lose Yourself[HD]";
        




//        //(//*[@class='style-scope ytd-watch-metadata'])[7]
//
        if (exPectedResult.contentEquals(actualResult)) {
            System.out.println("Text is common with on Youtube");
        } else {
            System.out.println("Text is not common with on Youtube");
        }

        
        


    }

    @AfterMethod
    public void close() throws Exception {

        Thread.sleep(5000);
        driver.quit();
    }
}
