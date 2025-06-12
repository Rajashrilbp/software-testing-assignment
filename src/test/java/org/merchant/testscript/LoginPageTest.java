package org.merchant.testscript;

import org.merchant.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void verifyLoginElements() {
        test = extent.createTest("verifyLoginElements - Page Load Performance");

        LoginPage loginpage = new LoginPage();
        long totalTimeTaken = loginpage.pageLoadToLoginApplication();
        test.info("Login elements loaded in "+totalTimeTaken+" ms ");
        Assert.assertTrue(totalTimeTaken > 30000 ,"Login elements take too long to appear."+totalTimeTaken+" ms");
    }

    @Test
    public void verifyLogin() throws Exception {
        test = extent.createTest("verifyLogin1 - Invalid Login");
        LoginPage loginpage = new LoginPage();
        boolean isDisplayed = loginpage.loginToApplication1("9999999999", "Amitabh");
        Assert.assertTrue(isDisplayed);
    }
}
