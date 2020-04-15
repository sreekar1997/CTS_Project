package com.stepdefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.Library;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.searchpage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchstepdef extends Library {
	
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	
	searchpage sp;
	@Given("^I want to launch the searchpage$")
	public void i_want_to_launch_the_browser() throws IOException  {
		 
		   launch_browser();
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		System.out.println("browser is launched");
		
	   }
	

@When("^Search page is opened$")
	public void search_page_is_opened() throws IOException  {
	SeleniumUtil util= new SeleniumUtil(driver);
		util.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\searchpage.png");
	    System.out.println("screenshot is successfully taken");
	
	  
	  
	}

	@Then("^I enter the desired \"([^\"]*)\"$")
	public void i_enter_the_desired(String productname){
		sp= new searchpage(driver);
		sp.enter_text(productname);
		LOG.info("product to be searched is entered");
		
	    
	}

	@Then("^I click the search button$")
	public void i_click_the_search_button() {
		sp= new searchpage(driver);
		sp.clicksearch_btn();
		LOG.info("desired product is searched");
	   
	}

	@Then("^The product page is opened$")
	public void the_product_page_is_opened() throws IOException {
		SeleniumUtil util;
		util= new SeleniumUtil(driver);
		util.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\productpage.png");
	    System.out.println("screenshot is successfully taken");
	
	}




}
