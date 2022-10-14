package com.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WorldOfTanks {

    WebDriver driver;

    @BeforeMethod
    public void setDrivers(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
    @Test
    public void world_of_tanks(){
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("World Of Tanks" + Keys.ENTER);
        driver.findElement(By.xpath("(//cite[contains(text(), 'https://worldoftanks.ru')])[1]")).click();
        driver.findElement(By.xpath("//*[@class='js-cta-button button-link button-link__primary button-link__large']")).click();
    }
}
