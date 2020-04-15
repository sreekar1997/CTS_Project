package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By quantity =By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input");
	By update = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]");
	By pincode= By.xpath("//*[@id=\"ZipPostalCode\"]");
	By estimate= By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input");
	
	public void change_quan() {
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("5");
		
	}
	public void update() {
		driver.findElement(update).click();
	}
	public void pincode() {
		driver.findElement(pincode).clear();
		driver.findElement(pincode).sendKeys("523183");
		
	}
	public void estimate() {
		driver.findElement(estimate).click();
	}
}
