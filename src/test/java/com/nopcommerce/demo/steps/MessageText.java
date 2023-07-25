package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MessageText {
    @Then("I should see the Login link is displayed {string}")
    public void iShouldSeeTheLoginLinkIsDisplayed(String Login) {
        Assert.assertEquals("Logout unsuccessful", new HomePage().getLogininlink(), Login);
    }
    @Then("I should see the Welcome text {string}")
    public void iShouldSeeTheWelcomeText(String Welcome) {
        Assert.assertEquals("Text not verified", new LoginPage().getWelcomeText(), Welcome);
    }


    @Then("I should see the Logout link is displayed {string}")
    public void iShouldSeeTheLogoutLinkIsDisplayed(String Logout) {
        Assert.assertEquals("Login unsuccessful", new LoginPage().getlogOutlink(),Logout);
    }


    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String result) {
        Assert.assertEquals("Text not verified",result, new LoginPage().getErrorMessage());
    }
}
