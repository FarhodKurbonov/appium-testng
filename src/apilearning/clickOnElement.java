package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.AppiumDriverExtensions;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class clickOnElement {
    public static void main(String[] args) {
            AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();
            WebElement loginLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
            loginLabel.click();
    }

}
