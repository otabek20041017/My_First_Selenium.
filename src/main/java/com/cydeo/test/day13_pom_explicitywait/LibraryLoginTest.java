package com.cydeo.test.day13_pom_explicitywait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void required_field_error_message_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Do not enter any information
        //3- Click to "Sign in" button
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();


        //5- Verify expected error is displayed
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErorMsg.isDisplayed());
    }

    @Test
    public void invalid_email_format_error_message_test(){


    }
}
