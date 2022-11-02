package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

import java.io.File;
import java.io.IOException;

public class TakingScreenshot {
    public static void main(String [] args) {
        // Create Screenshot first
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //Navigate to forms screen
        WebElement formEl = appiumDriver.findElement(AppiumBy.accessibilityId("Forms"));
        formEl.click();

        //Click on toggle button IF it's OFF
        WebElement switchElement = appiumDriver.findElement(AppiumBy.accessibilityId("switch"));
        final boolean isSwitchOn = switchElement.getText().equals("Click to turn the switch OFF");
        System.out.println(isSwitchOn);
        if(!isSwitchOn) {
            switchElement.click();
        }
//        //Click on dropdown menu and select the first option

        WebElement dropDownMenuElement = appiumDriver.findElement(AppiumBy.accessibilityId("Dropdown"));
        dropDownMenuElement.click();

        WebElement selectedDropdownMenuEl = appiumDriver.findElement(AppiumBy.xpath("//*[@text='webdriver.io is awesome']"));
        selectedDropdownMenuEl.click();

        //Taking screenshot
        File formScreenBase64Data = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);

        String formScreenShotFilePath = System.getProperty("user.dir");
        System.out.println(formScreenShotFilePath);

        try {
            FileUtils.copyFile(formScreenBase64Data, new File(formScreenShotFilePath+ "/screenshot/" + "fromScreen.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
