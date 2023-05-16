package com.saucedemo.cucumber.pages;

import com.saucedemo.cucumber.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utilities {
    @CacheLookup
    @FindBy (xpath = "//div[@class='inventory_item']")
    WebElement sixProductsOnPage;
    public void verifySixProductsDisplayedOnProductPage() {
        Reporter.log("Get Item NUmber On Products Page" + sixProductsOnPage.toString());
        List<WebElement> products = getListOfElements(By.xpath("//div[@class='inventory_item']"));
        for (WebElement e : products) {
            System.out.println(e);
            break;
        }



    }
}