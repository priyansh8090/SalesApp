package stepDefinition;

import java.awt.AWTException;

import BaseSales.BaseSales;
import SalesPage.Searchorder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchorderStep extends BaseSales {
	
	Searchorder searchorder = new Searchorder();

@Given("user click the order page")
public void user_click_the_order_page() {
	searchorder.user_click_the_order_page();
	
	
   
}

@Then("user click the owner")
public void user_click_the_owner() {
	searchorder.user_click_the_owner();
   
}

@Then("user select the owner dropdown value")
public void user_select_the_owner_dropdown_value() {
	searchorder.user_select_the_owner_dropdown_value();
   
}

@Then("user click the order writer name")
public void user_click_the_order_writer_name() {
	searchorder.user_click_the_order_writer_name();
   
}

@Then("user select the order")
public void user_select_the_order() throws InterruptedException, AWTException {
	searchorder.user_select_the_order();  
}



}
