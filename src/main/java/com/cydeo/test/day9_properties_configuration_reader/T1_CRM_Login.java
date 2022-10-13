package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_CRM_Login {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://login1.nextbasecrm.com/");
    }
    @Test
    public void crm_login_test() {
        //3. Enter valid username //h4
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("hr2@cydeo.com");

        //4. Enter valid password // UserUser
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }
}
