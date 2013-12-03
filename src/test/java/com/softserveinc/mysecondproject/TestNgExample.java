package com.softserveinc.mysecondproject;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Class with test cases.
 * <p/>
 * Created with IntelliJ IDEA.
 * User: oilnyt
 * Date: 11/27/13
 * Time: 4:36 PM
 */

@Test
public class TestNgExample extends BaseTestDriver implements Values {

    @Test(description = "Verifies offers titles. ", enabled = true, timeOut = 100000, groups = "functional")
    public void VerifyOffersTitle() {
        /* Open main page */
        Reporter.log("Open main page");
        driver.get(URL);

        MainPage mainPage = new MainPage(driver);


        for (int i = 0; i < QUANTITY_OF_OFFERS_TO_VERIFY; i++) {

            /* Main page offer title */
            String offerTitle = mainPage.getOffersTitles().get(i).getText();

            /* Open merchant page */
            Reporter.log("Open offer '" + offerTitle + "'");
            MerchantPage merchantPage = mainPage.openOffer(driver, i);

            /* Retrieve the first offer title text on the merchant page */
            String merchantFirstOfferTitle = merchantPage.getOffersTitles().get(ELEMENT_NUMBER_IN_THE_ORDER - 1).getText();

            /* Verify that offer displayed on the main page is the first on the merchant page */
            Assert.assertTrue("Recent merchant's offer doesn't equal to offer displayed on the main page",
                    offerTitle.equals(merchantFirstOfferTitle));

            /* Go to previous page */
            Reporter.log("Navigate back. ");
            driver.navigate().back();


        }

    }

}


