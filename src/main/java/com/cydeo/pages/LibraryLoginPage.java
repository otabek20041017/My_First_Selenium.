package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        /*
        PageFactory class is a Selenium class that support POM
        It has method called initElement. Once it's called
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErorMsg;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterInvalidEmailErrorMsg;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailAndPasswordErrorMsg;


}

