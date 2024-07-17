package stepDefinition;

import BaseSales.BaseSales;
import SalesPage.ProductTab;
import io.cucumber.java.en.Then;

public class ProductStep extends BaseSales {
	
	ProductTab prod = new ProductTab();
	
	
	@Then("user select the product tab")
	public void user_select_the_product_tab() {
		prod.user_select_the_product_tab();
	    
	}
	

	@Then("user enter the any text")
	public void user_enter_the_any_text() {
		prod.user_enter_the_any_text();
	  
	}

	@Then("user scroll the up page")
	public void user_scroll_the_up_page() {
		prod.user_scroll_the_up_page();
	  
	}

	@Then("user enter the UPC number")
	public void user_enter_the_upc_number() {
		prod.user_enter_the_upc_number();
	  
	}

	@Then("user enter the ID of product")
	public void user_enter_the_id_of_product() throws InterruptedException {
		prod.user_enter_the_id_of_product();
	   
	}

	
	
	
	
	

}
