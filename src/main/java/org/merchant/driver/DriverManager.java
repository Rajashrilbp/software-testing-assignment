package org.merchant.driver;

import org.openqa.selenium.WebDriver;
public class DriverManager {
    //we are using ThreadLocat<WebDriver> concept is used to execute the testscripts in parallel
    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    //Getter : Driver
    public static WebDriver getDriver(){
        return threadDriver.get();
    }

    //Setter : Driver
    public static void setDriver(WebDriver driver){
        threadDriver.set(driver);
    }
}
