package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductsPage {

		WebDriver driver;
		public ProductsPage(WebDriver driver) {
			//pointing to the current driver
			this.driver=driver;
		}
		
				//storing xpath's in webelements
		By myaccount=  By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[1]/a");
		By cart=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
		By contact =By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a");
		By orders= By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a");
		By product= By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/h2/a");
		By review= By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[4]/div[2]/a[2]");
		By book_btn= By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a");
		By cart_btn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input");
		//clicking on account
		public void  my_account() {
			driver.findElement(myaccount).click();
		}
		//click on cart
		public void cart() {
			WebElement element=driver.findElement(cart);
			Actions action= new Actions(driver);
			action.moveToElement(element).click().perform();
			
		}
		//click on cart
		public void contact() {
			driver.findElement(contact).click();
		}
		//click on my orders
		
		public void myorders() {
			driver.findElement(orders).click();
			
			}
		//click on product
		public void select_product() {
			driver.findElement(product).click();
		}
		//click on review
		public void click_review() {
			driver.findElement(review).click();
		}
		//click on cart
		public void click_cart()
		{
			driver.findElement(cart_btn).click();
		}
		//click on book
		public void click_books()
		{
			driver.findElement(book_btn).click();
		}
		
	}
	
	

