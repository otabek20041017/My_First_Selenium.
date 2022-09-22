package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {

    public static void main(String[] args) throws InterruptedException {


//        TC #1: Etsy Title Verification
//        1. Open Chrome browser
//        2. Go to https://www.etsy.com
//        3. Search for “wooden spoon”
//        4. Verify title:
//        5. Expected: “Wooden spoon | Etsy


        
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //2. Go to https://www.etsy.com
        driver.get(" https://www.etsy.com");

        //3. Search for “wooden spoon”
        Thread.sleep(3000);
        WebElement searchItem = driver.findElement(By.id("global-enhancements-search-query"));
        searchItem.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedResult = "Wooden spoon - Etsy";
        String actualResult = driver.getTitle();

        if (expectedResult.equals(actualResult)) {
            System.out.println("Title is Correct");
        } else {
            System.out.println("Title is Incorrect");
        }

        Thread.sleep(4000);
        driver.quit();



               
        
        

    }
}
