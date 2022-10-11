package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_SelectingDate {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethd(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void select(){
        driver.get("https://practice.cydeo.com/dropdown");


//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1923");

        year.getAllSelectedOptions();


        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");
        
//        3. Select “December 1st, 1923” and verify it is selected.
//                Select year using : visible text
//        Select month using : value attribute Select
//        day using : index number


        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);


        
    }
}
