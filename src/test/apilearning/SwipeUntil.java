package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverExtensions;

import java.time.Duration;
import java.util.Arrays;

public class SwipeUntil {
    public static void main(String [] args) {
        //Create Session
        AppiumDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();

        //Click on Swipe Label Element
        appiumDriver.findElement(AppiumBy.accessibilityId("Swipe")).click();

        //Make sure that wa are the target screen and wait until it target screen is open
        WebDriverWait wdWait = new WebDriverWait(appiumDriver,  Duration.ofSeconds(30L));
        WebElement swipeScreen = appiumDriver.findElement(AppiumBy.accessibilityId("Swipe-screen"));
        wdWait.until( ExpectedConditions.visibilityOf(swipeScreen) );


        //Swipe from right to left until we see `EXTENDABLE` card in infinite time
        boolean isTargetCardVisible = false;
        //Define Coordinates
        double xStartPoint = swipeScreen.getRect().x + (swipeScreen.getSize().width*0.9);
        double xEndPoint = swipeScreen.getRect().x + (swipeScreen.getSize().width*0.1);

        double yStartPoint = swipeScreen.getRect().y + (swipeScreen.getSize().height*0.5);
        while (true) {
        //Swipe from right to left
            try {
                WebElement targetCard = swipeScreen.findElement(AppiumBy.xpath("//*[@text='EXTENDABLE']"));
                wdWait.until(ExpectedConditions.visibilityOf(targetCard));
                if(targetCard.isDisplayed()) break;

            } catch (Exception e) {
                e.printStackTrace();
            }
            //Type of Pointer Input
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

            //Creating Sequence object to add actions
            Sequence swipe = new Sequence(finger, 1);

            //Move finger into starting position
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),  PointerInput.Origin.viewport(), (int)xStartPoint, (int)yStartPoint));

            //Finger comes down into contact with screen
            swipe.addAction(finger.createPointerDown(0));

            //Finger moves to end position
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), (int)xEndPoint, (int) yStartPoint));

            //Get up Finger from Screen
            swipe.addAction(finger.createPointerUp(0));
            appiumDriver.perform(Arrays.asList(swipe));

        }

    }

}
