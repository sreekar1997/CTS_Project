@DemoWebshop
Feature: DemoWebshop Website

@tc_01
Scenario Outline: To register in DemoWebshop
Given I launched DemoWebshop website
And 	I click on register button
When  I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>" 
And   I Clicks Submit
Then  Registration successful message will be displayed

Examples:

		|firstname|lastname|email  			 |password     |confirmpassword		 |
		|user1    |demo    |sreekar@gmai.com|demo1234		 | demo1234					 |
		
@tc_02
Scenario: To change quantity of item in cart
Given I logged in to  website
When  I navigate to cart
And   I change the quantity of the item
And   I click on update cart
Then  I receive feedback that cart is updated

@tc_03
Scenario: To contact the support team
Given I logged into website
When  I navigate to contactus page
Then  I enter query
And   I click submit
Then  I will receive feedback stating query is successfully sent

@tc_04
Scenario: To estimate shipping charge of item
Given I logged in to the website
When  I navigate to shopping cart
And   I enter the city and pincode
And 	I click on submit button
Then  Shipping charge will be displayed

@tc_05
Scenario: Taking screenshot of order details in myorders
Given I logged into demowebshop website
When I navigate to My orders page
And I click on order details
Then order details will be displayed and captured

@tc_06
Scenario: Changing city and pincode in shipping address
Given I logged in to DemoWebshop website
When I navigate to My_account page
And I click edit address
Then I enter the city pincode
And I click submit button
Then updated address is displayed
@tc_07
Scenario: To review an item in demoshop website
Given I logged in to the demoweb shop website
When I click on an item from the list
And I click on write a review option
Then I enter the message
And I click on submit
Then I will eceive feedback stating review is succesfully added message

@tc_08
Scenario Outline: Changing password of logged in profile
Given I logged in to website
When I navigate to My account page
And I click change password
Then I enter "<oldpwd>" "<newpwd>" "<confirmnewpwd>"
And I click on the submit
Then Password succesfully changed message is displayed

Examples:

		|oldpwd		|newpwd	  |confirmnewpwd |
		|demo123 | demo123 |demo123			 |  

  
@tc_09
Scenario Outline: Validating the login functionality
Given I want to launch the website
When website is launched
Then Click on the login button
Then login page is opened
Then I enter "<emailid>" and "<password>"
And The login button is clicked
	    Examples:
	      |emailid                  |password|
	      |sk.munisha54@gmail.com   |salmamuni54|
	      |saidemo@gmai.com|democts|
      
			@tc_10
      Scenario Outline: Searching for a product
      Given I want to launch the searchpage
      When Search page is opened
      Then I enter the desired "<productname>"
      And I click the search button
      And The product page is opened
      Examples:
      |productname  |
      |fiction EX    |
      
      @tc_11
      Scenario: Adding product to  cart
      Given I want to launch categories page
      When categories page is launched
      Then  I click on the books
      Then I click on desired product to add in to cart
      And I click on the shopping cart to view the product details
      @tc_12
      Scenario: Removing product from cart
      Given I launch the homepage 
      When page is launched and  I click on the books
      Then I add a product in the cart and click on the shopping cart
      Then cart is opened and I select an item to delete
      And I click on the update shopping cart
 
 			@tc_13
      Scenario Outline: Newsletter subscribption
      Given I launch the homepage1
      When I enter the "<emailid>" in the newsletter section of homepage
      Then I click subscribe option
      Examples:
      |emailid               |
      |sk.munisha54@gmail.com|
      
       @tc_14
      Scenario Outline: logging out
      Given I launch the website homepage
      When page will open and I login with "<emailid>" and "<password>"
      Then login page will be opened and I click on logout button
      Examples:
      |emailid                  |password|
      |sk.munisha54@gmail.com   |salmamuni54|
 
		
		
#		
  