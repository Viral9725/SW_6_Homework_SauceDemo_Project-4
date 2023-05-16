package com.saucedemo.steps;

import com.saucedemo.cucumber.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I enter Username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new LoginPage().enterUsername(username);

    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I Click On Login$")
    public void iClickOnLogin() {
        new LoginPage().clickOnLoginLink();

    }

    @Then("^I should be able login successfully and see \"([^\"]*)\"$")
    public void iShouldBeAbleLoginSuccessfullyAndSee(String text) {
        Assert.assertEquals(text, new LoginPage().getProductsText(), "Products Page not displayed");
    }
}
