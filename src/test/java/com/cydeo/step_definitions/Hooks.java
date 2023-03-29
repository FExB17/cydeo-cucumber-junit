package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.sl.In;
import org.junit.runners.Parameterized;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // In this class we will be able to pass pre- & post-conditions to each scenario and each step

    // import it from cucumber not junit
   // @Before
    public void setupScenario() {
        System.out.println("=== Setting up browser using cucumber @Before");
    }


    // @Before ("@login")
    public void setupScenarioForlogins() {
        System.out.println("=== Setting up browser using cucumber @Before");
    }


    //  @Before ("@db")
    public void setupForDatabaseScenarios() {
        System.out.println("=== Setting up browser using cucumber @Before");
    }


    @After
    public void teardownScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        //BrowserUtils.waitFor(10);
        Driver.closeDriver();
    }

    //  @BeforeStep
    public void setupStep() {
        System.out.println("------ applying setup using @BeforeSetup");
    }


    //   @AfterStep
    public void afterStep() {
        System.out.println("------ applying tearDown using AfterStep");
    }


}
