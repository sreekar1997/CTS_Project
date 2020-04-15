package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		//pointing the current driver
		this.driver=driver;
	}
	//storing the xpath's in webelements
	By register= By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By loginlink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By eid= By.xpath("//*[@id=\"newsletter-email\"]");
	By subscribe_btn=By.xpath("//*[@id=\"newsletter-subscribe-button\"]");
	//launching the browser
	public void launch_website() throws IOException {
	
	String filename= "C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\config_property\\configuration.property";
	FileInputStream config_file= new FileInputStream(filename);
	Properties prop = new Properties();
	prop.load(config_file);

	driver.get(prop.getProperty("url"));
	
	}
	//clicking the login button
	public void click_login() {
		driver.findElement(loginlink).click();
	}//clicking on register
	public void click_register() {
		driver.findElement(register).click();
	}//entering the emailid
	public void enter_emailid(String emailid)
	{
		driver.findElement(eid).sendKeys(emailid);
	}//clicking the subscribe button
	public void click_subscribe()
	{
		driver.findElement(subscribe_btn).click();
	}
	
	
}
