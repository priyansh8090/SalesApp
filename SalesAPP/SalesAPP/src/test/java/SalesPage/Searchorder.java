package SalesPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseSales.BaseSales;
import io.appium.java_client.MobileBy;


public class Searchorder extends BaseSales {

	CreateorderPage createorder = new CreateorderPage();

	public void user_click_the_order_page() {

		WebElement orderpage = driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰄑\"]"));
		orderpage.click();

	}

	public void user_click_the_owner() {

		WebElement owner = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Owner\"]"));
		owner.click();

	}

	public void user_select_the_owner_dropdown_value() {
		// Find the element with the name "Anshu Tyagi"
		WebElement anshuTyagiElement = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Anshu Tyagi\"]"));
		try {
			// Click on the element to select it
			anshuTyagiElement.click();
		} catch (StaleElementReferenceException e) {
			// Refresh the element reference
			anshuTyagiElement = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Anshu Tyagi\"]"));
			anshuTyagiElement.click();
		}

		// Click on the back button
		WebElement back = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		try {
			back.click();
		} catch (StaleElementReferenceException e) {
			// Refresh the element reference
			back = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
			back.click();
		}
	}

	public void user_click_the_order_writer_name() {
		WebElement orderwriter = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Order Writer\"]"));
		orderwriter.click();

		WebElement orderwrite = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Anshu Tyagi\"]"));
		orderwrite.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);"));
		WebElement back1 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		back1.click();

	}

public void user_select_the_order() throws InterruptedException, AWTException {
	
	
	WebElement ordernumber = driver.findElement(
			By.xpath("//android.widget.EditText[@resource-id=\"text-input-flat\" and @text=\"Enter Order Number\"]"));
	// Create a Robot instance
	
	ordernumber.sendKeys("54S0013762");
	Robot robot = new Robot();

	// Perform keyword action to enter order number
	ordernumber.click();
	
	robot.delay(1000); 
	// Perform keyword action to press ENTER
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	WebElement getorder = driver.findElement(By.xpath("//android.widget.TextView[@text=\"SHUBHAM0000\"]"));
	Assert.assertNotNull(getorder);

	Assert.assertEquals("SHUBHAM0000", getorder.getText());
	Thread.sleep(2000);

	System.out.println("get order screen is visible");
}




	
	
	
	
	
	
	
	

}
