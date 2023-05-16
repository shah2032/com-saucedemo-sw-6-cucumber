package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @When("^I enter email id in email field$")
    public void iEnterEmailIdInEmailField() {
        new LoginPage().enterLoginId();
    }

    @And("^I enter password in password field$")
    public void iEnterPasswordInPasswordField() {
        new LoginPage().enterPassword();
    }
    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }
    @Then("^I should see text Products$")
    public void iShouldSeeTextProducts() {
        String expectedMessage = "Products";
        String actualMessage = new ProductsPage().verifyTextProducts();
        Assert.assertEquals(expectedMessage, actualMessage, "Not displayed");
    }

    @Then("^I should see six products are displayed on home page$")
    public void iShouldSeeSixProductsAreDisplayedOnHomePage() {
        int expectedQty = 6;
        int actualQty = new ProductsPage().verifyTotalProductOfNumber();
        Assert.assertEquals(expectedQty, actualQty, "Not displayed");
    }
}
