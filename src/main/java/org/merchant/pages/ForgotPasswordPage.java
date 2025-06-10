package org.merchant.pages;

import dev.failsafe.internal.util.Assert;
import org.merchant.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {

    WebElement isMsgValid;
    WebDriver driver = DriverManager.getDriver();
    public boolean isVisibleForgotPassword() throws InterruptedException {

        WebElement actualForgotPwdText = DriverManager.getDriver().findElement(By.xpath("//a[@class=\"forgottext float-end c-pointer\"]"));
        boolean isVisible = actualForgotPwdText.isDisplayed();

        if(isVisible){
            actualForgotPwdText.click();
            driver.findElement(By.xpath("//input[@id=\"fullName\"]")).sendKeys("9999999999");
            driver.findElement(By.xpath("//button[contains(text(),\"Send\")]")).click();
            Thread.sleep(2000);
            isMsgValid = driver.findElement(By.xpath("//div[contains(text(),\"Username not exists\")]"));

        }
        else
        {
            driver.findElement(By.xpath("//i[@class=\"fa-brands fa-instagram\"]")).click();
            //String actualUrl = DriverManager.getDriver().getCurrentUrl();
            //System.out.println("Log: \"Forgot password option is not present at login page\" in the HTML report.");
        }
        return isMsgValid.isDisplayed();
    }
}
