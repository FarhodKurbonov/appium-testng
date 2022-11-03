package models.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.log.Log;

public class LoginPage {

    private AppiumDriver appiumDriver;
    private final By usernameSelectorById = AppiumBy.accessibilityId("input-email");
    private final By passwordSelectorById = AppiumBy.accessibilityId("input-password");
    private final By loginBtnSelectorById = AppiumBy.accessibilityId("button-LOGIN");

    public LoginPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement getUsername() {
        return appiumDriver.findElement(usernameSelectorById);
    }

    public WebElement getPassword() {
        return appiumDriver.findElement(passwordSelectorById);
    }

    public WebElement getLoginBtn() {
        return appiumDriver.findElement(loginBtnSelectorById);
    }

    public void inputUserName(String text){
        this.getUsername().sendKeys(text);
    }

    public void inputPassword(String text) {
        this.getPassword().sendKeys(text);
    }

    public void clickOnLoginBtn(){
        this.getLoginBtn().click();
    }




}
