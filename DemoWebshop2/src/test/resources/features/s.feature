@DemoWebshop
Feature: DemoWebshop Website

@tc_01_Register
Scenario Outline: To register in DemoWebshop
Given I launched DemoWebshop website
And 	I click on register button
When  I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>" 
And   I Clicks Submit
Then  Registration successful message will be displayed

	Examples:

		|firstname|lastname|email  			 |password     |confirmpassword		 |
		|user1    |demo    |demo@gmai.com|demo1234		 | demo1234					 |
		
@tc_02_Change_quantity
Scenario: To change quantity of item in cart
Given I logged in to  website
When  I navigate to cart
And   I change the quantity of the item
And   I click on update cart
Then  I receive feedback that cart is updated

@tc_03_contactus
Scenario: To contact the support team
Given I logged into website
When  I navigate to contactus page
Then  I enter query
And   I click submit
Then  I will receive feedback stating query is successfully sent

@tc_04_Estimate_Shipping
Scenario: To estimate shipping charge of item
Given I logged in to the website
When  I navigate to shopping cart
And   I enter the city and pincode
And 	I click on submit button
Then  Shipping charge will be displayed
