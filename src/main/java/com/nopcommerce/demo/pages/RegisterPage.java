package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmpasswordReqText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement selectFemale;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement selectDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectYear;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessText;

    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButtonLink() {
        clickOnElement(registerButton);
    }

    public String getFirstNameRequiredMessage() {
        return getTextFromElement(firstNameReqText);
    }

    public String getLastNameRequiredMessage() {
        return getTextFromElement(lastNameReqText);
    }

    public String getEmailRequiredMessage() {
        return getTextFromElement(emailReqText);
    }

    public String getPasswordRequiredMessage() {
        return getTextFromElement(passwordReqText);
    }

    public String getConfirmPassRequiredMessage() {
        return getTextFromElement(confirmpasswordReqText);
    }

    public void selectGenderFemale() {
        clickOnElement(selectFemale);
    }

    public void inputFirstname(String text) {
        sendTextToElement(firstNameField, text);
    }

    public void inputLastname(String text) {
        sendTextToElement(lastNameField, text);
    }

    public void selectDay(String text) {
        selectByVisibleTextFromDropDown(selectDay, text);
    }

    public void selectMonth(String text) {
        selectByVisibleTextFromDropDown(selectMonth, text);
    }

    public void selectYear(String text) {
        selectByVisibleTextFromDropDown(selectYear, text);
    }

    public void inputEmail(String text) {
        sendTextToElement(emailField, text);
    }

    public void inputPassword(String text) {
        sendTextToElement(passwordField, text);
    }

    public void inputConfirmPassword(String text) {
        sendTextToElement(confirmPasswordField, text);
    }

    public String getYourRegisterText() {
        return getTextFromElement(registerSuccessText);
    }
}
