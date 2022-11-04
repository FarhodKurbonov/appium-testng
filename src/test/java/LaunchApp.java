import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class LaunchApp {
    public static void main(String[] args) {
        try {
            //Driver instance
            AndroidDriver androidDriver;

            //Set Desired Capability to Appium Server
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("platformName", "Android");
            dc.setCapability("automationName","UIAutomator2");
            dc.setCapability("udid","emulator-5556");
            dc.setCapability("appPackage","com.wdiodemoapp");
            dc.setCapability("appActivity","com.wdiodemoapp.MainActivity");

            URL appiumServer = new URL("http://localhost:4723");

            androidDriver = new AndroidDriver(appiumServer, dc);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
