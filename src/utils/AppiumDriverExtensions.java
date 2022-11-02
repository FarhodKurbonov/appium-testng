package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverExtensions {
    public static AppiumDriver  getAppiumDriver(){
        //Driver instance
        AppiumDriver appiumDriver = null;
        try {
            //Set Desired Capability to Appium Server
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("platformName", "Android");
            dc.setCapability("automationName","UIAutomator2");
            dc.setCapability("udid","emulator-5556");
            dc.setCapability("appPackage","com.wdiodemoapp");
            dc.setCapability("appActivity","com.wdiodemoapp.MainActivity");

            URL appiumServer = new URL("http://localhost:4723");

            appiumDriver = new AndroidDriver(appiumServer, dc);
            appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appiumDriver;
    }
}
