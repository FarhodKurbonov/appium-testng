package test.pom;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import models.pages.LoginPage;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

public class SetValuesWithPageOM {
    public static void main(String [] args) {
        //1. Launch the target app
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //2. Click on Login Label
       appiumDriver.findElement(AppiumBy.accessibilityId("Login")).click();

        //3. Input username
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.getUsername().sendKeys("my@email.com");

        //4. Input password
        loginPage.getPassword().sendKeys("12345678");

        //5. Click on Login Btn
        loginPage.getLoginBtn().click();
    }
}
