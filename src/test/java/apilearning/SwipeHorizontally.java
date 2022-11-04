package apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverExtensions;
import utils.SwipeAction;

import java.time.Duration;
import java.util.Arrays;

public class SwipeHorizontally {
    public static void main(String [] args) {
        //Create Session
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();


        //Click on Swipe Label Element
        appiumDriver.findElement(AppiumBy.accessibilityId("Swipe")).click();

        //Make sure that wa are the target screen and wait until it target screen is open
        WebElement swipeScreen = appiumDriver.findElement(AppiumBy.accessibilityId("Swipe-screen"));
        WebDriverWait wdWait = new WebDriverWait(appiumDriver,  Duration.ofSeconds(30L));
        wdWait.until( ExpectedConditions.visibilityOf(swipeScreen));

        //Define Coordinates
        double xStartPoint = swipeScreen.getRect().x + (swipeScreen.getSize().width*0.9);
        double xEndPoint = swipeScreen.getRect().x + (swipeScreen.getSize().width*0.1);
        double yStartPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.5);
        System.out.println("xStartPoint: " + xStartPoint );
        System.out.println("xEndPoint: " + xEndPoint );
        System.out.println("yStartPoint: " + yStartPoint );
        System.out.println("yEndPoint: " + yStartPoint );

        SwipeAction swipeAction = new SwipeAction(appiumDriver, (int)xStartPoint, (int)xEndPoint, (int)yStartPoint, (int)yStartPoint, swipeScreen);
        swipeAction.swipeHorizontally(5);
    }
}
