package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

public class SetValues {
    public static void main(String [] args) {
        //1. Launch the target app
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //2. Click on Login Label
        WebElement loginLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();

        //3. Input username
        WebElement emailTxBx = appiumDriver.findElement(AppiumBy.accessibilityId("input-email"));
        emailTxBx.sendKeys("fkurbonov@maildomain.com");


        //4. Input password
        WebElement passwordTxBx = appiumDriver.findElement(AppiumBy.accessibilityId("input-password"));
        passwordTxBx.sendKeys("password");

        //5. Click on Login Btn
        WebElement loginBtn = appiumDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
        loginBtn.click();
    }
}
