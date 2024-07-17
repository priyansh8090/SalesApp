package stepDefinition;

import BaseSales.BaseSales;
import SalesPage.CreateorderPage;
import io.cucumber.java.en.Then;

public class CreateorderStep extends BaseSales {

	CreateorderPage order = new CreateorderPage();

	@Then("user select the market dropdown")
	public void user_select_the_market_dropdown() throws InterruptedException {
		order.user_select_the_market_dropdown();
	}

	@Then("select the market")
	public void select_the_market() {
		order.select_the_market();
	}

	@Then("user click Account box")
	public void user_click_account_box() {
		order.user_click_account_box();
	}

	@Then("user enter the search box")
	public void user_enter_the_search_box() throws InterruptedException {
		order.user_enter_the_search_box();
	}

	@Then("user search the any three option")
	public void user_search_the_any_three_option() {
		order.user_search_the_any_three_option();
	}

	@Then("user click the search icon")
	public void user_click_the_search_icon() {
		order.user_click_the_search_icon();
	}

	@Then("user select the name")
	public void user_select_the_name() throws InterruptedException {
		order.user_select_the_name();
	}

	@Then("user click the create order")
	public void user_click_the_create_order() {
		order.user_click_the_create_order();
	}

	@Then("user search the product")
	public void user_search_the_product() {
		order.user_search_the_product();
	}

	@Then("user click the product")
	public void user_click_the_product() {
		order.user_click_the_product();
	}

	@Then("user select the product AddtoCard")
	public void user_select_the_product_addto_card() {
		order.user_select_the_product_addto_card();
	}

	@Then("user search the again product")
	public void user_search_the_again_product() {
		order.user_search_the_again_product();

	}

	@Then("user click the product and check the deatils")
	public void user_click_the_product_and_check_the_deatils() {
		order.user_click_the_product_and_check_the_deatils();

	}

	@Then("user click the product Add to card")
	public void user_click_the_product_add_to_card() {
		order.user_select_the_product_addto_card();
	}

	@Then("user click the details button")
	public void user_click_the_details_button() {
		order.user_click_the_details_button();

	}

	@Then("user select the order type dropdown")
	public void user_select_the_order_type_dropdown() {
		order.user_select_the_order_type_dropdown();
	}

	@Then("user select the valu in ordertype dropdown")
	public void user_select_the_valu_in_ordertype_dropdown() {
		order.user_select_the_valu_in_ordertype_dropdown();

	}

	@Then("user select the ship date")
	public void user_select_the_ship_date() {
		order.user_select_the_ship_date();

	}

	@Then("user select the ship completed radio button")
	public void user_select_the_ship_completed_radio_button() {
		order.user_select_the_ship_completed_radio_button();
	}

	@Then("user select the Shipping Address")
	public void user_select_the_shipping_address() {
		order.user_select_the_shipping_address();
	}

	@Then("user Select the first Address")
	public void user_select_the_first_address() {
		order.user_select_the_first_address();
	}

	@Then("user click the Freight dropdown")
	public void user_click_the_freight_dropdown() {
		order.user_click_the_freight_dropdown();
	}

	@Then("user select Freight dropdown valu")
	public void user_select_freight_dropdown_valu() {
		order.user_select_freight_dropdown_valu();
	}

	@Then("user clik summary page")
	public void user_clik_summary_page() {
		order.user_clik_summary_page();
	}

	@Then("user scroll up the summary page")
	public void user_scroll_up_the_summary_page() {
		order.user_scroll_up_the_summary_page();
	}

	@Then("user click Email customer tongle")
	public void user_click_email_customer_tongle() {
		order.user_click_email_customer_tongle();

	}

	@Then("user again scroll up the page")
	public void user_again_scroll_up_the_page() {
		order.user_again_scroll_up_the_page();
	}

	@Then("user click the Email Rep")
	public void user_click_the_email_rep() {
		order.user_click_the_email_rep();

	}

	@Then("user scoll up the summary page screen")
	public void user_scoll_up_the_summary_page_screen() {
		order.user_scoll_up_the_summary_page_screen();
	}

	@Then("user enter the email {string}")
	public void user_enter_the_email(String Emailaddress) {
		order.user_enter_the_email(Emailaddress);

	}

	@Then("user click the Sumbit button")
	public void user_click_the_sumbit_button() {
		order.user_click_the_sumbit_button();
	}

	@Then("click the Print button")
	public void click_the_print_button() {
		order.click_the_print_button();
	}

}
