package SalesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseSales.BaseSales;

public class Registration extends BaseSales {

	CreateorderPage createorder = new CreateorderPage();
	

	public void user_click_the_registration_user() {
		
		WebElement register =driver.findElement(By.xpath(""));
		register.click();
	  
	}
	
	public void user_enter_the_first_name(String string) {
		
		WebElement firstname =driver.findElement(By.xpath(""));
		firstname.sendKeys();
	}


	public void user_enter_the_last_name(String string) {
		
		WebElement lastName =driver.findElement(By.xpath(""));
		lastName.sendKeys();
	}


	public void user_enter_the_new_password(String string) {
		
		WebElement newPassword =driver.findElement(By.xpath(""));
		newPassword.sendKeys();
	}


	public void user_enter_the_phone_number_number(String string) {
		
		WebElement phoneNumber =driver.findElement(By.xpath(""));
		phoneNumber.sendKeys();
	}


	public void user_enter_the_designation(String string) {
		
		WebElement designation  =driver.findElement(By.xpath(""));
		designation.sendKeys();
	  
	}

	
	public void user_select_the_role_in_dropdown() {
		
		WebElement role =driver.findElement(By.xpath(""));
		role.click();
		
	  
	}

	
	public void user_the_enter_the_select_the_role() {
		
		WebElement selectvalueuser =driver.findElement(By.xpath(""));
		selectvalueuser.click();
		WebElement selectvalueAdmin =driver.findElement(By.xpath(""));
		selectvalueAdmin.click();
		
		
		
	}

	
	public void user_enter_the_manager_name(String string) {
		
		WebElement managername =driver.findElement(By.xpath(""));
		managername.sendKeys("");
		
	   
	}


	public void user_enter_the_companay_name_dropdown() {
		
		WebElement companyName =driver.findElement(By.xpath(""));
		companyName.click();

		
	}


	public void user_select_the_company_name() {
		
		WebElement companyNamevalue =driver.findElement(By.xpath(""));
		companyNamevalue.click();
	}

	
	public void user_click_submit_button() {
		
		WebElement sumbmitbutton =driver.findElement(By.xpath(""));
		sumbmitbutton.click();
	  
	}

	
	
	
}
