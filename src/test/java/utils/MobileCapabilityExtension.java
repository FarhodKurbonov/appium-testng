package utils;

import io.appium.java_client.remote.MobileCapabilityType;

public interface MobileCapabilityExtension extends MobileCapabilityType {

    String APPIUM_APP_PACKAGE = "appPackage";
    String APPIUM_APP_ACTIVITY = "appActivity";
    String APPIUM_PLATFORM_NAME = "platformName";
    String APPIUM_AUTOMATION_NAME = "automationName";
    String APPIUM_UIDID = "udid";
    String APPIUM_NEW_COMMAND_TIMEOUT = "newCommandTimeout";

}
