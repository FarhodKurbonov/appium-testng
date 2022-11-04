package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverExtensions {
    public static AndroidDriver  getAppiumDriver(){
        //Driver instance
        AndroidDriver appiumDriver = null;
        try {
            //Set Desired Capability to Appium Server
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(MobileCapabilityExtension.APPIUM_PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityExtension.APPIUM_AUTOMATION_NAME,"UIAutomator2");
            dc.setCapability(MobileCapabilityExtension.APPIUM_UIDID,"emulator-5556");
            dc.setCapability(MobileCapabilityExtension.APPIUM_APP_PACKAGE,"com.wdiodemoapp");
            dc.setCapability(MobileCapabilityExtension.APPIUM_APP_ACTIVITY,"com.wdiodemoapp.MainActivity");
            dc.setCapability(MobileCapabilityExtension.APPIUM_NEW_COMMAND_TIMEOUT,120);

            URL appiumServer = new URL("http://localhost:4274");

            appiumDriver = new AndroidDriver(appiumServer, dc);
            appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appiumDriver;
    }
}
