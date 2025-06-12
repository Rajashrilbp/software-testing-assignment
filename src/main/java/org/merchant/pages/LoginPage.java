package org.merchant.pages;
import org.merchant.driver.DriverClass;
import org.merchant.driver.DriverManager;
import org.merchant.utils.ScreenshotUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class LoginPage {

    private WebDriverWait wait;
    private WebDriver driver;
    private By userName = By.id("fullName");
    private By passWord = By.id("Password");
    private By button = By.xpath("//button[@type=\"submit\"]");
    private By errorMsg = By.xpath("//div[contains(text(),'Invalid username or password')]");

    //constructor
    public LoginPage(){
       this.driver = DriverManager.getDriver();
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public long pageLoadToLoginApplication(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        long pageLoadStartTimer,pageWithElementsLoadEndTimer,totalTimeTaken;
        pageLoadStartTimer = System.currentTimeMillis();
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passWord));
        wait.until(ExpectedConditions.visibilityOfElementLocated(button));
        pageWithElementsLoadEndTimer = System.currentTimeMillis();
        totalTimeTaken = pageWithElementsLoadEndTimer-pageLoadStartTimer;
        return totalTimeTaken;

    }
    public boolean loginToApplication1(String userName1,String passWord1) throws InterruptedException, IOException {
        driver.findElement(userName).sendKeys(userName1);
        driver.findElement(passWord).sendKeys(passWord1);
        driver.findElement(button).click();
        //return driver.findElement(errorMsg).isDisplayed();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
