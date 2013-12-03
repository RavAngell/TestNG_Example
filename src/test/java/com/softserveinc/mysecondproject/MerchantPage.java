package com.softserveinc.mysecondproject;

import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: oilnyt
 * Date: 11/29/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MerchantPage extends BasePage implements Values {

    /**
     * Page constructor - casts driver to the base class
     *
     * @param driver
     */

    public MerchantPage(WebDriver driver) {
        super(driver);
    }
}
