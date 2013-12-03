package com.softserveinc.mysecondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * This page contains shared values
 * Created with IntelliJ IDEA.
 * User: oilnyt
 * Date: 11/29/13
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BasePage implements Values {
    public WebDriver driver;

    /**
     * @return driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /* Shared constructor */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    /* Shared elements */
    public List<WebElement> getOffersTitles() {
        return getDriver().findElements(By.cssSelector(OFFERS));
    }


}
