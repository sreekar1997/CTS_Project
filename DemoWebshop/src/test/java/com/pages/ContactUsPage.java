package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		//pointing to the current driver
		this.driver=driver;
	}
	//storing xpath's in respective webelements
	By query =By.xpath("//*[@id=\"Enquiry\"]");
	By submit =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[3]/form/div[3]/input");
	//method to raise a query
	public void enter_query() {
		driver.findElement(query).sendKeys("How to add product to wishlist");
	}
	//method to click  on submit button
	
	public void submit() {
		driver.findElement(submit).click();
	}
	
	
}
