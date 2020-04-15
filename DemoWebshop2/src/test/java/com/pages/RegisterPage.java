package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By gender= By.xpath("//*[@id=\"gender-male\"]");
	By fname =By.xpath("//*[@id=\"FirstName\"]");
	By lname=By.xpath("//*[@id=\"LastName\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"Password\"]");
	By confirmpwd =By.xpath("//*[@id=\"ConfirmPassword\"]");
	By submit =By.xpath("//*[@id=\"register-button\"]");
	
	public void register(String Fname,String Lname,String Email,String Password,String Cnfpwd) {
		driver.findElement(gender).click();
		driver.findElement(fname).sendKeys(Fname);
		driver.findElement(lname).sendKeys(Lname);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(confirmpwd).sendKeys(Cnfpwd);
	}
	public void Submit() {
		driver.findElement(submit).click();
	}
	
	
	
	
}
