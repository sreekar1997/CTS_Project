package com.stepdefinition;


import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductsPage;
import com.pages.ReviewPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Review extends Library {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I logged in to the demoweb shop website$")
	public void i_logged_in_to_the_website() throws Throwable 
	{
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

	@When("^I click on an item from the list$")
	public void i_click_on_an_item_from_the_list() throws Throwable 
	{
		ProductsPage pp=new ProductsPage(driver);
		pp.select_product();
		LOG.info("product selected");
	}

	@When("^I click on write a review option$")
	public void i_click_on_write_a_review_option() throws Throwable {
		ProductsPage pp=new ProductsPage(driver);
		pp.click_review();
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\productdetails.png");
		LOG.info("Review button clicked");
	}

	@Then("^I enter the message$")
	public void i_enter_the_message() throws Throwable 
	{
	    ReviewPage rp= new ReviewPage(driver);
	    rp.review(); 
	    LOG.info("Review is typed in the text box");
	}
	
	@Then("^I click on submit$")
	public void i_click_on_submit() throws Throwable 
	{
		 ReviewPage rp= new ReviewPage(driver);
		    rp.submit_review();
		    LOG.info("Review is submitted");
	}

	@Then("^I will eceive feedback stating review is succesfully added message$")
	public void i_will_eceive_feedback_stating_review_is_succesfully_added_message() throws Throwable 
	{
		 SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\review.png");
		   LOG.info("Screenshot taken");
	}
	
	
	

}
