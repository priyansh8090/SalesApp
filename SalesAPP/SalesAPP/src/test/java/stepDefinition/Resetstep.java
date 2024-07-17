package stepDefinition;

import java.net.MalformedURLException;

import BaseSales.BaseSales;
import SalesPage.ResetPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Resetstep extends BaseSales{
	
	ResetPage reset = new ResetPage();
	
	@Given("user navigate to the Application")
	public void user_navigate_to_the_application() throws MalformedURLException, InterruptedException {
		reset.user_navigate_to_the_application();
	}

	@Given("user click the Reset password link")
	public void user_click_the_reset_password_link() throws InterruptedException {
		reset.user_click_the_reset_password_link();
	   
	}

	@When("user enter the Email")
	public void user_enter_the_email() throws InterruptedException {
	   reset.user_enter_the_email();
	}

	@When("enter the new password")
	public void enter_the_new_password() throws InterruptedException {
		reset.enter_the_new_password();
	   
	}

	@When("user click on the Reset Password")
	public void user_click_on_the_reset_password() throws InterruptedException {
		reset.user_click_on_the_reset_password();
	 
	}

	@When("OTP screen are visible")
	public void otp_screen_are_visible() throws InterruptedException {
		reset.otp_screen_are_visible();
	    
	}

	@Then("user enter the OTP")
	public void user_enter_the_otp() throws InterruptedException {
		reset.user_enter_the_otp();
	   
	}

	@Then("user click the verify button")
	public void user_click_the_verify_button() throws InterruptedException {
		
		reset.user_click_the_verify_button();
	    
	}

	@Then("Pop-up message will show")
	public void pop_up_message_will_show() throws InterruptedException {
		reset.pop_up_message_will_show();
	   
	}

	@Then("click the pop-up message ok button")
	public void click_the_pop_up_message_ok_button() throws InterruptedException {
		reset.click_the_pop_up_message_ok_button();
	
	}

	@Then("user back to the login page")
	public void user_back_to_the_login_page() throws InterruptedException {
		reset.user_back_to_the_login_page();
	   
	}

	@Then("user enter the email")
	public void user_enter_the_email1() throws InterruptedException {
		reset.user_enter_the_email1();
	   
	}

	@Then("user enter the password")
	public void user_enter_the_password() throws InterruptedException {
		reset.user_enter_the_password();
	    
	}

	@Then("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
	   reset.user_click_the_login_button();
	}
	
	@Then("user enter the login otp")
	public void user_enter_the_login_otp() {
	   reset.user_enter_the_login_otp();
	}

	@Then("user click the login verify button")
	public void user_click_the_login_verify_button() throws InterruptedException {
		reset.user_click_the_login_verify_button();
	}



}
