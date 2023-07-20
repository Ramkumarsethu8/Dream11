package dream11;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class Dream11{
	public static void main(String[] args) throws MalformedURLException {
		
		
try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", " ");
		caps.setCapability("platformVersion", " ");
		caps.setCapability("deviceName", "");
		caps.setCapability("appPackage", " ");
		caps.setCapability("appActivity", " ");
		caps.setCapability("appPath", " ");

		URL url = new URL("http://localhost:4723/wd/hub");
		
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, caps);
 
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		TouchAction action = new TouchAction(driver);

		MobileElement loginButton = driver.findElement(MobileBy.id(""));
		action.tap(ElementOption.element(loginButton)).perform();
		MobileElement enterNumber = driver.findElement(MobileBy.id(""));
		enterNumber.sendKeys("");
		MobileElement continueButton = driver.findElement(MobileBy.id(""));
		action.tap(ElementOption.element(continueButton)).perform();
		List<MobileElement> otp = driver.findElements(MobileBy.id(""));
		otp.get(0).sendKeys("");
		otp.get(1).sendKeys("");
		otp.get(2).sendKeys("");
		otp.get(3).sendKeys("");
		otp.get(4).sendKeys("");
		otp.get(5).sendKeys("");

		MobileElement continueButton1 = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(continueButton1)).perform();

		MobileElement selectCricket = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(selectCricket)).perform();
		
		MobileElement selectMatch = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(selectMatch)).perform();
		
		MobileElement selectTeam = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(selectTeam)).perform();
		
		MobileElement createTeamButton = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(createTeamButton)).perform();
		
		MobileElement wkSelection = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(wkSelection)).perform();
		
		MobileElement WK1Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(WK1Player)).perform();
		
		MobileElement WK2Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(WK2Player)).perform();
		
		MobileElement batSelection = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(batSelection)).perform();
		
		MobileElement BAT1Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(BAT1Player)).perform();
		
		MobileElement BAT2Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(BAT2Player)).perform();
		
		MobileElement BAT3Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(BAT3Player)).perform();
		
		MobileElement arSelection = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(arSelection)).perform();
		
		MobileElement AR1Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(AR1Player)).perform();
		
		MobileElement AR2Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(AR2Player)).perform();
		
		MobileElement AR3Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(AR3Player)).perform();
		
		MobileElement bowlSelection = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(bowlSelection)).perform();
		
		MobileElement BOWL1Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(BOWL1Player)).perform();
		
		MobileElement BOWL2Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(BOWL2Player)).perform();
		
		MobileElement BOWL3Player = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(BOWL3Player)).perform();
		
		MobileElement nextButton = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(nextButton)).perform();
		
		MobileElement save = driver.findElement(MobileBy.xpath(""));
		action.tap(ElementOption.element(save)).perform();

		driver.quit();
		
}catch (Exception e) {
	System.out.println(e.getMessage());

}
	}

}
