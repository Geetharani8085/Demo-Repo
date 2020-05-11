package demoAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDemoPjt {
	
	public static AndroidDriver<AndroidElement> driver;
	
public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	
	File f = new File ("src");
	File app = new File (f,"ApiDemos-debug.apk");
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Nexus API 27");
	
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	
	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
	//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	 driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	return driver;
}
}
