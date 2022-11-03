package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import models.pages.LoginPage;
import utils.AppiumDriverExtensions;

public class SetValuesWithPagePomMainInteractionMethods {
    public static void main(String [] args) {
        //1. Launch the target app
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //2. Click on Login Label
       appiumDriver.findElement(AppiumBy.accessibilityId("Login")).click();

        //3. Input username
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.inputUserName("my@email.com");

        //4. Input password
        loginPage.inputPassword("12345678");

        //5. Click on Login Btn
        loginPage.clickOnLoginBtn();
    }
}
