package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTableLogin_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        webTableLoginPage.userNameInput.sendKeys(string);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String string) {
        webTableLoginPage.userPasswordInput.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.submitButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyUrlContains("orders");

    }

    @When("user enters username {string} password {string} and logs in")
    public void userEntersUsernamePasswordAndLogsIn(String userName, String password) {
        webTableLoginPage.login(userName, password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
/*      webTableLoginPage.userNameInput.sendKeys(credentials.get("username"));
        webTableLoginPage.userPasswordInput.sendKeys(credentials.get("password"));
        webTableLoginPage.submitButton.click();*/

        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));

    }
}
