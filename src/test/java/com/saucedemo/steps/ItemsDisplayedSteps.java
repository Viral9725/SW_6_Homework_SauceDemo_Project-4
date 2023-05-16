package com.saucedemo.steps;

import com.saucedemo.cucumber.pages.ProductPage;
import cucumber.api.java.en.Then;

public class ItemsDisplayedSteps {
    @Then("^Verify that six products are displayed on the product page$")
    public void verifyThatSixProductsAreDisplayedOnTheProductPage() {
        new ProductPage().verifySixProductsDisplayedOnProductPage();
    }
}
