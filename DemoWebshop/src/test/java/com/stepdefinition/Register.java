package com.stepdefinition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.HomePage;
import com.pages.RegisterPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register extends Library {

	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I launched DemoWebshop website$")
	public void i_launched_DemoWebshop_website() throws Throwable {
	   launch_browser();
	   LOG.info("Browser Launched");
	   HomePage hp= new HomePage(driver);
	   hp.launch_website();
	   
	   LOG.info("Website Launched");
	}

	@Given("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
		HomePage hp= new HomePage(driver);
		hp.click_register();
		 LOG.info("Clicked on register button");
	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		RegisterPage rp= new RegisterPage(driver);
		rp.register(arg1, arg2, arg3, arg4, arg5);
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\registration_page.png");
		 LOG.info("Details entered");
	}

	@When("^I Clicks Submit$")
	public void i_Clicks_Submit() throws Throwable {
		RegisterPage rp= new RegisterPage(driver);
	    rp.Submit();
	    LOG.info("Clicked on submit button");
	    }

	@Then("^Registration successful message will be displayed$")
	public void registration_successful_message_will_be_displayed() throws Throwable {
			SeleniumUtil su= new SeleniumUtil(driver);
		   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\reg_success.png");
		   LOG.info("Screenshot taken");
	}


	
}
