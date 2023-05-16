package com.saucedemo.cucumber.pages;


import com.saucedemo.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utilities {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;

    public void enterUsername(String userName) {
        Reporter.log("Enter Username " + usernameField.toString());
        sendTextToElement(usernameField, userName);
    }

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    public void enterPassword(String password) {
        Reporter.log("Enter Password " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }


    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginLink;

    public void clickOnLoginLink() {
        Reporter.log("Click On Login Link " + loginLink.toString());
        clickOnElement(loginLink);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productsText;

    public String getProductsText() {
        Reporter.log("Get Products Text" + productsText.toString());
        return getTextFromElement(productsText);
    }

}
