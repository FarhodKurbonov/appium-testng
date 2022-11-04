package testnglearn;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import models.pages.LoginPageMethodChaining;
import org.testng.annotations.Test;
import utils.AppiumDriverExtensions;

public class Login {
    //Annotations
    @Test
    public void loginWithCorrectCredentials() {
        //1. Launch the target app
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //2. Click on Login Label
        appiumDriver.findElement(AppiumBy.accessibilityId("Login")).click();

        //3. Input username
        LoginPageMethodChaining loginPage = new LoginPageMethodChaining(appiumDriver);
        loginPage.inputUserName("my@email.com").inputPassword("12345678").clickOnLoginBtn();
    }
}
