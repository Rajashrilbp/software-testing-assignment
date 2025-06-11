package org.merchant.testscript;

import org.merchant.pages.ForgotPasswordPage;
import org.merchant.utils.ScreenshotUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class ForgotPageTest extends BaseTest {

   @Test
   public void verifyForgotPassword(){

       ForgotPasswordPage forgotPage = new ForgotPasswordPage();
       if (forgotPage.isVisibleForgotPassword()) {
           test = extent.createTest("verifyForgotPassword - If Forgot Password Is Visible");
           boolean errorDisplayed = forgotPage.ifVisible("9999999999");
           Assert.assertTrue(errorDisplayed);
       } else {
           test.info("Forgot password link is not visible on the login page.");
       }
   }
}


