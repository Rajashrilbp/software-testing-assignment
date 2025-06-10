package org.merchant.testscript;

import org.merchant.pages.ForgotPasswordPage;
import org.merchant.utils.ScreenshotUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ForgotPageTest extends BaseTest{
    @Test
    public void verifyForgotPassword() throws InterruptedException, IOException {
        ForgotPasswordPage forgotPage = new ForgotPasswordPage();
        boolean isDisplayed = forgotPage.isVisibleForgotPassword();

        //Assertion
        Assert.assertTrue(isDisplayed);

        /*WebElement actualUrl = forgotPage.isVisibleForgotPassword();
        String expectedUrl = "https://www.instagram.com/";
        Assert.assertEquals(actualUrl,expectedUrl);*/


    }
}
