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
	
	public void launch_browser() throws IOException {
		
		String filename="C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\config_property\\configuration.property";
		FileInputStream config_file= new FileInputStream(filename);
		prop = new Properties();
		prop.load(config_file);
		
		String browser_name=prop.getProperty("browser");

		
		if(browser_name.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		String url=prop.getProperty("url");
		//driver.get(url);
		
	
	
	
	}
}
