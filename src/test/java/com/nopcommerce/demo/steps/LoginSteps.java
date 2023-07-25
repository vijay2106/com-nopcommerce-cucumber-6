package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }
    @And("I enter Invalid email ID {string}")
    public void iEnterInvalidEmailID(String Email) {
        new LoginPage().enterEmailId(Email);
    }
    @And("I enter Invalid password {string}")
    public void iEnterInvalidPassword(String Password) {
        new LoginPage().enterPassword(Password);
    }
    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogInButton();
    }
    @And("I enter valid email ID {string}")
    public void iEnterValidEmailID(String Email) {
        new LoginPage().enterEmailId(Email);
    }

    @And("I enter valid password {string}")
    public void iEnterValidPassword(String Password) {
        new LoginPage().enterPassword(Password);
    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnLogOutLink();
    }

}
