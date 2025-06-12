package org.merchant.testscript;

import org.merchant.driver.DriverManager;
import org.merchant.pages.ForgotPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class instagramAccountRedirect extends BaseTest {

    @Test
    public void verifyInstagramAccount(){
        test = extent.createTest("verifyInstagramAccount - If Forgot Password Is Does Not Visible");
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

        if(!forgotPasswordPage.isVisibleForgotPassword()){
            forgotPasswordPage.ifNotVisible();
            ArrayList<String> tabs = new ArrayList<>(DriverManager.getDriver().getWindowHandles());
            if(tabs.size()>1){
                DriverManager.getDriver().switchTo().window(tabs.get(1));
            }
            String currentUrl = DriverManager.getDriver().getCurrentUrl();
            String expectedUrl = "https://www.instagram.com/";
            test.info("Redirecting to instagram account : "+ currentUrl);
            //Assertion
            Assert.assertEquals(currentUrl,expectedUrl);
        }
        else{
            test.info("Skipped instagram test ");
        }
    }
}
