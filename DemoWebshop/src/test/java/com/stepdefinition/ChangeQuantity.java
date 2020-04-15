package com.stepdefinition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeQuantity extends Library {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");

	@Given("^I logged in to  website$")
	public void i_logged_in_to_website() throws Throwable {
		   launch_browser();
		   LOG.info("Browser Launched");
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		   hp.click_login();
		   LOG.info("Website Launched");
		   LoginPage lp=new LoginPage(driver);
		   lp.do_login("ex1@gmail.com", "12345678");
		   LOG.info("Credentials Entered");
	}

	@When("^I navigate to cart$")
	public void i_navigate_to_cart() throws Throwable {
		ProductsPage pp= new ProductsPage(driver);	//creating object for produts page
		pp.cart();
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\cart.png");
		 LOG.info("Clicked on My cart");
	}

	@When("^I change the quantity of the item$")
	public void i_change_the_quantity_of_the_item() throws Throwable {
	  CartPage cp= new CartPage(driver);
	  cp.change_quan();
	  LOG.info("Quantity of item changed");
	}

	@When("^I click on update cart$")
	public void i_click_on_update_cart() throws Throwable {
		 CartPage cp= new CartPage(driver);
		 cp.update();
		 LOG.info("CLicked on update cart");
	}

	@Then("^I receive feedback that cart is updated$")
	public void i_receive_feedback_that_cart_is_updated() throws Throwable {
		SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\updatedcart.png");
		   LOG.info("Screenshot taken");
	}


	
}
