package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

import java.text.MessageFormat;
import java.util.List;

public class HandleMultipleMatchedElements {

    public static void main(String[] args) throws InterruptedException {
        //1. Start Appium Session
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //2. Click on Login Label
        WebElement loginLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();

        //3. Find Element that are matched to //*[@text="Login"]
        Thread.sleep(2000);
        List<WebElement> loginTextsElements = appiumDriver.findElements(AppiumBy.xpath("//*[@text='Login']"));

        System.out.println("How many elements matched: " + loginTextsElements.size());

        final int LOGIN_TEXT_FORM_INDEX = 0;
        final int LOGIN_MENU_TEXT_INDEX = 1;

        loginTextsElements.get(LOGIN_TEXT_FORM_INDEX).click();
        System.out.println("How many elements matched: " + loginTextsElements.get(LOGIN_MENU_TEXT_INDEX).getText());


//        WebElement firstLoginTextEl = appiumDriver.findElement(AppiumBy.xpath("//*[@text='Login']"));
//        firstLoginTextEl.click();

    }

}