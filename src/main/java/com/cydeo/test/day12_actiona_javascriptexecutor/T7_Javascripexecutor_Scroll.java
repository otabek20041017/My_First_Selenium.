package com.cydeo.test.day12_actiona_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Javascripexecutor_Scroll {

    @Test
    public void task7_javascriptexecutor_scroll_test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        // We have to do downcasting(typecasting) to JavascriptExecutor interface
        // for using methods coming from this interface
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

        // Locate both "Cydeo" and "Home" links
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        BrowserUtils.sleep(3);

        //3- Scroll down to "Cydeo" link
        //js.executeScrip("arguments[0].scrollIntoView(true),cydeoLink,homeLink");
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink, homeLink);

        BrowserUtils.sleep(2);

        //4- Scroll up to "Home" link
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink,homeLink);
    }
}
