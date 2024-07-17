package SalesPage;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseSales.BaseSales;
import Database.TestData;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BaseSales {
	

	public void user_navigate_to_the_application() throws InterruptedException, MalformedURLException {

		setup();

		//WebElement navigate = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Predicted app: SalesApp\"]"));
		//navigate.click();

	}

	public void user_enter_the1(String EmailAdress) throws InterruptedException {
		WebElement EmailAddress = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Email\"]"));
		EmailAddress.sendKeys(EmailAdress);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}       

	public void user_enter_the(String Password) throws InterruptedException {
		WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Password\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		password.sendKeys(Password);

	}

	public void user_click_on_the_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.click();
		
	}

	public void otp_screen_should_open() {
		
		 WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Verification Code\"]"));
	        Assert.assertNotNull(element);
	        Assert.assertEquals("Verification Code", element.getText());
	
		System.out.println("OTP screen is visible");
	}

	public String enter_otp_from_email() throws InterruptedException {

	/*
	 * TestData otppage = new TestData(); WebElement otppages =
	 * driver.findElement(By.xpath(
	 * "//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); String
	 * testOTP = otppage.OTP_page(); otppages.sendKeys(testOTP);
	 * 
	 * return testOTP; }
	 */
		
	    TestData otppage = new TestData();
	    WebElement otppages = null;
	    String testOTP = otppage.OTP_page();
	    int attempts = 0;

	    while (attempts < 3) {
	        try {
	            otppages = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
	            otppages.sendKeys(testOTP);
	            break; // exit the loop if successful
	        } catch (StaleElementReferenceException e) {
	            attempts++;
	            // Optional: Add a small wait to give time for the element to become stable
	            try {
	                Thread.sleep(1000); // wait for half a second
	            } catch (InterruptedException ie) {
	                ie.printStackTrace();
	            }
	        }
	    }

	    if (attempts == 3) {
	        throw new RuntimeException("Failed to enter OTP after multiple attempts");
	    }

	    return testOTP;
	}
	

	public void user_click_submit() {
		WebElement submit = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		submit.click();

	}

	public void user_should_be_able_to_login() {
		
		System.out.println("user successfully login");

	}

	public void home_page_should_be_shown() {
   System.out.println("user shown home screen");
	}

	public void user_select_the_global_views() {
		
		WebElement globalviews = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		globalviews.click();
	   
	}
	/*public void user_select_the_market_dropdown() throws InterruptedException {
	WebElement dropdown=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select Market\"]"));
	dropdown.click();
	Thread.sleep(2000);*/
	}
	


