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
		this.driver=driver;
	}
	
	By register= By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By loginlink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	public void launch_website() throws IOException {
	
	String filename= "C:\\\\Users\\\\3lok\\\\Desktop\\\\selenium\\\\DemoWebshop2\\\\src\\\\test\\\\resources\\\\config_property\\\\configuration.property";
	FileInputStream config_file= new FileInputStream(filename);
	Properties prop = new Properties();
	prop.load(config_file);

	driver.get(prop.getProperty("url"));
	driver.findElement(loginlink).click();
	}
	public void click_register() {
		driver.findElement(register).click();
	}
	
	
}
