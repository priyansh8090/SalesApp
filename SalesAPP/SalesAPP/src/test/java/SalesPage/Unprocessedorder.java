package SalesPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseSales.BaseSales;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class Unprocessedorder extends BaseSales{
	
	CreateorderPage createorder = new CreateorderPage();
	
	
	public void user_click_the_item_tab() {
		
		WebElement itemtab=driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰄑\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    itemtab.click();
	}


	public void user_click_the_home_icon() {
		/*
		 * WebElement homeicon=driver.findElement(By.xpath(
		 * "//android.widget.TextView[@text=\"󰋜\"]"));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * homeicon.click();
		 */
		int attempts = 0;
	    while (attempts < 3) {
	        try {
	            WebElement homeicon = driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰋜\"]"));
	            homeicon.click();
	            break;
	        } catch (StaleElementReferenceException e) {
	            attempts++;
	            System.out.println("Stale element exception caught, retrying...");
	        }
	    }
	}
	
	

	
	public void user_show_the_pop_up_message() throws InterruptedException {
		
		WebElement popmessage = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]"));
		Assert.assertNotNull(popmessage);

		Assert.assertEquals("Alert", popmessage.getText());
		Thread.sleep(2000);

		System.out.println("Alret screen is visible");
	   
	}


	public void user_click_the_ok_button() {
		
		WebElement okbutton=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		okbutton.click();
		
	}


	public void user_click_top_on_vertical_line() throws InterruptedException {
		/*
		 * WebElement verticaline=driver.findElement(By.xpath(
		 * "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"));
		 * Thread.sleep(2000); verticaline.click();
		 */
		  By locator = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
		    if (driver.findElements(locator).size() > 0) {
		        WebElement verticaline = driver.findElement(locator);
		        verticaline.click();
		    } else {
		        System.out.println("Element not found: " + locator);
		    }
		}
	


	public void user_click_the_order_dropdown() {
	   
		WebElement orderdropdown=driver.findElement(By.xpath("(//android.widget.TextView[@text=\"󰄑\"])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		orderdropdown.click();
	}


	public void user_click_the_unprocessed_order() {
		WebElement unprocessedorder=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Unprocessed Orders\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		unprocessedorder.click();
	  
	}

	
	public void user_scroll_up_end_of_the_page() {
		
		driver.findElement(
			MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(500);"));
		
		
	}
	
	public void user_click_the_last_row() {
		
		WebElement lastrow=driver.findElement(By.xpath("(//android.widget.TextView[@text=\"ShubhamLLC\"])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		lastrow.click();
		
		
	  
	}

	
	
	
	
	

}
