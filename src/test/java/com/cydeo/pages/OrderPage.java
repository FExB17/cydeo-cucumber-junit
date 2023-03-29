package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {
    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;

    @FindBy( name="quantity")
    public WebElement quantityInput;


    @FindBy( name="name")
    public WebElement nameInput;


    @FindBy( name="city")
    public WebElement cityInput;


    @FindBy( name="state")
    public WebElement stateInput;


    @FindBy( name="zip")
    public WebElement zipInput;


    @FindBy( name="street")
    public WebElement streetInput;

    @FindBy (name= "card")
    public List<WebElement> creditCardRadio;

    @FindBy( name="cardNo")
    public WebElement cardNumberInput;

    @FindBy( name="cardExp")
    public WebElement cardExpirationInput;

    @FindBy (xpath= "//button[.='Process Order']")
    public WebElement processOrderButton;



}
