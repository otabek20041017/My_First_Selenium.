package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();
        // Session

        // making window full screen / maximizing
        driver.manage().window().maximize();

        //3. go to "https://www.google.com/"
        driver.get("https://www.lamborghini.com/en-en/models/aventador");
        

        Thread.sleep(3000);
        // navigate().to() method is loading to url in browser
        driver.navigate().to("https://www.lamborghini.com/en-en/models");
        // stops execution of code for 3 sec
        Thread.sleep(3000);

        // navigate().back() method will take previous page
        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        //System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.navigate().to("https://www.google.com/");
        String currentTitle = driver.getTitle();
        System.out.println("title = " + currentTitle);


        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        Thread.sleep(2000);

        // close() method will close current opened page
        //driver.close();

        // quit() method will close all opened pages
        driver.quit();



        
    }
}
