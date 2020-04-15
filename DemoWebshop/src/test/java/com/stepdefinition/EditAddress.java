package com.stepdefinition;



import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.EditAddressPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MyAccountPage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditAddress extends Library {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I logged in to DemoWebshop website$")
	public void i_logged_in_to_DemoWebshop_website() throws Throwable {
		   launch_browser();
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		   hp.click_login();
		   LoginPage lp=new LoginPage(driver);
		   lp.do_login("ex1@gmail.com", "12345678");
		   LOG.info("User logged in");
	       
	}

	@When("^I navigate to My_account page$")
	public void i_navigate_to_My_account_page() throws Throwable {
		ProductsPage pp=new ProductsPage(driver);
		pp.my_account();
		SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\myaccount.png");
		 LOG.info("Clicked on my account");
	    
	}

	@When("^I click edit address$")
	public void i_click_add_address() throws Throwable {
		 MyAccountPage mp= new MyAccountPage(driver);
		 mp.edit_address();
		 LOG.info("Clicked on edit address");
	    
	}

	@Then("^I enter the city pincode$")
	public void i_enter_all_the_details() throws Throwable {
	    EditAddressPage ep= new EditAddressPage(driver);
	    ep.enter_address();
	    LOG.info("Address entered");
	    
	    
	}
	@Then("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		EditAddressPage ep= new EditAddressPage(driver);
		ep.submit();
	    
	}

	@Then("^updated address is displayed$")
	public void newly_added_address_is_displayed() throws Throwable {
		 SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\updatedaddress.png");
		   LOG.info("Screenshot taken");
	}
	
	
	
	
	

}
