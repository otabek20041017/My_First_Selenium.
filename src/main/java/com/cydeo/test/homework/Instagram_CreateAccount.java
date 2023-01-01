package com.cydeo.test.homework;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Instagram_CreateAccount {

    WebDriver driver;
    @BeforeMethod
    public void  setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test1() throws Exception{
        driver.get("https://www.instagram.com");


        WebElement signUp = driver.findElement(By.xpath("//*[@class='_aacl _aaco _aacw _aad0 _aad7']"));
        signUp.click();

        Thread.sleep(3000);
        WebElement mobileOrEmail = driver.findElement(By.xpath("(//input[contains(@class, '_aa4b _add6 _ac4d')])[1]"));
        mobileOrEmail.sendKeys("+998940560581");

        Thread.sleep(3000);
        WebElement fullName = driver.findElement(By.xpath("//input[@aria-label='Full Name']"));
        fullName.sendKeys("Otabek Yusuf");

        Thread.sleep(3000);
        WebElement userName = driver.findElement(By.xpath("//input[@aria-label='Username']"));
        userName.sendKeys("otabekyusuf17");

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[contains(@aria-label, 'Password')]"));
        password.sendKeys("Nodirbek1969");

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='_acan _acap _acas _aj1-'])[2]")).click();

        Thread.sleep(2000);
        Select months = new Select(driver.findElement(By.xpath("(//select[@class='_aau-'])[1]")));
        months.selectByVisibleText("October");

        Select days = new Select(driver.findElement(By.xpath("(//select[@class='_aau-'])[2]")));
        days.selectByValue("17");

        Select year = new Select(driver.findElement(By.xpath("(//select[@class='_aau-'])[3]")));
        year.selectByIndex(18);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_acan _acap _acaq _acas _aj1-']")).click();
    }

//    @AfterMethod
//    public void tearDown() throws Exception {
//        Thread.sleep(3000);
//        driver.quit();
//    }
}
