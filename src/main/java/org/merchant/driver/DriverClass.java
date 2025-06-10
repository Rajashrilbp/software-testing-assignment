package org.merchant.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
    public static void openBrowser(String browser) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      //  WebDriver driver = new ChromeDriver();
        DriverManager.setDriver(new ChromeDriver());
        DriverManager.getDriver().get("https://merchant1.uatdev.in/auth/login");
        Thread.sleep(2000);

    }
}
