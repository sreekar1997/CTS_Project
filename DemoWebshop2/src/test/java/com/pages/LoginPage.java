package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginlink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By email= By.id("Email");
	By password = By.id("Password");
	By login =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	
	
	public void enter_email(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	
	public void enter_password(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void click_login() {
		driver.findElement(login).click();
	}
	
	public void do_login(String email,String password) {
		
		this.enter_email(email);
		this.enter_password(password);
		this.click_login();
		
	}
	
	
	
}
