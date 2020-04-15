package com.stepdefinition;

import org.apache.log4j.Logger;

import com.baseclass.Library;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtocartstepdef extends Library {
	
	
	LoginPage lp;
	CartPage acp;
	ProductsPage pp;
	Logger LOG = Logger.getLogger("devpinoyLogger");

	@Given("^I want to launch categories page$")
	public void i_want_to_launch_categories_page() throws Throwable {
		   launch_browser();
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		System.out.println("browser is launched");
		LOG.info("the website is launched");
	}

	@When("^categories page is launched$")
	public void categories_page_is_launched() throws Throwable {
		
	//taking screenshot
	SeleniumUtil util= new SeleniumUtil(driver);
	util.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\categoriespage.png");
    System.out.println("screenshot is successfully taken");
   }
	
	
	@Then("^I click on the books$")
	public void i_click_on_the_books() throws Throwable {
		pp= new ProductsPage(driver); //creating object
		pp.click_books(); //calling method using object
		//clicking books button
		LOG.info("the books button is clicked");
		}

	@Then("^I click on desired product to add in to cart$")
	public void i_click_on_desired_product_to_add_in_to_cart() throws Throwable {
	    
		pp= new ProductsPage(driver);
		pp.click_cart();
		LOG.info("the product is added to cart");
	}

	@Then("^I click on the shopping cart to view the product details$")
	public void i_click_on_the_shopping_cart_to_view_the_product_details() throws Throwable {
		pp= new ProductsPage(driver);
		pp.cart();
		SeleniumUtil util= new SeleniumUtil(driver);
		util.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\productsdetails.png");
		LOG.info(" the product details are displayed");
	}



}
