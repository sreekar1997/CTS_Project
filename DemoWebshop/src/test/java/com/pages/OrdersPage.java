package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumutil.SeleniumUtil;

public class OrdersPage {
	
WebDriver driver;
	
	public OrdersPage(WebDriver driver) {
		//pointing to the current driver
		this.driver=driver;
		
	}
	//storing xpath in webelement
	By details= By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/input");
// entering the order details
	public void order_details() {
		driver.findElement(details).click();
	}
	
	
	
	

}
