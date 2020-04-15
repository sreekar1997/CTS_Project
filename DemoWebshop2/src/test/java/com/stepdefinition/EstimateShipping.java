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

public class EstimateShipping extends Library {

	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I logged in to the website$")
	public void i_logged_in_to_the_website() throws Throwable {
		launch_browser();
		LOG.info("Browser Launched");
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		   LOG.info("Website Launched");
		   LoginPage lp=new LoginPage(driver);
		   lp.do_login("ex1@gmail.com", "12345678");   
		   LOG.info("Credentials Entered");
	}

	@When("^I navigate to shopping cart$")
	public void i_navigate_to_shopping_cart() throws Throwable {
		ProductsPage pp= new ProductsPage(driver);
		pp.cart();
		 LOG.info("Clicked on shopping cart");
	}

	@When("^I enter the city and pincode$")
	public void i_enter_the_country_and_pincode() throws Throwable {
		 CartPage cp= new CartPage(driver);
		 cp.pincode();
		 LOG.info("City and pincode entered");
	}

	@When("^I click on submit button$")
	public void i_click_on_submit() throws Throwable {
		 CartPage cp= new CartPage(driver);
		 cp.estimate();
		 LOG.info("Clicked on submit button");
	}

	@Then("^Shipping charge will be displayed$")
	public void shipping_charge_will_be_displayed() throws Throwable {
		SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\screenshots\\estimated.png");
		   LOG.info("Screenshot taken");
	}


}
