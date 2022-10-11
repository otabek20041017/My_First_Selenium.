package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dropDownTask4() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectState.selectByVisibleText("Illinois");

        Thread.sleep(3000);
        Select selectVirginia = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectVirginia.selectByValue("VA");

        Thread.sleep(3000);
        Select selectCalifornia = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectCalifornia.selectByIndex(5);

        String actualOption = selectCalifornia.getFirstSelectedOption().getText();
        String expectedOption = "California";

        Assert.assertEquals(actualOption, expectedOption, "Final selected option verification is failed!");


        //finding index number from options
        int index = -1;
        for (WebElement eachState : selectState.getOptions()) {
            index++;
            if (eachState.getText().equals("California")) {
                System.out.println(index);
            }
        }

    }


    @Test
    public void dropDownTask7()  throws Exception{
        Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Langauges']")));
        for (WebElement eachLanguage : selectLanguage.getOptions()) {
            eachLanguage.click();
            System.out.println("eachLanguage.getText() = " + eachLanguage.getText());
            Thread.sleep(3000);
        }

        selectLanguage.deselectAll();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

}
