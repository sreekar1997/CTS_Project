package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By query =By.xpath("//*[@id=\"Enquiry\"]");
	By submit =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[3]/form/div[3]/input");
	
	public void enter_query() {
		driver.findElement(query).sendKeys("How to add product to wishlist");
	}
	
	public void submit() {
		driver.findElement(submit).click();
	}
	
	
}
