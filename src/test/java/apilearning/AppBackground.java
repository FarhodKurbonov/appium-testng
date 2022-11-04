package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

import java.time.Duration;

public class AppBackground {
    public static void main(String [] args) {
        // Init Appium Session
        AndroidDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //Login Form put username and password
        //1. Click on Login Label
        WebElement loginLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();

        //2. Input username
        WebElement emailTxBx = appiumDriver.findElement(AppiumBy.accessibilityId("input-email"));
        emailTxBx.sendKeys("fkurbonov@maildomain.com");


        //3. Input password
        WebElement passwordTxBx = appiumDriver.findElement(AppiumBy.accessibilityId("input-password"));
        passwordTxBx.sendKeys("password");

        //4. Click on Login Btn
        WebElement loginBtn = appiumDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
        loginBtn.click();

        //5. Stop Recording Screen
        String base64output =   appiumDriver.stopRecordingScreen();

        //Put the app in background for 5 sec
        appiumDriver.runAppInBackground(Duration.ofSeconds(5));

        //
    }







}
