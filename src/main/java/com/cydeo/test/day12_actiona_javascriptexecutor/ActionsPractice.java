package com.cydeo.test.day12_actiona_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task_4_and_5_test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to "Powered by CYDEO"
        Actions actions = new Actions(Driver.getDriver());

        //4- Scroll using Actions class "moveTo(element)" method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).perform();


        BrowserUtils.sleep(3);
        //2- Scroll back up to "Home" talk using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();
    }
}
