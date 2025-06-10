package org.merchant.testscript;

import org.merchant.driver.DriverClass;
import org.merchant.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp() throws InterruptedException {
        DriverClass.openBrowser("chrome");

    }
    @AfterMethod
    public void tearDown(){
        DriverManager.getDriver().close();
    }
}
