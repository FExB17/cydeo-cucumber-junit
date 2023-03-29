package com.cydeo.pages;

import static com.cydeo.utilities.Driver.getDriver;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class GoogleSearchPage {
    public GoogleSearchPage() {
        PageFactory.initElements(getDriver(), this);

    }

    @FindBy(xpath = "//div[.='Alle akzeptieren']")
    public WebElement acceptCookiesButton;

    @FindBy(name ="q")
    public WebElement searchBox;




}
