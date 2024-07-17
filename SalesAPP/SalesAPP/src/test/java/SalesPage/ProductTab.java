package SalesPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseSales.BaseSales;
import io.appium.java_client.MobileBy;

public class ProductTab extends BaseSales{
	
	Newcustomer cust = new Newcustomer();	
	
	public void user_select_the_product_tab() {
		
		WebElement prodtab =driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰁲\"]"));
		prodtab.click();
	}
	


	public void user_enter_the_any_text() {
		WebElement searchbox =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
		searchbox.click();
		WebElement Text =driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Text.sendKeys("hand");
		Actions actions = new Actions(driver);
		actions.moveToElement(Text).sendKeys(Keys.ENTER).perform();
		
		  
	}

	
	public void user_scroll_the_up_page() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
	}


	public void user_enter_the_upc_number() {
	
		WebElement UPCnum=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		UPCnum.sendKeys("651083480267");
		Actions actions = new Actions(driver);
		actions.moveToElement(UPCnum).sendKeys(Keys.ENTER).perform();
		
	
	}


	public void user_enter_the_id_of_product() throws InterruptedException {
		
		WebElement ID=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\"]"));
		ID.sendKeys("-21");
		Actions actions = new Actions(driver);
		actions.moveToElement(ID).sendKeys(Keys.ENTER).perform();
	  
	}

	
	
	

}
