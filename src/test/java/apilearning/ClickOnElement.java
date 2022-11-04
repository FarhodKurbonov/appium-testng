package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

public class ClickOnElement {
    public static void main(String[] args) {
            AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();
            WebElement loginLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
            loginLabel.click();
    }

}
