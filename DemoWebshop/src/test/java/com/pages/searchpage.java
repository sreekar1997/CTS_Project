package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchpage {
	WebDriver driver;
//storing xpath's in web elements
	By pname=By.xpath("//*[@id=\"small-searchterms\"]");
	By search_btn= By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]");
	public searchpage(WebDriver driver)
	{
		
		//pointing to the current driver
		this.driver=driver;
	}
	//enter the product name
	public void enter_text( String productname)
	{
		driver.findElement(pname).sendKeys(productname);

	}
	//click on search
	
	public void clicksearch_btn()
	{
		driver.findElement(search_btn).click();
	}

}
