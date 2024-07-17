package stepDefinition;

import java.io.IOException;

import BaseSales.BaseSales;
import SalesPage.LoginPage;
import SalesPage.Newcustomer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewcustStep extends BaseSales {

	Newcustomer cust = new Newcustomer();

	@Then("I am on the create account page")
	public void i_am_on_the_create_account_page() {
		cust.i_am_on_the_create_account_page();
	}

	@When("I enter a valid first name {string}")
	public void i_enter_a_valid_first_name(String firstName) {
		cust.i_enter_a_valid_first_name(firstName);
	}

	@When("I enter a valid last name {string}")
	public void i_enter_a_valid_last_name(String lastNames) {
		cust.i_enter_a_valid_last_name(lastNames);
	}

	@When("I enter a valid company name {string}")
	public void i_enter_a_valid_company_name(String companyName) {
		cust.i_enter_a_valid_company_name(companyName);

	}

	@When("I enter a valid phone number {string}")
	public void i_enter_a_valid_phone_number(String phoneNumber) {
		cust.i_enter_a_valid_phone_number(phoneNumber);
	}

	@When("I enter a valid email {string}")
	public void i_enter_a_valid_email(String email) {
		cust.i_enter_a_valid_email(email);
	}

	@When("I click on the Next button")
	public void i_click_on_the_next_button() {
		cust.i_click_on_the_next_button();
	}

	@Then("I should be redirected to the billing information Tab")
	public void i_should_be_redirected_to_the_billing_information_tab() {
		cust.i_should_be_redirected_to_the_billing_information_tab();
	}

	@Then("user select the Country dropdown")
	public void user_select_the_country_dropdown() {
		cust.user_select_the_country_dropdown();
	}

	@Then("user select the value in Country dorpdown")
	public void user_select_the_value_in_country_dorpdown() {
		cust.user_select_the_value_in_country_dorpdown();
	}

	@Then("user select the state")
	public void user_select_the_state() {
	 cust.user_select_the_state();
	}

	@Then("user select state value")
	public void user_select_state_value() {
		cust.user_select_state_value();
	}

	@Then("user select the Address")
	public void user_select_the_address() {
		cust.user_select_the_address();
	}

	@Then("user enter the city")
	public void user_enter_the_city() {
		cust.user_enter_the_city();
	}

	@Then("user enter the Zipcode")
	public void user_enter_the_zipcode() {
		cust.user_enter_the_zipcode();
	}

	@Then("user click the checkbox")
	public void user_click_the_checkbox() {
	 cust.user_click_the_checkbox();
	}

	@Then("user click the create Account")
	public void user_click_the_create_account() {
		cust.user_click_the_create_account();
	}

}
