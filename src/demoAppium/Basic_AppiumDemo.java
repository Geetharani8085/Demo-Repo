package demoAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class Basic_AppiumDemo extends AppiumDemoPjt {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		Capabilities();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"3. Preference dependencies\")").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("geeth");
		driver.findElement(By.id("android:id/button1")).click();
		driver.navigate().back();
		driver.navigate().back();
		//driver.findElementsByClassName("android.widget.Button").get(0).click();
	
		
	}

}
