package com.softserveinc.mysecondproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created with IntelliJ IDEA.
 * User: oilnyt
 * Date: 11/29/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseTestDriver {
    protected WebDriver driver;

    /* Open Mozilla Firefox on start up */
    @BeforeSuite
    public void setUp() {
        driver = new FirefoxDriver();
    }

    /* Close Mozilla Firefox on finish */
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
