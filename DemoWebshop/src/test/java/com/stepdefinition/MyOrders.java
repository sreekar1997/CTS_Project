package com.stepdefinition;





import java.io.IOException;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.excelutil.ExcelUtil;
import com.pages.HomePage;

import com.pages.LoginPage;
import com.pages.OrdersPage;
import com.pages.ProductsPage;
import com.seleniumutil.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyOrders extends Library{
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	
	
	@Given("^I logged into demowebshop website$")
	public void i_logged_into_website() throws Throwable
	{
	       launch_browser();
	       LOG.info("Browser launched");
		   HomePage hp= new HomePage(driver);
		   hp.launch_website();
		   hp.click_login();
		   LOG.info("Website Launched");
		   LoginPage lp=new LoginPage(driver);
		   ExcelUtil ex= new ExcelUtil();
		   lp.do_login(ex.excel_username(1), ex.excel_password(1));
		   LOG.info("User logged in");
	}

	@When("^I navigate to My orders page$")
	public void i_navigate_to_My_orders_page() throws Throwable {
		ProductsPage pp=new ProductsPage(driver);
		pp.myorders();
		SeleniumUtil su= new SeleniumUtil(driver);
		su.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\myorders_page.png");
		LOG.info("Clicked on my orders");
	    
	}

	@When("^I click on order details$")
	public void i_click_on_order_details() throws Throwable {
	    OrdersPage op= new OrdersPage(driver);
	    op.order_details();
	    LOG.info("clicked on order details");
	    
	}

	@Then("^order details will be displayed and captured$")
	public void order_details_will_be_displayed_and_captured() throws Throwable {
			SeleniumUtil sp= new SeleniumUtil(driver);
			sp.take_screenshot("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\screenshots\\orderdetails.png");
			LOG.info("Screenshot taken");
		}
		
	    
	}



