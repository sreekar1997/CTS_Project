package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		//pointing to the current driver
		this.driver=driver;
	}
	//storing xpath's in different webelements 
	By quantity =By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input");
	By update = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]");
	By pincode= By.xpath("//*[@id=\"ZipPostalCode\"]");
	By estimate= By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input");
	By book_btn= By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a");
	By checkbox_btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input");
	By update_btn=By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]");
	//method to change quantity
	public void change_quan() {
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("5");
		
	}
	//method to click update
	public void update() {
		driver.findElement(update).click();
	}
	//method to click  pincode
	public void pincode() {
		driver.findElement(pincode).clear();
		driver.findElement(pincode).sendKeys("523183");
		
	}//method to estimate
	public void estimate() {
		driver.findElement(estimate).click();
	}
	//method to click on checkbox
	public void click_checkbox()
	{
		driver.findElement(checkbox_btn).click();
		
	}//method to update cart                                                                                                                  
	public void click_updatecart()
	{
		driver.findElement(update_btn).click();
	}
}
