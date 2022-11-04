package models.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageMethodChaining {

    private AppiumDriver appiumDriver;
    private final By usernameSelectorById = AppiumBy.accessibilityId("input-email");
    private final By passwordSelectorById = AppiumBy.accessibilityId("input-password");
    private final By loginBtnSelectorById = AppiumBy.accessibilityId("button-LOGIN");

    public LoginPageMethodChaining(AppiumDriver appiumDriver) {
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

    public LoginPageMethodChaining inputUserName(String text){
        this.getUsername().sendKeys(text);
        return this;
    }

    public LoginPageMethodChaining inputPassword(String text) {
        this.getPassword().sendKeys(text);
        return this;
    }


    public void clickOnLoginBtn(){
        this.getLoginBtn().click();
    }

}
