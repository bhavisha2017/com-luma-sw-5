package com.softwaretesting.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretesting.magento.customeListeners.CustomListeners;
import com.softwaretesting.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends Utility {

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement clickOnJacket;

    public void clickOnJacket()
    {
        clickOnElement(clickOnJacket);
        CustomListeners.test.log(Status.PASS,"Click On Jacket");
    }
}
