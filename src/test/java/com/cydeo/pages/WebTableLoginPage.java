package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@name='username']")
    public WebElement userNameInput;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement userPasswordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    /**
     * No parameters.
     * When we call this method, it will directly login using
     * Username: Test
     * Password: Tester
     *
     */

    public void login(){
        userNameInput.sendKeys("Test");
        userPasswordInput.sendKeys("Tester");
        submitButton.click();
    }

    /**
     * This method will accept two arguments and login.
     * @param username
     * @param password
     */

    public void login(String username, String password){
        userNameInput.sendKeys(username);
        userPasswordInput.sendKeys(password);
        submitButton.click();
    }

    /**
     * This method will log in using credentials from configuration.properties
     */
    public void loginWithConfig(){
        userNameInput.sendKeys(ConfigurationReader.getProperty(ConfigurationReader.getProperty("webTableUsername")));
        userPasswordInput.sendKeys(ConfigurationReader.getProperty("webTablePassword"));
    }
}
