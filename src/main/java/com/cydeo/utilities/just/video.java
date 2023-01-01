package com.cydeo.utilities.just;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class video {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");

    }

    @Test
    public void youTube() throws Exception {


        Thread.sleep(3000);
        WebElement searchEngine = driver.findElement(By.xpath("//input[@id='search']"));
        searchEngine.sendKeys("اجمل اغنية تركية ( لا لا لاااا لا لا ) كاملة مترجمه عربي");

        Thread.sleep(3000);
        WebElement clickSearch = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        clickSearch.click();

        Thread.sleep(3000);
        WebElement clickVideo = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
        clickVideo.click();


        String expectText = driver.findElement(By.xpath("(//a[contains(@title, 'اجمل اغنية تركية ( لا لا لاااا لا لا ) كاملة مترجمه عربي')])[1]")).getText();
        System.out.println(expectText);
    }
}
