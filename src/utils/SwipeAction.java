package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class SwipeAction {
    private final AppiumDriver appiumDriver;
    int xStartPoint; int xEndPoint; int yStartPoint; int yEndPoint; WebElement swipeArea;

    public SwipeAction(AppiumDriver appiumDriver, int xStartPoint, int xEndPoint, int yStartPoint, int yEndPoint, WebElement swipeArea){
        this.appiumDriver = appiumDriver;
        this.xStartPoint = xStartPoint;
        this.xEndPoint = xEndPoint;
        this.yStartPoint = yStartPoint;
        this.yEndPoint = yEndPoint;
    }

    public  void swipeHorizontally(int count ) {
        for(int initTime = 0; initTime < count; initTime++) {
         this.swipeHorizontally(this.swipeArea);
        }
    }
    public  void swipeHorizontally( WebElement swipeScreen) {

        //Type of Pointer Input
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        //Creating Sequence object to add actions
        Sequence swipe = new Sequence(finger, 1);

        //Move finger into starting position
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),  PointerInput.Origin.viewport(), this.xStartPoint, this.yStartPoint));

        //Finger comes down into contact with screen
        swipe.addAction(finger.createPointerDown(0));

        //Finger moves to end position
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), this.xEndPoint, this.xStartPoint));

        //Get up Finger from Screen
        swipe.addAction(finger.createPointerUp(0));
        this.appiumDriver.perform(Arrays.asList(swipe));
    }



    public void swipeVertically(int count) {
        for(int initTime = 0; initTime < count; initTime++) {
            this.swipeVertically(this.swipeArea);
        }
    }
    public void swipeVertically(WebElement swipeScreen) {


        //Type of Pointer Input
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        //Creating Sequence object to add actions
        Sequence swipe = new Sequence(finger, 1);

        //Move finger into starting position
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),  PointerInput.Origin.viewport(), this.xStartPoint, this.yStartPoint));

        //Finger comes down into contact with screen
        swipe.addAction(finger.createPointerDown(0));
        //Finger moves to end position
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),this.xEndPoint, this.yEndPoint));

        //Get up Finger from Screen
        swipe.addAction(finger.createPointerUp(0));
        appiumDriver.perform(Arrays.asList(swipe));
    }
}
