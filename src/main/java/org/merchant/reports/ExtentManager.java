package org.merchant.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            ExtentSparkReporter reporter = new ExtentSparkReporter("src/test/resources/extent-reports/HTMLReport_"+timestamp+".html");
            reporter.config().setTheme(Theme.STANDARD);
            reporter.config().setDocumentTitle("Merchant Automation Report");
            reporter.config().setReportName("Login Test Suite");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}
