package org.merchant.utils;
import org.apache.commons.io.FileUtils;
import org.merchant.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String captureScreenshot(String testName) throws IOException {
        try {
            TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
            File srcFile = ts.getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            String screenshotPath = "src/test/resources/screenshots/" + testName + "_" + timestamp + ".png";
            File destFile = new File(screenshotPath);
            FileUtils.copyFile(srcFile, destFile);
            return destFile.getAbsolutePath();
        }
        catch(Exception e){
            return null;
        }

    }
}
