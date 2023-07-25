package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the Register text {string}")
    public void iShouldSeeTheRegisterText(String result) {
        Assert.assertEquals("Text not verified", result, new RegisterPage().getRegisterText());
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButtonLink();
    }

    @Then("I should see the fist name error {string}")
    public void iShouldSeeTheFistNameError(String Error) {
        Assert.assertEquals("Error not verified", Error, new RegisterPage().getFirstNameRequiredMessage());
    }
    @And("I should see the Last name error {string}")
    public void iShouldSeeTheLastNameError(String Error) {
        Assert.assertEquals("Error not verified", Error, new RegisterPage().getLastNameRequiredMessage());
    }

    @And("I should see the email error {string}")
    public void iShouldSeeTheEmailError(String Error) {
        Assert.assertEquals("Error not verified", Error, new RegisterPage().getEmailRequiredMessage());
    }

    @And("I should see the password error {string}")
    public void iShouldSeeThePasswordError(String Error) {
        Assert.assertEquals("Error not verified", Error, new RegisterPage().getPasswordRequiredMessage());
    }

    @And("I should see the confirm password error {string}")
    public void iShouldSeeTheConfirmPasswordError(String Error) {
        Assert.assertEquals("Error not verified", Error, new RegisterPage().getConfirmPassRequiredMessage());
    }

    @And("I select gender Female")
    public void iSelectGenderFemale() {
        new RegisterPage().selectGenderFemale();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String FName) {
        new RegisterPage().inputFirstname(FName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String LName) {
        new RegisterPage().inputLastname(LName);
    }

    @And("I select date {string}")
    public void iSelectDate(String Day) {
        new RegisterPage().selectDay(Day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String Month) {
        new RegisterPage().selectMonth(Month);
    }

    @And("I select year {string}")
    public void iSelectYear(String Year) {
        new RegisterPage().selectYear(Year);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String Email) {
        new RegisterPage().inputEmail(Email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String Password) {
        new RegisterPage().inputPassword(Password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String ConPassword) {
        new RegisterPage().inputConfirmPassword(ConPassword);
    }

    @Then("I should register successfully {string}")
    public void iShouldRegisterSuccessfully(String result) {
        Assert.assertEquals("Text not verified", result, new RegisterPage().getYourRegisterText());
    }

}
