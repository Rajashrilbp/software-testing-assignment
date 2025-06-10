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
    public static void captureScreenshot() throws IOException {
        SimpleDateFormat formatObj = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String formattedDate = formatObj.format(new Date());
        //Taking ScreenShot
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "\\src\\test\\resources\\screenshots\\";
        File destFile = new File(path);
        FileUtils.copyFile(srcFile, destFile);
    }
}
