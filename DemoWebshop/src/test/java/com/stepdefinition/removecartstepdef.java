package com.stepdefinition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class removecartstepdef extends Library {
	CartPage Rcp;
	ProductsPage pp;
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I launch the homepage$")
	public void i_launch_the_homepage() throws Throwable {
		 launch_browser();
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		System.out.println("browser is launched");
		LOG.info("the website is launched");

	
	 
	}

	@When("^page is launched and  I click on the books$")
	public void page_is_launched_and_I_click_on_the_books() throws Throwable {
		pp= new ProductsPage(driver);
		pp.click_books();
		LOG.info("the books button is clicked");
		
		
	  
	}

	@Then("^I add a product in the cart and click on the shopping cart$")
	public void i_add_a_product_in_the_cart_and_click_on_the_shopping_cart() throws Throwable {
		pp= new ProductsPage(driver);
		pp.click_cart();
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\addtocart.png");
	LOG.info("the product is added to cart");
	LOG.info(" the product details are displayed");

	  
	    
	}

	@Then("^cart is opened and I select an item to delete$")
	public void cart_is_opened_and_I_select_an_item_to_delete() throws Throwable {
		pp= new ProductsPage(driver);
		pp.cart();
		Rcp= new CartPage(driver);
		Rcp.click_checkbox();
		Thread.sleep(900);
	 
	}

	@Then("^I click on the update shopping cart$")
	public void i_click_on_the_update_shopping_cart() throws Throwable {
		Rcp= new CartPage(driver);
		Rcp.click_updatecart();
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\productadded.png");
		LOG.info("the product is deleted  from the cart");
	    
	}



}
