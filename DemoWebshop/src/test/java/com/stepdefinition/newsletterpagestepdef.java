package com.stepdefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.Library;
import com.pages.HomePage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newsletterpagestepdef extends Library {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I launch the homepage(\\d+)$")
	public void i_launch_the_homepage(int arg1) throws Throwable {

		launch_browser();
		HomePage hp= new HomePage(driver);
		hp.launch_website();
		System.out.println("browser is launched");
		LOG.info("the website is launched");
	}
	
	
	@When("^I enter the \"([^\"]*)\" in the newsletter section of homepage$")
public void i_enter_the_in_the_newsletter_section_of_homepage(String emailid) throws Throwable {


		HomePage hp= new HomePage(driver);
		hp.enter_emailid(emailid);
		LOG.info("the email id is entered");
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\newsletter.png");
	    Thread.sleep(900);
	}

	@Then("^I click subscribe option$")
	public void i_click_subscribe_option() throws Throwable {
		HomePage hp= new HomePage(driver);
		hp.click_subscribe();
		System.out.println("subscription is successful");
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\nwsltr_sub.png");
		LOG.info("subscription is successful");
	   
	}



}
