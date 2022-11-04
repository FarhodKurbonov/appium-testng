package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverExtensions;
import utils.SwipeAction;

import java.time.Duration;
import java.time.Period;
import java.util.Arrays;

public class SwipeVertically {
    public static void main(String [] args) {
        //Create Session
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //Click on Swipe Label Element
        appiumDriver.findElement(AppiumBy.accessibilityId("Swipe")).click();

        //Make sure that wa are the target screen and wait until it target screen is opene
        WebElement swipeScreen = appiumDriver.findElement(AppiumBy.accessibilityId("Swipe-screen"));
        WebDriverWait wdWait = new WebDriverWait(appiumDriver,  Duration.ofSeconds(30L));
        wdWait.until( ExpectedConditions.visibilityOf(swipeScreen));

        //Get the mobile screen sizes
        int xStartPoint = swipeScreen.getRect().x + (swipeScreen.getSize().width/2);
        double yStartPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.9);
        double yEndPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.1);
        System.out.println("xStartPoint: " + xStartPoint );
        System.out.println("xEndPoint: " + xStartPoint );
        System.out.println("yStartPoint: " + yStartPoint );
        System.out.println("yEndPoint: " + yEndPoint );

        SwipeAction swipeAction = new SwipeAction(
                appiumDriver,
                xStartPoint,  xStartPoint,
                (int)yStartPoint, (int)yEndPoint,
                swipeScreen
        );
        swipeAction.swipeVertically(5);

    }
}
