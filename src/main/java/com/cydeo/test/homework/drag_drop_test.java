package com.cydeo.test.homework;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class drag_drop_test {

    @Test
    public void drag_and_drop_test() {
        Driver.getDriver().navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement acceptCookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();
        WebElement circle = Driver.getDriver().findElement(By.cssSelector("div#draggable"));
        WebElement areaToDrop = Driver.getDriver().findElement(By.cssSelector("div#droptarget"));
        Actions actions = new Actions(Driver.getDriver());
        //actions.clickAndHold(circle).moveToElement(areaToDrop).release().perform();
        //while (true) {
        actions.dragAndDrop(circle, areaToDrop).perform();
        String expected = "You did great!";
        //}
        org.testng.Assert.assertEquals(areaToDrop.getText(), expected, areaToDrop.getText());
    }
}
