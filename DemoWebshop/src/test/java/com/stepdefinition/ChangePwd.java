package com.stepdefinition;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.ChangePassword;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MyAccountPage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePwd extends Library{
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	//creating object for log file
	
	
	@Given("^I logged in to website$")
	public void i_logged_in_to_website() throws Throwable {
	   launch_browser();
	   HomePage hp= new HomePage(driver);
	   hp.launch_website();
	   hp.click_login();
	   LoginPage lp=new LoginPage(driver);
	   lp.do_login("thriloksai@gmail.com", "demo123");
	   LOG.info("User logged in");
	   
	}

	@When("^I navigate to My account page$")
	public void i_navigate_to_My_account_page()  {
		ProductsPage pp=new ProductsPage(driver);  //creating object for produts page
		pp.my_account();						   //calling method using object
		LOG.info("Clicked on my account");
		

	}

	@When("^I click change password$")
	public void i_click_change_password() throws IOException { 
	    MyAccountPage  mp= new MyAccountPage(driver);
	    mp.click_changepwd();
	    SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop3\\src\\test\\resources\\screenshots\\changepwdpage.png");
	    LOG.info("Clicked on change password");
	}

	@Then("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter(String arg1, String arg2, String arg3) {
		ChangePassword cp= new ChangePassword(driver);
		cp.change_password(arg1, arg2, arg3);
		LOG.info("Password entered");
	}

	@Then("^I click on the submit$")
	public void i_click_submit()  {
		ChangePassword cp= new ChangePassword(driver);
		cp.click_change();
		
	}

	@Then("^Password succesfully changed message is displayed$")
	public void password_succesfully_changed_message_is_displayed() throws IOException  {
	   SeleniumUtil su= new SeleniumUtil(driver);
	   su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\changepwd.png");
	   System.out.println("changed");
	   LOG.info("Screenshot taken");
	}


	
	
	
	

}
