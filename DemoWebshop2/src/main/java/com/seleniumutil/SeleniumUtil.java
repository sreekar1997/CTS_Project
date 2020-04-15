package com.seleniumutil;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SeleniumUtil {
	
	WebDriver driver;
	
	public SeleniumUtil(WebDriver driver) {
			
		this.driver=driver;
	}
	
	public void take_screenshot(String path) throws IOException {
		
	
	File source= ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(source, new File(path));
	
	}
	
	

}
