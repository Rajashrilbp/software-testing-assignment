package org.merchant.testscript;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.merchant.driver.DriverClass;
import org.merchant.driver.DriverManager;
import org.merchant.reports.ExtentManager;
import org.merchant.utils.ScreenshotUtils;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {

    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        DriverClass.openBrowser("chrome");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        String testName = result.getMethod().getMethodName();

        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = ScreenshotUtils.captureScreenshot(testName);
            test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
            test.addScreenCaptureFromPath(screenshotPath);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Skipped: " + result.getThrowable());
        }
        DriverManager.getDriver().quit();
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}
