package demoAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidElement;

public class UIAutomator extends AppiumDemoPjt {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		Capabilities();
		driver.findElementByAndroidUIAutomator(("text(\"Views\")")).click();
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	//AndroidElement truevar = 	driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		
	TouchActions t = new TouchActions(driver);
	
  WebElement Element;
//t.singleTap(WebElement(Element)).
		
		
		
	}

	private static WebElement WebElement(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

}
