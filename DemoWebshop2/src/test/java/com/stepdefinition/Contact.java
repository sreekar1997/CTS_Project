package com.stepdefinition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.excelutil.ExcelUtil;
import com.pages.ContactUsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact extends Library{

	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I logged into website$")
	public void i_logged_into_website() throws Throwable {
		launch_browser();
		 LOG.info("Browser Launched");
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		   LOG.info("Website Launched");
		   LoginPage lp=new LoginPage(driver);
		   ExcelUtil ex= new ExcelUtil();
		   lp.do_login(ex.excel_username(1), ex.excel_password(1));
		   LOG.info("Credentials Entered");
	}

	@When("^I navigate to contactus page$")
	public void i_navigate_to_contactus_page() throws Throwable {
	   ProductsPage pp= new ProductsPage(driver) ;
		   pp.contact();
		   LOG.info("Contact us option clicked");
	   }
	

	@Then("^I enter query$")
	public void i_enter_query() throws Throwable {
	ContactUsPage cup= new ContactUsPage(driver);
	cup.enter_query();
	LOG.info("Query entered");
	}

	@Then("^I click submit$")
	public void i_click_submit() throws Throwable {
		ContactUsPage cup= new ContactUsPage(driver);
		cup.submit();
		LOG.info("Submit button clicked");
	}

	@Then("^I will receive feedback stating query is successfully sent$")
	public void i_will_receive_feedback_stating_query_is_successfully_sent() throws Throwable {
		SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\screenshots\\querysubmitted.png");
		   LOG.info("Screenshot taken");
	}


}
