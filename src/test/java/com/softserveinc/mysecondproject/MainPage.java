package com.softserveinc.mysecondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: oilnyt
 * Date: 11/29/13
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainPage extends BasePage implements Values {

    /* Page elements */

    public List<WebElement> getMerchantLinks() {
        return driver.findElements(By.cssSelector(OFFERS_MERCHANT_PAGE));
    }

    /**
     * Page constructor - casts driver to the base class
     *
     * @param driver
     */

    public MainPage(WebDriver driver) {
        super(driver);
        Reporter.log("Main page is opened");
    }

    /**
     * @param driver
     * @param offerNumber to open
     * @return
     */

    public MerchantPage openOffer(WebDriver driver, int offerNumber) {

        if (offerNumber < 0) {
            throw new IllegalStateException("Invalid offer number");

        }

        getMerchantLinks().get(offerNumber).click();
        return new MerchantPage(driver);
    }


}
