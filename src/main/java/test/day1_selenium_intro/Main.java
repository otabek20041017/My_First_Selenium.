package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        //1 - Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2 - Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3 - Test if driver is working
        driver.get("http://www.google.com");
        driver.navigate().to("Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgUIABCABDIICAAQgAQQsQMyBQgAEIAEMgUIABCABDILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOggIABCxAxCDAVAAWNQIYJwKaABwAHgAgAF4iAH3B5IBAzUuNZgBAKABAQ");
    }
}
