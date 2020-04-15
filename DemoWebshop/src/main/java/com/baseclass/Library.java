package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {

	public WebDriver driver;
	Properties prop;
	// Launching a WeBbrowser
	public void launch_browser() throws IOException {
	//locating the path of the file
		String filename="C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\config_property\\configuration.property";
		FileInputStream config_file= new FileInputStream(filename);
		//creating object to the property file
		prop = new Properties();
		//loading the property file to the object
		prop.load(config_file);
		// initializing the browser name
		String browser_name=prop.getProperty("browser");

		//checking the browser name
		if(browser_name.equalsIgnoreCase("chrome")) 
		{
			//setting the chromedriver property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\drivers\\chromedriver.exe");
			//initializing the chromedriver
			driver= new ChromeDriver();
		}
		//checking the browser name
		else if(browser_name.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		//maximizing the window
		driver.manage().window().maximize();
		//implicitly waiting  the window
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		//getting the url from the property file
		String url=prop.getProperty("url");
		driver.get(url);
		
	
	
	
	}
}
