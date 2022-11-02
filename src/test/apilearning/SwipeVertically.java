package test.apilearning;

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

import java.time.Duration;
import java.time.Period;
import java.util.Arrays;

public class SwipeVertically {

    public static void main(String [] args) {
        //Create Session
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //Click on Swipe Label Element
        appiumDriver.findElement(AppiumBy.accessibilityId("Swipe")).click();

        WebElement swipeScreen = appiumDriver.findElement(AppiumBy.accessibilityId("Swipe-screen"));

        //Make sure I'm on the target screen
        WebDriverWait wdWait = new WebDriverWait(appiumDriver,  Duration.ofSeconds(30L));
        wdWait.until( ExpectedConditions.visibilityOf(swipeScreen) );


        //Get the mobile screen sizes
        int centerX = swipeScreen.getRect().x + (swipeScreen.getSize().width/2);
        double yStartPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.9);
        double yEndPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.01);
        System.out.println(centerX + yStartPoint + yEndPoint);

        //Type of Pointer Input
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        //Creating Sequence object to add actions
        Sequence swipe = new Sequence(finger, 1);

        //Move finger into starting position
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),  PointerInput.Origin.viewport(), centerX, (int)yStartPoint));

        //Finger comes down into contact with screen
        swipe.addAction(finger.createPointerDown(0));
        //Finger moves to end position
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int) yEndPoint));

        //Get up Finger from Screen
        swipe.addAction(finger.createPointerUp(0));
        appiumDriver.perform(Arrays.asList(swipe));

        // Next Swipe
         yStartPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.9);
         yEndPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.01);

        //Type of Pointer Input
         finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        //Creating Sequence object to add actions
         swipe = new Sequence(finger, 1);

        //Move finger into starting position
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),  PointerInput.Origin.viewport(), centerX, (int)yStartPoint));

        //Finger comes down into contact with screen
        swipe.addAction(finger.createPointerDown(0));
        //Finger moves to end position
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int) yEndPoint));

        //Get up Finger from Screen
        swipe.addAction(finger.createPointerUp(0));

        appiumDriver.perform(Arrays.asList(swipe));






    }
}
