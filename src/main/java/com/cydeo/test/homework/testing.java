package com.cydeo.test.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testing {

    WebDriver driver;

    @BeforeMethod
    public void setBrowser() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @Test
    public void kun_uz(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("kun uz" + Keys.ENTER);
        driver.findElement(By.xpath("(//h3[contains(@class, 'LC20lb MBeuO DKV0Md')])[1]")).click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        String actual = "Ўзбекистон ва жаҳон янгиликлари, энг сўнгги тезкор хабарлар, қизиқарли мақола, интервью, фото ва видео материаллар - KUN.UZ";
        String expected = driver.getTitle();
        System.out.println(actual);
        System.out.println(expected);
    }
}
