package BaseSales;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
public class  BaseSales  {

	//public static AppiumDriver driver;
	
	 public static AndroidDriver driver;
	
	
	
	 
	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

		try {
			System.out.println("Setting up capabilities");
			
			//File app =new File("C:\\Users\\91813\\Downloads");
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "14.0");
			capabilities.setCapability("deviceName", "emulator-5554");
			capabilities.setCapability("appPackage", "com.mobileapp");
			capabilities.setCapability("appActivity", "com.mobileapp.MainActivity");
			capabilities.setCapability("automationName", "Uiautomator2");
			
			

			System.out.println("Setting up capabilities");
			
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
		
			 driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"SalesApp\"]\r\n"));
			 
			 
			 

			//URL url = URI.create("http://127.0.0.1:4723/").toURL();
			//System.out.println(url);
			
			//driver = new AndroidDriver(url, capabilities);
			//System.out.println(driver);

			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			System.out.println("Application Started..");

		} catch (MalformedURLException e) {
			System.err.println("Malformed URL: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception in setup: " + e.getMessage());
		}
	
		
	}

	@AfterClass
	public void tearDown(Scenario scenario, AndroidDriver driver) {
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
