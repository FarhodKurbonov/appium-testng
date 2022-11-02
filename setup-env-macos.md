
#### Show actual JAVA_HOME 
` /usr/libexec/java_home`

#### Create Folders in 
~/Library/Android/sdk

#### Install SDK Package and specify env variables

`$ curl https://dl.google.com/android/repository/commandlinetools-mac-8512546_latest.zip`  

##### In ~/.zshrc put these envs

`export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
export JAVA_HOME="/Users/fkurbonov/Library/Java/JavaVirtualMachines/corretto-17.0.4.1/Contents/Home"
export ANDROID_HOME="/Users/fkurbonov/Library/Android/sdk"
export ANDROID_SDK_ROOT="/Users/fkurbonov/Library/Android/sdk"
export ANDROID_SDK_HOME="/Users/fkurbonov/Library/Android/sdk"
export PATH="$JAVA_HOME/bin:$PATH"
export PATH="$ANDROID_HOME/cmdline-tools/tools/bin:$PATH"`

#### Install Platform-Tools and Emulator
`$ sdkmanager platform-tools emulator`
#### Add this to ~/.zshrc file
`export PATH="$ANDROID_HOME/platform-tools:$PATH"
export PATH="$ANDROID_HOME/emulator:$PATH"`

### Install Packages for AVD (system-images, platforms, build-tools)
___
#### Download sdk platform (https://developer.android.com/studio/releases/platforms)

`$ sdkmanager "platforms;android-30"`

#### Download sdk build tools and system images (https://developer.android.com/studio/releases/build-tools)
- List All System Images Available for Download:
    - `sdkmanager --list | grep system-images`
- Install selected image
  - `$ sdkmanager --install "system-images;android-30;default;arm64-v8a"`
- Download build tools  (https://developer.android.com/studio/releases/build-tools)
`$ sdkmanager "build-tools;30.0.2"`

#### Create AVD
`avdmanager create avd --name **android_30** --package "system-images;android-30;default;arm64-v8a"`

#### Launch Emulator by using command line tools
`emulator **@android_30**`

#### Useful commands

```shell
#List of runned devices
adb devices
# sample output
== List of devices attached ==
emulator-5554   device

```
#### Install app into adb device
```shell
$ adb -s your-adb-device-name install /path/to/your/apk/file
#Sample output
Performing Streamed Install
Success
```

#### SSH into device shell
```shell
$ adb -s your-adb-device-id shell
```
#### Get App info that is run inside device
Run this command inside device shell
```shell
$ dumpsys window windows
```

### Install appium inspector

Download it from https://github.com/appium/appium-inspector/releases
`curl https://github.com/appium/appium-inspector/releases | bash `

### Connect Appium Inspector to Emulator and  Appum server

#### Set Device Desired Capabilities in Inpector and save them
```yaml
{
  "appPackage": "com.wdiodemoapp",
  "appActivity": "com.wdiodemoapp.MainActivity",
  "udid": " emulator-5554",
  "automationName": "UIAutomator2",
  "platformName": "Android"
}
```

----
### Install Dependencies
You need to install neccessary java libs
```yamlÎ
appium java client
selenium java binding
guava
apache common lang
PS: Need to add all selenium depended libs as lib in IDEA->Files-ProjectStructure->+->Add Lib->Select lib folder inside selenium unararchiec package
```









