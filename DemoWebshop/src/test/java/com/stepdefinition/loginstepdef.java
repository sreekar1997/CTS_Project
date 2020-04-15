package com.stepdefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.Library;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef extends Library {
	
	
	SeleniumUtil util;
	
	LoginPage lp;
Logger LOG = Logger.getLogger("devpinoyLogger");
	
	@Given("^I want to launch the website$")
	public void i_want_to_launch_the_browser() throws Throwable {
		 
		launch_browser();
		
		System.out.println("browser is launched");
		
	   }
@When("^website is launched$")
	public void website_is_launched() throws Throwable {
	HomePage hp= new HomePage(driver);
	 hp.launch_website();
	 hp.click_login();
	    LOG.info("screenshot is taken successfully");
	    
	    }
	@Then("^Click on the login button$")
public void click_on_the_login_button() {
//		lp= new LoginPage(driver);
//		lp.before_clickloginbtn();
		 LOG.info("Login clicked");
	      
	}
	@Then("^login page is opened$")
	public void login_page_is_opened() throws IOException  {
		SeleniumUtil util;
		util= new SeleniumUtil(driver);
		util.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\loginpage.png");
	    System.out.println("screenshot is successfully taken");
	      
	      }
@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String emailid, String password) {
		 lp= new LoginPage(driver);
	lp.enter_email(emailid);
	lp.enter_password(password);
	LOG.info("emailid and password entered");
	     }
@Then("^The login button is clicked$")
public void the_login_button_is_clicked() throws IOException {
lp= new LoginPage(driver);
lp.click_login();
SeleniumUtil su= new SeleniumUtil(driver);
su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\successful_login.png");

LOG.info("login sucessful");
    
}




}
