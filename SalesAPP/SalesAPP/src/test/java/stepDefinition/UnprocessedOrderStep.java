package stepDefinition;

import BaseSales.BaseSales;
import SalesPage.Unprocessedorder;
import io.cucumber.java.en.Then;

public class UnprocessedOrderStep extends BaseSales {
	
	Unprocessedorder processorder = new Unprocessedorder();
	
	
	@Then("user click the item Tab")
	public void user_click_the_item_tab() {
		processorder.user_click_the_item_tab();
	}

	@Then("user click the home icon")
	public void user_click_the_home_icon() {
		processorder.user_click_the_home_icon();
	}

	@Then("user show the pop-up message")
	public void user_show_the_pop_up_message() throws InterruptedException {
		processorder.user_show_the_pop_up_message();
	}

	@Then("user click the ok button")
	public void user_click_the_ok_button() {
		processorder.user_click_the_ok_button();
	}

	@Then("user click top on vertical line")
	public void user_click_top_on_vertical_line() throws InterruptedException {
		processorder.user_click_top_on_vertical_line();
	}

	@Then("user click the order dropdown")
	public void user_click_the_order_dropdown() {
		processorder.user_click_the_order_dropdown();
	}

	@Then("user click the unprocessed order")
	public void user_click_the_unprocessed_order() {
		processorder.user_click_the_unprocessed_order();
	}

	@Then("user scroll up end of the page")
	public void user_scroll_up_end_of_the_page() {
		processorder.user_scroll_up_end_of_the_page();
	}

	@Then("user click the last row")
	public void user_click_the_last_row() {
		processorder.user_click_the_last_row();
	}

	
	
	

}
