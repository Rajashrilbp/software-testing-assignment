package org.merchant.testscript;

import lombok.extern.slf4j.Slf4j;
import org.merchant.pages.LoginPage;
import org.merchant.utils.ScreenshotUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest{

    @Test
    public void verifyLogin() throws InterruptedException, IOException {

        LoginPage loginpage = new LoginPage();
        //For Test Case 1: Page Load Performance – Login Elements
        //long totalTimeTaken = loginpage.pageLoadToLoginApplication();
        //Assert.assertTrue(totalTimeTaken > 30000,"Login Elements Take Too Long To Appear" );

        //For Test Case 2 : Invalid Login Validation
        boolean msg = loginpage.loginToApplication("9999999999","Amitabh");
        //ScreenshotUtils.captureScreenshot();
        //Assertion
        Assert.assertTrue(msg);
    }
}
