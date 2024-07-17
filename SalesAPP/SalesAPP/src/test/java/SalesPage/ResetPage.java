package SalesPage;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseSales.BaseSales;
import Database.TestData;

public class ResetPage extends BaseSales {

	
	TestData otppage = new TestData();
	
	public void user_navigate_to_the_application() throws MalformedURLException, InterruptedException {

		setup();

	}

	public void user_click_the_reset_password_link() throws InterruptedException {
		
		WebElement resetpassword =driver.findElement(By.xpath("//android.widget.TextView[@text=\"Reset Password\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		resetpassword.click();

	}


	public void user_enter_the_email1() throws InterruptedException {
	WebElement EmailAddress  = 	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Email\"]"));

	EmailAddress.sendKeys("Priyansh.jauhari@innoage.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		
	}

	
	public void enter_the_new_password() throws InterruptedException {

		WebElement newpassword =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Password\"]"));
		newpassword.sendKeys("Rishu@8090");
	}


	public void user_click_on_the_reset_password() throws InterruptedException {
		
		WebElement resetpassword=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		resetpassword.click();
		
	
		
	}


	public void otp_screen_are_visible() throws InterruptedException {
		 WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Verification Code\"]"));
	        Assert.assertNotNull(element);
	        
	        Assert.assertEquals("Verification Code", element.getText());
	        Thread.sleep(2000);
	
		System.out.println("OTP screen is visible");
	}
		


	public String user_enter_the_otp() throws InterruptedException {
		TestData otppage = new TestData();
		WebElement otppages =  driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
		String testOTP = otppage.OTP_page();
		  otppages.sendKeys(testOTP);
        
		return testOTP;
		
		
		
	}

	public void user_click_the_verify_button() throws InterruptedException {
		WebElement verify=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		verify.click();
		
	}

	
	public void pop_up_message_will_show() throws InterruptedException {
		WebElement message=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(message);
		
	}


	public void click_the_pop_up_message_ok_button() throws InterruptedException {
		WebElement alert = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		alert.click();
		
	}

	
	public void user_back_to_the_login_page() throws InterruptedException {
		
		//WebElement loginpageverify=driver.findElement(By.xpath("//android.widget.TextView[@text=\"v2.3.0\"]"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println(loginpageverify);
		
	}


	public void user_enter_the_email() throws InterruptedException {
		WebElement Email  = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Email\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Email.sendKeys("Priyansh.jauhari@innoage.in");
		
	}

	
	public void user_enter_the_password() throws InterruptedException {
		WebElement Password  = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Password\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Password.sendKeys("Rishu@8090");
	}
	

	public void user_click_the_login_button() throws InterruptedException {
		WebElement loginbutton  = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Sign In\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginbutton.click(); 
		
	}

	
	/*
	 * public String user_enter_the_login_otp() { TestData otppage = new TestData();
	 * WebElement otppages = driver.findElement(By.xpath(
	 * "//android.widget.EditText[@resource-id=\"text-input-flat\"]")); String
	 * testOTP = otppage.OTP_page(); otppages.sendKeys(testOTP);
	 * 
	 * return testOTP;
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	public String user_enter_the_login_otp() {
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
	                Thread.sleep(2000); // wait for half a second
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
	

	
	public void user_click_the_login_verify_button() {
		WebElement submit = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		submit.click();

	   
	}



}
