package com.cydeo.test.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ObjectInputFilter;

// This class is the parent of all Test classes
// You will update this class based on what you are keep writing in your most test classes
// instead writing in all test classes, you can just write in this class and you can extends this class from any class
public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // in your work environment you will be navigation same link and you can
        // still usee TestBase class to navigate same page for all test classes
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
