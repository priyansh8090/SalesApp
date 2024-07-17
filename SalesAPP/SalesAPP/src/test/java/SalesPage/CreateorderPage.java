package SalesPage;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseSales.BaseSales;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CreateorderPage extends BaseSales {

	LoginPage login = new LoginPage();

	public void user_select_the_market_dropdown() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select Market\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dropdown.click();
		System.out.println(dropdown);

	}

	public void select_the_market() {
		WebElement AtlantaMarket = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Atlanta Market\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AtlantaMarket.click();
	}

	public void user_click_account_box() {
		WebElement Account = driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"icon-button\"])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Account.click();

	}

	public void user_enter_the_search_box() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int attempts = 0;
		boolean success = false;

		while (attempts < 3) {
			try {
				WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//android.widget.EditText[@resource-id=\"search-bar\"]")));
				searchbox.sendKeys("Shubham");
				WebElement searchbar = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"search\"]")));
				searchbar.click();

				// Wait until the result element is visible
				WebElement name = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"ShubhamLLC\"]")));
				success = true;
				break; // Exit the loop if no exception occurred
			} catch (StaleElementReferenceException e) {
				attempts++;
				Thread.sleep(1000); // Add a short delay before retrying
			}
		}

		if (!success) {
			throw new RuntimeException("Failed to interact with the search box after multiple attempts");
		}

		Thread.sleep(3000); // Optional: Add a short sleep if needed
	}

	public void user_search_the_any_three_option() {
		System.out.println("user search the Name");
	}

	public void user_click_the_search_icon() {
		System.out.println("user click the search icon");
	}

	public void user_select_the_name() throws InterruptedException {
		WebElement selectname = driver.findElement(By.xpath("//android.widget.TextView[@text=\"ShubhamLLC\"]"));
		Thread.sleep(3000);
		selectname.click();

	}

	public void user_click_the_create_order() {
		WebElement createorder = driver
				.findElement(By.xpath("//android.widget.Button[@content-desc=\"Create Order\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		createorder.click();

	}

	public void user_search_the_product() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		int attempts = 0;
		boolean success = false;

		while (attempts < 3) {
			try {
				// Wait until the search input is visible and interactable
				WebElement searchproduct = driver
						.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
				searchproduct.sendKeys("Hand");
				Actions actions = new Actions(driver);
				actions.moveToElement(searchproduct).sendKeys(Keys.ENTER).perform();

				WebElement productserach = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Back\"]")));

				// Explicit wait until the element becomes interactable
				wait.until(ExpectedConditions.elementToBeClickable(productserach));

				success = true;
				break; // Exit the loop if no exception occurred
			} catch (StaleElementReferenceException e) {
				attempts++;
				try {
					Thread.sleep(1000); // Add a short delay before retrying
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}

		if (!success) {
			throw new RuntimeException("Failed to interact with the search box after multiple attempts");
		}

	}

	public void user_click_the_product() {
		WebElement clickproduct = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Finished Good\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickproduct.click();

	}

	public void user_select_the_product_addto_card() {
		WebElement addtocart = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"fab-content\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		addtocart.click();

	}

	public void user_search_the_again_product() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		int attempts = 0;
		boolean success = false;

		while (attempts < 3) {
			try {
				// Wait until the search input is visible and interactable
				WebElement searchproduct = driver
						.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
				searchproduct.sendKeys("rug");
				Actions actions = new Actions(driver);
				actions.moveToElement(searchproduct).sendKeys(Keys.ENTER).perform();

				WebElement productserach = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Back\"]")));

				// Explicit wait until the element becomes interactable
				wait.until(ExpectedConditions.elementToBeClickable(productserach));

				success = true;
				break; // Exit the loop if no exception occurred
			} catch (StaleElementReferenceException e) {
				attempts++;
				try {
					Thread.sleep(1000); // Add a short delay before retrying
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}

		if (!success) {
			throw new RuntimeException("Failed to interact with the search box after multiple attempts");
		}

	}

	public void user_click_the_product_and_check_the_deatils() {

		/*
		 * // Scroll down JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 * 
		 * // Wait for a few seconds to ensure the page has finished loading try {
		 * Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
		 */
		WebElement prodoct = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Finished Good\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		prodoct.click();

		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Product Details\"]"));
		Assert.assertNotNull(element);
		Assert.assertEquals("Product Details", element.getText());

		System.out.println("Product Details page is visible");
	}

	public void user_click_the_product_add_to_card() {

		WebElement addtocard = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"fab-content\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		addtocard.click();

	}

	public void user_click_the_details_button() {

		WebElement detailsbutton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Details\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		detailsbutton.click();
	}

	public void user_select_the_order_type_dropdown() {

		WebElement ordertypedropdown = driver
				.findElement(By.xpath("//android.widget.TextView[@text=\"Select Order Type\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ordertypedropdown.click();
	}

	public void user_select_the_valu_in_ordertype_dropdown() {
		WebElement likedvalue = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Liked\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		likedvalue.click();

	}

	public void user_select_the_ship_date() {

		// Get the current system date
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String systemDate = dateFormat.format(currentDate);

		// Find the ship date element and click on it
		WebElement shipdate = driver
				.findElement(By.xpath("//android.widget.Button[@content-desc=\"" + systemDate + "\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		shipdate.click();

		WebElement confirmpopup = driver
				.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		confirmpopup.click();

	}

	public void user_select_the_ship_completed_radio_button() {
		WebElement ShipCompleted = driver.findElement(By.xpath("//android.widget.Switch"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ShipCompleted.click();

	}

	public void user_select_the_shipping_address() {

		WebElement selectAddress = driver
				.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Address\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		selectAddress.click();

	}

	public void user_select_the_first_address() {
		WebElement FirstAddress = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"󰄰\"])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FirstAddress.click();
	}

	public void user_click_the_freight_dropdown() {

		WebElement FreightDropDown = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select Shipping\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FreightDropDown.click();
	}

	public void user_select_freight_dropdown_valu() {
		WebElement Normalselect = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Normal Shipping\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Normalselect.click();
	}

	public void user_clik_summary_page() {
		WebElement SummaryPage = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Summary\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SummaryPage.click();

	}

	public void user_scroll_up_the_summary_page() {
		
		  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
		
		}
	    
public void user_click_email_customer_tongle() {
	  WebElement custEmail=driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Switch[1]"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  custEmail.click();
   
}


public void user_again_scroll_up_the_page() {
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
}



public void user_click_the_email_rep() {
	WebElement emailrep=driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Switch[2]"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	emailrep.click();
  
}



public void user_scoll_up_the_summary_page() {
 
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
	
}


public void user_scoll_up_the_summary_page_screen() {
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
}



public void user_enter_the_email(String Emailaddress) {
	
	WebElement emailaddress= driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	emailaddress.sendKeys(Emailaddress);
   
}

	public void user_click_the_sumbit_button() {
		WebElement Submitbutton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Submitbutton.click();

	}
	
	

	public void click_the_print_button() {
		WebElement Printbutton = driver.findElement(By.xpath(""));
		//WebElement okbutton = driver.findElement(By.xpath(""));
		Printbutton.click();
		
	}


}
