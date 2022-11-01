package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class LaunchApp {
    public static void main(String[] args) {
        try {
            //Driver instance
            AppiumDriver appiumDriver = null;

            //Set Desired Capability to Appium Server
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiutomator2");
//            dc.setCapability(MobileCapabilityType.UDID,"emulator_5558");
            dc.setCapability("deviceName","Pixel 5 API 30");
            dc.setCapability("appPackage","com.wdiodemoapp");
            dc.setCapability("appActivity","com.wdiodemoapp.MainActivity");

            URL appiumServer = new URL("http://localhost:4723/wd/hub");

            appiumDriver = new AppiumDriver(appiumServer, dc);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
