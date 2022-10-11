package com.cydeo.test.day7.windows_webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_windows() {
        String expectedTitle = driver.getTitle();
        String actualTitle = "Windows";

        Assert.assertEquals(actualTitle, expectedTitle, "FALSE");

        //4. Click to: "Click Here" link
        WebElement clickHere = driver.findElement(By.xpath("//div[@class='example']/h3/../a"));
        clickHere.click();

        //5. Click to: "CYDEO" link
        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        cydeoLink.click();

        //6. Switch to Cydeo page
        Set<String> allWindows = driver.getWindowHandles();

        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }


        //7. Assert: Title is "Cydeo"

        Assert.assertEquals(driver.getTitle(), "Cydeo");

        //7. Assert: Title is "Cydeo"


    }

    @AfterMethod
    public void shutDown() {
        driver.quit();
    }
}
