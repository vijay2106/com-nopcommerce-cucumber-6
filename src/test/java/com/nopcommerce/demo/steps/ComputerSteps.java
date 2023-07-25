package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab(){
        new HomePage().clickOnComputers();
    }

    @And("I should verify the computer text {string}")
    public void iShouldVerifyTheComputerText(String Computer) {
        Assert.assertEquals("Text not verified", Computer, new ComputerPage().getComputersText());
    }

    @And("I click on desktops tab")
    public void iClickOnDesktopsTab() {
        new ComputerPage().clickOnDesktops();
    }

    @And("I should verify the desktops text {string}")
    public void iShouldVerifyTheDesktopsText(String desktops) {
        Assert.assertEquals("Text not verified", desktops, new DesktopsPage().getDesktopsText());
    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String Processor) {
        new BuildYourOwnComputerPage().selectProcessor(Processor);
    }

    @And("I select ram {string}")
    public void iSelectRam(String Ram) {
        new BuildYourOwnComputerPage().selectRAM(Ram);
    }

    @And("I select Hdd radio {string}")
    public void iSelectHddRadio(String HDD) {
        new BuildYourOwnComputerPage().selectHDDRadio(HDD);
    }

    @And("I select OS radio {string}")
    public void iSelectOSRadio(String OS) {
        new BuildYourOwnComputerPage().selectOSRadio(OS);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String Software) {
        new BuildYourOwnComputerPage().selectSoftwareMS(Software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should verify the add to cart message{string}")
    public void iShouldVerifyTheAddToCartMessage(String Message) {
        Assert.assertEquals("Message not verified", Message, new BuildYourOwnComputerPage().productCartMessage());
    }


}
