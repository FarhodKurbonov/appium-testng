package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExtensions;

import javax.sound.midi.SysexMessage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class VideoRecord {
    public static void main (String[] args)   {
        AndroidDriver appiumDriver = AppiumDriverExtensions.getAppiumDriver();
        //Start Recording
        appiumDriver.startRecordingScreen();

        //Do something here
        //1. Click on Login Label
        WebElement loginLabel = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();

        //2. Input username
        WebElement emailTxBx = appiumDriver.findElement(AppiumBy.accessibilityId("input-email"));
        emailTxBx.sendKeys("fkurbonov@maildomain.com");


        //3. Input password
        WebElement passwordTxBx = appiumDriver.findElement(AppiumBy.accessibilityId("input-password"));
        passwordTxBx.sendKeys("password");

        //4. Click on Login Btn
        WebElement loginBtn = appiumDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
        loginBtn.click();

        //5. Stop Recording Screen
        String base64output =   appiumDriver.stopRecordingScreen();

        //Save Recorded data
        byte[] decodedVideo = Base64.getDecoder().decode(base64output);

        try {
            Path videoDirectory = Paths.get(System.getProperty("user.dir") + "/videos");
            Files.createDirectories(videoDirectory);
            Path recordedFileLocation =  Paths.get(videoDirectory.toString(), String.format("%s-%d.%s", "recoding", System.currentTimeMillis(), "mp4"));
            Files.write(recordedFileLocation, decodedVideo);

        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
