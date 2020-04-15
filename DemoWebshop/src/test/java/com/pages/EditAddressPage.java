package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAddressPage {
WebDriver driver;
	
	public EditAddressPage(WebDriver driver) {
		//pointing to the current driver
		this.driver=driver;
		
	}
	//storing xpath's in webelements
	By city= By.xpath("//*[@id=\"Address_City\"]");
	By pincode= By.xpath("//*[@id=\"Address_ZipPostalCode\"]");
	By save= By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/input");
	//method to edit the address
	public void enter_address() {
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys("Vijayawada");
		driver.findElement(pincode).clear();
		driver.findElement(pincode).sendKeys("5214297");
		
		
		
	}//clicking the submit button
	public void submit() {
		driver.findElement(save).click();
	}
	
	
	
	
}
