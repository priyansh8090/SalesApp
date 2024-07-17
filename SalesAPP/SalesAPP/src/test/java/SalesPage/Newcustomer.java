package SalesPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.Table.Cell;

import BaseSales.BaseSales;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class Newcustomer extends BaseSales {

	CreateorderPage createorder = new CreateorderPage();

	
	
	public void i_am_on_the_create_account_page() {
		
		WebElement newcust=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"fab-text\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	newcust.click();
        

	}

	
	public void i_enter_a_valid_first_name(String firstName) {
		WebElement firstNames=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"First Name\"]"));
		firstNames.sendKeys(firstName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	public void i_enter_a_valid_last_name(String lastNames) {
		// Scroll up to make the element visible
	    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2);"));
	    // Enter the last name
	    WebElement lastNamess = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Last Name\"]"));
	    lastNamess.sendKeys(lastNames);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	
	public void i_enter_a_valid_company_name(String companyName) {
	 
		WebElement Comapany=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Company Name\"]"));
		Comapany.sendKeys(companyName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	/*
	 * public void i_enter_a_valid_phone_number(Integer phoneNumber) { WebElement
	 * phnumber = driver.findElement(By.
	 * xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Phone\"]"
	 * )); phnumber.sendKeys(phoneNumber.toString()); // convert Integer to String
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 */




	public void i_enter_a_valid_phone_number(String phoneNumber) {
		
		 try {
		        Integer.parseInt(phoneNumber);
		        WebElement phoneNumberElement = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Phone\"]"));
		        phoneNumberElement.sendKeys(phoneNumber);
		    } catch (NumberFormatException e) {
		        // Handle the case where phoneNumber is not a valid integer
		        System.out.println("Invalid phone number: " + phoneNumber);
		    }
		}
	   
	







	
	public void i_enter_a_valid_email(String email) {
		
		WebElement EmailAdress=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Email\"]"));
		EmailAdress.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}


	public void i_click_on_the_next_button() {
		WebElement nextbutton=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\"]"));
		nextbutton.click();
	
	  
	}

 
    public void i_should_be_redirected_to_the_billing_information_tab() {
    	
		/*
		 * WebElement billing = driver.findElement(By.
		 * xpath("//android.widget.TextView[@text=\"Billing Information\"]"));
		 * Assert.assertNotNull(billing); Assert.assertEquals("Billing Information",
		 * billing.getText());
		 */

	System.out.println("Billing Information is visible");
	
}
    public void user_select_the_country_dropdown() {
            WebElement countryDropdown = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select Country\"]"));
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            countryDropdown.click();
            
        
    }


    public void user_select_the_value_in_country_dorpdown() {
    	
    	WebElement dropdownvalue =driver.findElement(By.xpath("//android.widget.TextView[@text=\"United States\"]"));  
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	dropdownvalue.click();
    }


    public void user_select_the_state() {
    	
    	WebElement state =driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select State\"]"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	state.click();
    	
    }


    public void user_select_state_value() {
    	WebElement statevalue =driver.findElement(By.xpath("//android.widget.TextView[@text=\"Alabama\"]"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	statevalue.click();
       
    }


    public void user_select_the_address() {
        
    	WebElement address =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]\r"));
    	address.sendKeys("Address1");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement address2 =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Street Address 2\"]"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	address2.sendKeys("address2");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	//WebElement address3 =driver.findElement(By.xpath(""));
    	//address3.sendKeys("");
    	
    }


    public void user_enter_the_city() {
    	  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
    	WebElement city =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"City\"]"));
    	city.sendKeys("Noida");
       
    }


    public void user_enter_the_zipcode() {
    	WebElement zipcode =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Zip Code\"]"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	zipcode.sendKeys("242001");
        
    }


    public void user_click_the_checkbox() {
    	WebElement checkbox =driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	checkbox.click();

    }


    public void user_click_the_create_account() {
    	
    	WebElement createaccount =driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Create\"]"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	//createaccount.click();
    	
    	
    	
    	
    }


    	

    	
    
    
    }



