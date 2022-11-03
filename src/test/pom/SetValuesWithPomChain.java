package test.pom;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import models.pages.LoginPage;
import models.pages.LoginPageMethodChaining;
import utils.AppiumDriverExtensions;

public class SetValuesWithPomChain {
    public static void main(String [] args) {
        //1. Launch the target app
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //2. Click on Login Label
       appiumDriver.findElement(AppiumBy.accessibilityId("Login")).click();

        //3. Input username
        LoginPageMethodChaining loginPage = new LoginPageMethodChaining(appiumDriver);
        loginPage.inputUserName("my@email.com").inputPassword("12345678").clickOnLoginBtn();
    }
}
