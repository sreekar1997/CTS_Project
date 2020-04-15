package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

		WebDriver driver;
		public ProductsPage(WebDriver driver) {
			this.driver=driver;
		}
		
				
		By myaccount=  By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[1]/a");
		By cart=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
		By contact =By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a");
		public void  my_account() {
			driver.findElement(myaccount).click();
		}
		public void cart() {
			driver.findElement(cart).click();
		}
		public void contact() {
			driver.findElement(contact).click();
		}
		
	}
	
	

