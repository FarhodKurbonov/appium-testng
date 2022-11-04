package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

public class HandleToggleButton {

    public static void main(String[] args) {
        // Launch an appium session
        AppiumDriver  appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //Click on the Forms label
        WebElement formLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Forms"));
        formLabel.click();
        // Get the toggle label value before interacting with the switch
        WebElement switchTextElement = appiumDriver.findElement(AppiumBy.accessibilityId("switch-text"));
        System.out.println("Label Text Before interacting with Toggle button" + switchTextElement.getText());

        //Click on the toggle button
        WebElement switchElement = appiumDriver.findElement(AppiumBy.accessibilityId("switch"));
        switchElement.click();

        // Get the toggle label value before interacting with the switch
        System.out.println("Label Text Before interacting with Toggle button" + switchTextElement.getText());




    }
}
