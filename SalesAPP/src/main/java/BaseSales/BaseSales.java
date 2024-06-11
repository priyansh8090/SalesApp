package BaseSales;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;

public class BaseSales {

	public static AppiumDriver driver;

	@BeforeClass
	public AppiumDriver setup() throws MalformedURLException, InterruptedException {

		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			// capabilities.setCapability("deviceName",
			// "Pixel_3a_API_34_extension_level_7_x86_64");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("automationName", "uiautomator2");
			capabilities.setCapability("platformVersion", "14.0");
			capabilities.setCapability("appPackage", "com.mobileapp");
			capabilities.setCapability("appActivity", "com.mobileapp.MainActivity");
			// capabilities.setCapability("appium:newCommandTimeout", 60);

			System.out.println("Setting up capabilities");

			URL url = URI.create("http://127.0.0.1:4723/").toURL();
			driver = new AndroidDriver(url, capabilities);
			System.out.println("Driver initialized");

			Thread.sleep(3000);
			System.out.println("Application Started..");

		} catch (MalformedURLException e) {
			System.err.println("Malformed URL: " + e.getMessage());
		} catch (InterruptedException e) {
			System.err.println("Interrupted Exception: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception in setup: " + e.getMessage());
		}
		return null;
	}

	@AfterClass
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				if (driver instanceof TakesScreenshot) {
					byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", "Failure Screenshot");
					System.out.println("Failure screenshot captured.");
				}
			} catch (WebDriverException e) {
				System.err.println("Failed to capture screenshot: " + e.getMessage());
			}
		}

		if (driver != null) {
			driver.quit();
		}
	}

}
