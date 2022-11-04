package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

import java.util.List;

public class HandleDropDown {

    public static void main(String[] args) {
        //Set up session
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();
        //Go to Forms
        WebElement formElement = appiumDriver.findElement(AppiumBy.accessibilityId("Forms"));
        formElement.click();

        //Click on the dropdown element
        WebElement dropDownMenu = appiumDriver.findElement(AppiumBy.accessibilityId("Dropdown"));
        dropDownMenu.click();
        //Select the first option
        WebElement firstDropDownMenuElementOption = appiumDriver.findElement(AppiumBy.xpath("//*[@text='webdriver.io is awesome']"));
        firstDropDownMenuElementOption.click();

        //Get the text display on drop down
        System.out.println(firstDropDownMenuElementOption.getText());
    }
}
