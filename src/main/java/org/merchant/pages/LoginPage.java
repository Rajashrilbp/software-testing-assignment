package org.merchant.pages;
import org.merchant.driver.DriverClass;
import org.merchant.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    WebDriverWait wait;
    WebDriver driver = DriverManager.getDriver();
    public long pageLoadToLoginApplication(){

        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30));
        long pageLoadStartTimer,pageWithElementsLoadEndTimer,totalTimeTaken;
        pageLoadStartTimer = System.currentTimeMillis();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]")));
        pageWithElementsLoadEndTimer = System.currentTimeMillis();
        totalTimeTaken = pageWithElementsLoadEndTimer-pageLoadStartTimer;
        return totalTimeTaken;

    }
    public boolean loginToApplication(String userName,String passWord) throws InterruptedException {
        driver.findElement(By.id("fullName")).sendKeys(userName);
        driver.findElement(By.id("Password")).sendKeys(passWord);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        WebElement msg = driver.findElement(By.xpath("//div[@class=\"p-toast-detail ng-tns-c14-4\"]"));
        return msg.isDisplayed();
       // System.out.println(alertMsg);
    }
}
