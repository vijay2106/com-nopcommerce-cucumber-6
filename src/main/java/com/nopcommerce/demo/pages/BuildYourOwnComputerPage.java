package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//select[@name='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(css ="#product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    //List<WebElement> hddRadio;
    WebElement    hddRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_4']")
    WebElement osRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_5']")
    WebElement msOfficeSoftware;

    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath ="//p[@class='content']")
    WebElement verifyProductAddedToCart;
    public void selectProcessor(String text){
        selectByVisibleTextFromDropDown(processor,text);
    }
    public void selectRAM(String text){
        selectByVisibleTextFromDropDown(ram,text);
    }
    public void selectHDDRadio(String text) {
        mouseHoverToElementAndClick(hddRadio);
    }


    public void selectOSRadio(String text){
        mouseHoverToElementAndClick(osRadio);
    }
    public void selectSoftwareMS(String text) {
        mouseHoverToElementAndClick(msOfficeSoftware);
    }
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String productCartMessage(){
        return getTextFromElement(verifyProductAddedToCart);
    }


}
