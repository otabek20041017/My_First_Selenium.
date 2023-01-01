package com.cydeo.utilities.just;

import com.beust.ah.A;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Drag_And_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/drag_and_drop");
    }

    @Test
    public void drag_drop_down() throws InterruptedException{
      WebElement drag1 = driver.findElement(By.xpath("//div[@id='column-a']"));
      WebElement drop = driver.findElement(By.xpath("//div[@id='column-b']"));
      Actions actions = new Actions(driver);
      Thread.sleep(3000);
      actions.clickAndHold(drag1).build().perform();
      Thread.sleep(3000);
      actions.moveToElement(drop).build().perform();
      Thread.sleep(3000);
      actions.release(drop).build().perform();
    }
}
