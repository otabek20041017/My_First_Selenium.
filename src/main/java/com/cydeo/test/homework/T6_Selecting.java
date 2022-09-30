package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_Selecting {

    WebDriver driver;

    //1. Open Chrome browser
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void nonSelectDropDown(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropDown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        dropDown.click();

      WebElement selectDropDown = driver.findElement(By.xpath("//a[@class='dropdown-item'][4]"));
      selectDropDown.click();


      String expectedResult = "Facebook - log in or sign up";
      String actualResult = driver.getTitle();

      if (expectedResult.equals(actualResult)){
          System.out.println("Title verification is passed!");
      } else {
          System.out.println("Title verification is failed!");
      }

        Assert.assertEquals(expectedResult, actualResult,"Title is true");
        
    }

//2. Go to https://practice.cydeo.com/dropdown
//            3. Click to non-select dropdown
//4. Select Facebook from dropdown
//5. Verify title is “Facebook - Log In or Sign Up”
}
