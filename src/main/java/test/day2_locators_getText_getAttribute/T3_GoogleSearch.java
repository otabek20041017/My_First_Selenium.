package test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException{

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        Thread.sleep(3000);
        //3- Write "apple" in search box
        //4- use Keys.ENTER to search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(3000);
        //5- Verify title: Expected: Title should start with "apple" word
        String expectedTitle = "apple";
        String actualTittle = driver.getTitle();
        if (actualTittle.startsWith(expectedTitle)){
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }

        driver.quit();

    }
}
