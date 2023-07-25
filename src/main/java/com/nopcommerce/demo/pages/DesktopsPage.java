package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyDesktops;

    @CacheLookup
    @FindBy(xpath ="//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourComputerlink;


    public String getDesktopsText(){
        return getTextFromElement(verifyDesktops);
    }
    public void clickOnBuildYourComputer(){
        clickOnElement(buildYourComputerlink);
    }
}
