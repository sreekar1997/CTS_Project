package com.stepdefinition;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logoutpagestepdef extends Library {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	@Given("^I launch the website homepage$")
	
public void i_launch_the_website_homepage() throws Throwable {
		   launch_browser();
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		   hp.click_login();
		System.out.println("browser is launched");
		LOG.info("the website is launched");
		
	
}


	@When("^page will open and I login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void page_will_open_and_I_login_with_and(String emailid, String password) throws Throwable {
		LoginPage lp= new LoginPage(driver);
		 lp.enter_email(emailid);
		  lp.enter_password(password);
		  lp.click_login();
		LOG.info("login is sucessful");
	  
	}

	@Then("^login page will be opened and I click on logout button$")
	public void login_page_will_be_opened_and_I_click_on_logout_button() throws Throwable {
		
		LoginPage lp= new LoginPage(driver);
		lp.clicklogout_btn();
		LOG.info("logout button is clicked");
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\successful_logout.png");

	}

	}
