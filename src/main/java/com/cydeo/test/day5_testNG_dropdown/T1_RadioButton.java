package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_RadioButton {

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to "Hockey" radio button
        WebElement hokeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hokeyButton.click();

        System.out.println("hokeyButton.isSelected() = " + hokeyButton.isSelected());

        //4. Verify "Hockey" radio button is selected after clicking
        if (hokeyButton.isSelected()) {
            System.out.println("Hokey button is Selected!");
        } else {
            System.out.println("Hokey button is not Selected!");

        }

        //Test all radio buttons if they are clickable
        List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachSport : sportRadioBtns) {
            eachSport.click();
            if (eachSport.isSelected()){
                System.out.println(eachSport.getAttribute("id") + "Radio button is selected");
            } else {
                System.out.println("All sport radio buttons are not Selected!");
            }
        }

        Thread.sleep(4000);
        // After the automation you need write driver.quit();
        driver.quit();
    }
}