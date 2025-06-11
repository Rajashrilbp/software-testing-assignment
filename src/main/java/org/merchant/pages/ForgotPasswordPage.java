package org.merchant.pages;

import dev.failsafe.internal.util.Assert;
import org.merchant.driver.DriverClass;
import org.merchant.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage {


    private WebDriverWait wait;
    WebDriver driver;
    private By forgotLink = By.xpath("//a[contains(@class,'forgottext')]");
    private By usernameInput = By.id("fullName");
    private By sendBtn = By.xpath("//button[contains(text(),'Send')]");
    private By errorMsg = By.xpath("//*[contains(text(),'Username not exists')]");
    private By instaIcon = By.xpath("//i[@class='fa-brands fa-instagram']");

    public ForgotPasswordPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public boolean isVisibleForgotPassword() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(forgotLink));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean ifVisible(String username) {
        driver.findElement(forgotLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys(username);
        driver.findElement(sendBtn).click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    public boolean ifNotVisible(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(instaIcon)).click();
            return true;
        }
        catch(TimeoutException e){
            return false;
        }

    }

}
