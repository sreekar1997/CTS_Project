$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/3lok/Desktop/selenium/DemoWebshop/src/test/resources/features/c.feature");
formatter.feature({
  "line": 2,
  "name": "DemoWebshop Website",
  "description": "",
  "id": "demowebshop-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebshop"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "To register in DemoWebshop",
  "description": "",
  "id": "demowebshop-website;to-register-in-demowebshop",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launched DemoWebshop website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003cfirstname\u003e\" \"\u003clastname\u003e\" \"\u003cemail\u003e\" \"\u003cpassword\u003e\" \"\u003cconfirmpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I Clicks Submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Registration successful message will be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "demowebshop-website;to-register-in-demowebshop;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password",
        "confirmpassword"
      ],
      "line": 14,
      "id": "demowebshop-website;to-register-in-demowebshop;;1"
    },
    {
      "cells": [
        "user1",
        "demo",
        "sreekar@gmai.com",
        "demo1234",
        "demo1234"
      ],
      "line": 15,
      "id": "demowebshop-website;to-register-in-demowebshop;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "To register in DemoWebshop",
  "description": "",
  "id": "demowebshop-website;to-register-in-demowebshop;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01"
    },
    {
      "line": 1,
      "name": "@DemoWebshop"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launched DemoWebshop website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"user1\" \"demo\" \"sreekar@gmai.com\" \"demo1234\" \"demo1234\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I Clicks Submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Registration successful message will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launched_DemoWebshop_website()"
});
formatter.result({
  "duration": 42901897800,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_click_on_register_button()"
});
formatter.result({
  "duration": 2877992600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 9
    },
    {
      "val": "demo",
      "offset": 17
    },
    {
      "val": "sreekar@gmai.com",
      "offset": 24
    },
    {
      "val": "demo1234",
      "offset": 43
    },
    {
      "val": "demo1234",
      "offset": 54
    }
  ],
  "location": "Register.i_enter(String,String,String,String,String)"
});
formatter.result({
  "duration": 3034830200,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_Clicks_Submit()"
});
formatter.result({
  "duration": 3524391700,
  "status": "passed"
});
formatter.match({
  "location": "Register.registration_successful_message_will_be_displayed()"
});
formatter.result({
  "duration": 527603300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To change quantity of item in cart",
  "description": "",
  "id": "demowebshop-website;to-change-quantity-of-item-in-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tc_02"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I logged in to  website",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I navigate to cart",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I change the quantity of the item",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on update cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I receive feedback that cart is updated",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeQuantity.i_logged_in_to_website()"
});
formatter.result({
  "duration": 46329430400,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_navigate_to_cart()"
});
formatter.result({
  "duration": 2007775200,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_change_the_quantity_of_the_item()"
});
formatter.result({
  "duration": 466833600,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_click_on_update_cart()"
});
formatter.result({
  "duration": 971818800,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_receive_feedback_that_cart_is_updated()"
});
formatter.result({
  "duration": 495812400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "To contact the support team",
  "description": "",
  "id": "demowebshop-website;to-contact-the-support-team",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@tc_03"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I logged into website",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I navigate to contactus page",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I enter query",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I will receive feedback stating query is successfully sent",
  "keyword": "Then "
});
formatter.match({
  "location": "Contact.i_logged_into_website()"
});
formatter.result({
  "duration": 42269034700,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_navigate_to_contactus_page()"
});
formatter.result({
  "duration": 3747569100,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_enter_query()"
});
formatter.result({
  "duration": 669060100,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_click_submit()"
});
formatter.result({
  "duration": 1733563500,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_will_receive_feedback_stating_query_is_successfully_sent()"
});
formatter.result({
  "duration": 413507200,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "To estimate shipping charge of item",
  "description": "",
  "id": "demowebshop-website;to-estimate-shipping-charge-of-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tc_04"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "I logged in to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I navigate to shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "I enter the city and pincode",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Shipping charge will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "EstimateShipping.i_logged_in_to_the_website()"
});
formatter.result({
  "duration": 95175322000,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.i_navigate_to_shopping_cart()"
});
formatter.result({
  "duration": 1228646200,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.i_enter_the_country_and_pincode()"
});
formatter.result({
  "duration": 269037800,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.i_click_on_submit()"
});
formatter.result({
  "duration": 1676411100,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.shipping_charge_will_be_displayed()"
});
formatter.result({
  "duration": 423269500,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Taking screenshot of order details in myorders",
  "description": "",
  "id": "demowebshop-website;taking-screenshot-of-order-details-in-myorders",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@tc_05"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "I logged into demowebshop website",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "I navigate to My orders page",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "I click on order details",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "order details will be displayed and captured",
  "keyword": "Then "
});
formatter.match({
  "location": "MyOrders.i_logged_into_website()"
});
formatter.result({
  "duration": 53047530500,
  "status": "passed"
});
formatter.match({
  "location": "MyOrders.i_navigate_to_My_orders_page()"
});
formatter.result({
  "duration": 1396314100,
  "status": "passed"
});
formatter.match({
  "location": "MyOrders.i_click_on_order_details()"
});
formatter.result({
  "duration": 1516893500,
  "status": "passed"
});
formatter.match({
  "location": "MyOrders.order_details_will_be_displayed_and_captured()"
});
formatter.result({
  "duration": 427269400,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Changing city and pincode in shipping address",
  "description": "",
  "id": "demowebshop-website;changing-city-and-pincode-in-shipping-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@tc_06"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "I logged in to DemoWebshop website",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I navigate to My_account page",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "I click edit address",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I enter the city pincode",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "updated address is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "EditAddress.i_logged_in_to_DemoWebshop_website()"
});
formatter.result({
  "duration": 34100600100,
  "status": "passed"
});
formatter.match({
  "location": "EditAddress.i_navigate_to_My_account_page()"
});
formatter.result({
  "duration": 1539933500,
  "status": "passed"
});
formatter.match({
  "location": "EditAddress.i_click_add_address()"
});
formatter.result({
  "duration": 2157892800,
  "status": "passed"
});
formatter.match({
  "location": "EditAddress.i_enter_all_the_details()"
});
formatter.result({
  "duration": 814835800,
  "status": "passed"
});
formatter.match({
  "location": "EditAddress.i_click_submit_button()"
});
formatter.result({
  "duration": 1445717700,
  "status": "passed"
});
formatter.match({
  "location": "EditAddress.newly_added_address_is_displayed()"
});
formatter.result({
  "duration": 768604700,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "To review an item in demoshop website",
  "description": "",
  "id": "demowebshop-website;to-review-an-item-in-demoshop-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@tc_07"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "I logged in to the demoweb shop website",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "I click on an item from the list",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "I click on write a review option",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I enter the message",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I will eceive feedback stating review is succesfully added message",
  "keyword": "Then "
});
formatter.match({
  "location": "Review.i_logged_in_to_the_website()"
});
formatter.result({
  "duration": 37848811200,
  "status": "passed"
});
formatter.match({
  "location": "Review.i_click_on_an_item_from_the_list()"
});
formatter.result({
  "duration": 8204737900,
  "status": "passed"
});
formatter.match({
  "location": "Review.i_click_on_write_a_review_option()"
});
formatter.result({
  "duration": 5417704300,
  "status": "passed"
});
formatter.match({
  "location": "Review.i_enter_the_message()"
});
formatter.result({
  "duration": 4018254900,
  "status": "passed"
});
formatter.match({
  "location": "Review.i_click_on_submit()"
});
formatter.result({
  "duration": 5375868400,
  "status": "passed"
});
formatter.match({
  "location": "Review.i_will_eceive_feedback_stating_review_is_succesfully_added_message()"
});
formatter.result({
  "duration": 735456100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 66,
  "name": "Changing password of logged in profile",
  "description": "",
  "id": "demowebshop-website;changing-password-of-logged-in-profile",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 65,
      "name": "@tc_08"
    }
  ]
});
formatter.step({
  "line": 67,
  "name": "I logged in to website",
  "keyword": "Given "
});
formatter.step({
  "line": 68,
  "name": "I navigate to My account page",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "I click change password",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I enter \"\u003coldpwd\u003e\" \"\u003cnewpwd\u003e\" \"\u003cconfirmnewpwd\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "I click on the submit",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Password succesfully changed message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 74,
  "name": "",
  "description": "",
  "id": "demowebshop-website;changing-password-of-logged-in-profile;",
  "rows": [
    {
      "cells": [
        "oldpwd",
        "newpwd",
        "confirmnewpwd"
      ],
      "line": 76,
      "id": "demowebshop-website;changing-password-of-logged-in-profile;;1"
    },
    {
      "cells": [
        "demo123",
        "demo123",
        "demo123"
      ],
      "line": 77,
      "id": "demowebshop-website;changing-password-of-logged-in-profile;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 77,
  "name": "Changing password of logged in profile",
  "description": "",
  "id": "demowebshop-website;changing-password-of-logged-in-profile;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebshop"
    },
    {
      "line": 65,
      "name": "@tc_08"
    }
  ]
});
formatter.step({
  "line": 67,
  "name": "I logged in to website",
  "keyword": "Given "
});
formatter.step({
  "line": 68,
  "name": "I navigate to My account page",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "I click change password",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I enter \"demo123\" \"demo123\" \"demo123\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "I click on the submit",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Password succesfully changed message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangePwd.i_logged_in_to_website()"
});
formatter.result({
  "duration": 47712353800,
  "status": "passed"
});
formatter.match({
  "location": "ChangePwd.i_navigate_to_My_account_page()"
});
formatter.result({
  "duration": 990587900,
  "status": "passed"
});
formatter.match({
  "location": "ChangePwd.i_click_change_password()"
});
formatter.result({
  "duration": 1220588000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo123",
      "offset": 9
    },
    {
      "val": "demo123",
      "offset": 19
    },
    {
      "val": "demo123",
      "offset": 29
    }
  ],
  "location": "ChangePwd.i_enter(String,String,String)"
});
formatter.result({
  "duration": 4142549800,
  "status": "passed"
});
formatter.match({
  "location": "ChangePwd.i_click_submit()"
});
formatter.result({
  "duration": 1507281500,
  "status": "passed"
});
formatter.match({
  "location": "ChangePwd.password_succesfully_changed_message_is_displayed()"
});
formatter.result({
  "duration": 388605800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 81,
  "name": "Validating the login functionality",
  "description": "",
  "id": "demowebshop-website;validating-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 80,
      "name": "@tc_09"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "I want to launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 83,
  "name": "website is launched",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "I enter \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "The login button is clicked",
  "keyword": "And "
});
formatter.examples({
  "line": 88,
  "name": "",
  "description": "",
  "id": "demowebshop-website;validating-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 89,
      "id": "demowebshop-website;validating-the-login-functionality;;1"
    },
    {
      "cells": [
        "sk.munisha54@gmail.com",
        "salmamuni54"
      ],
      "line": 90,
      "id": "demowebshop-website;validating-the-login-functionality;;2"
    },
    {
      "cells": [
        "saidemo@gmai.com",
        "democts"
      ],
      "line": 91,
      "id": "demowebshop-website;validating-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 90,
  "name": "Validating the login functionality",
  "description": "",
  "id": "demowebshop-website;validating-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebshop"
    },
    {
      "line": 80,
      "name": "@tc_09"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "I want to launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 83,
  "name": "website is launched",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "I enter \"sk.munisha54@gmail.com\" and \"salmamuni54\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "The login button is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdef.i_want_to_launch_the_browser()"
});
formatter.result({
  "duration": 32949635400,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.website_is_launched()"
});
formatter.result({
  "duration": 20801093100,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.click_on_the_login_button()"
});
formatter.result({
  "duration": 158300,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.login_page_is_opened()"
});
formatter.result({
  "duration": 518295100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sk.munisha54@gmail.com",
      "offset": 9
    },
    {
      "val": "salmamuni54",
      "offset": 38
    }
  ],
  "location": "loginstepdef.i_enter_and(String,String)"
});
formatter.result({
  "duration": 486598100,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.the_login_button_is_clicked()"
});
formatter.result({
  "duration": 2175466300,
  "status": "passed"
});
formatter.scenario({
  "line": 91,
  "name": "Validating the login functionality",
  "description": "",
  "id": "demowebshop-website;validating-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebshop"
    },
    {
      "line": 80,
      "name": "@tc_09"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "I want to launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 83,
  "name": "website is launched",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "I enter \"saidemo@gmai.com\" and \"democts\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "The login button is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdef.i_want_to_launch_the_browser()"
});
formatter.result({
  "duration": 76287898500,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.website_is_launched()"
});
formatter.result({
  "duration": 4418183800,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.click_on_the_login_button()"
});
formatter.result({
  "duration": 119200,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.login_page_is_opened()"
});
formatter.result({
  "duration": 397633500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "saidemo@gmai.com",
      "offset": 9
    },
    {
      "val": "democts",
      "offset": 32
    }
  ],
  "location": "loginstepdef.i_enter_and(String,String)"
});
formatter.result({
  "duration": 316574900,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.the_login_button_is_clicked()"
});
formatter.result({
  "duration": 1945161400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 94,
  "name": "Searching for a product",
  "description": "",
  "id": "demowebshop-website;searching-for-a-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 93,
      "name": "@tc_10"
    }
  ]
});
formatter.step({
  "line": 95,
  "name": "I want to launch the searchpage",
  "keyword": "Given "
});
formatter.step({
  "line": 96,
  "name": "Search page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 97,
  "name": "I enter the desired \"\u003cproductname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "The product page is opened",
  "keyword": "And "
});
formatter.examples({
  "line": 100,
  "name": "",
  "description": "",
  "id": "demowebshop-website;searching-for-a-product;",
  "rows": [
    {
      "cells": [
        "productname"
      ],
      "line": 101,
      "id": "demowebshop-website;searching-for-a-product;;1"
    },
    {
      "cells": [
        "fiction EX"
      ],
      "line": 102,
      "id": "demowebshop-website;searching-for-a-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 102,
  "name": "Searching for a product",
  "description": "",
  "id": "demowebshop-website;searching-for-a-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 93,
      "name": "@tc_10"
    },
    {
      "line": 1,
      "name": "@DemoWebshop"
    }
  ]
});
formatter.step({
  "line": 95,
  "name": "I want to launch the searchpage",
  "keyword": "Given "
});
formatter.step({
  "line": 96,
  "name": "Search page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 97,
  "name": "I enter the desired \"fiction EX\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "The product page is opened",
  "keyword": "And "
});
formatter.match({
  "location": "searchstepdef.i_want_to_launch_the_browser()"
});
formatter.result({
  "duration": 18113346900,
  "status": "passed"
});
formatter.match({
  "location": "searchstepdef.search_page_is_opened()"
});
formatter.result({
  "duration": 523640700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fiction EX",
      "offset": 21
    }
  ],
  "location": "searchstepdef.i_enter_the_desired(String)"
});
formatter.result({
  "duration": 291607800,
  "status": "passed"
});
formatter.match({
  "location": "searchstepdef.i_click_the_search_button()"
});
formatter.result({
  "duration": 1389362500,
  "status": "passed"
});
formatter.match({
  "location": "searchstepdef.the_product_page_is_opened()"
});
formatter.result({
  "duration": 434947200,
  "status": "passed"
});
formatter.scenario({
  "line": 105,
  "name": "Adding product to  cart",
  "description": "",
  "id": "demowebshop-website;adding-product-to--cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 104,
      "name": "@tc_11"
    }
  ]
});
formatter.step({
  "line": 106,
  "name": "I want to launch categories page",
  "keyword": "Given "
});
formatter.step({
  "line": 107,
  "name": "categories page is launched",
  "keyword": "When "
});
formatter.step({
  "line": 108,
  "name": "I click on the books",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "I click on desired product to add in to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 110,
  "name": "I click on the shopping cart to view the product details",
  "keyword": "And "
});
formatter.match({
  "location": "addtocartstepdef.i_want_to_launch_categories_page()"
});
formatter.result({
  "duration": 25251286300,
  "status": "passed"
});
formatter.match({
  "location": "addtocartstepdef.categories_page_is_launched()"
});
formatter.result({
  "duration": 507397700,
  "status": "passed"
});
formatter.match({
  "location": "addtocartstepdef.i_click_on_the_books()"
});
formatter.result({
  "duration": 3893050000,
  "status": "passed"
});
formatter.match({
  "location": "addtocartstepdef.i_click_on_desired_product_to_add_in_to_cart()"
});
formatter.result({
  "duration": 211261800,
  "status": "passed"
});
formatter.match({
  "location": "addtocartstepdef.i_click_on_the_shopping_cart_to_view_the_product_details()"
});
formatter.result({
  "duration": 1925997000,
  "status": "passed"
});
formatter.scenario({
  "line": 112,
  "name": "Removing product from cart",
  "description": "",
  "id": "demowebshop-website;removing-product-from-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 111,
      "name": "@tc_12"
    }
  ]
});
formatter.step({
  "line": 113,
  "name": "I launch the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 114,
  "name": "page is launched and  I click on the books",
  "keyword": "When "
});
formatter.step({
  "line": 115,
  "name": "I add a product in the cart and click on the shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "cart is opened and I select an item to delete",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "I click on the update shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "removecartstepdef.i_launch_the_homepage()"
});
formatter.result({
  "duration": 37741400700,
  "status": "passed"
});
formatter.match({
  "location": "removecartstepdef.page_is_launched_and_I_click_on_the_books()"
});
formatter.result({
  "duration": 2047209500,
  "status": "passed"
});
formatter.match({
  "location": "removecartstepdef.i_add_a_product_in_the_cart_and_click_on_the_shopping_cart()"
});
formatter.result({
  "duration": 814944700,
  "status": "passed"
});
formatter.match({
  "location": "removecartstepdef.cart_is_opened_and_I_select_an_item_to_delete()"
});
formatter.result({
  "duration": 2058583700,
  "status": "passed"
});
formatter.match({
  "location": "removecartstepdef.i_click_on_the_update_shopping_cart()"
});
formatter.result({
  "duration": 1245882400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 120,
  "name": "Newsletter subscribption",
  "description": "",
  "id": "demowebshop-website;newsletter-subscribption",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 119,
      "name": "@tc_13"
    }
  ]
});
formatter.step({
  "line": 121,
  "name": "I launch the homepage1",
  "keyword": "Given "
});
formatter.step({
  "line": 122,
  "name": "I enter the \"\u003cemailid\u003e\" in the newsletter section of homepage",
  "keyword": "When "
});
formatter.step({
  "line": 123,
  "name": "I click subscribe option",
  "keyword": "Then "
});
formatter.examples({
  "line": 124,
  "name": "",
  "description": "",
  "id": "demowebshop-website;newsletter-subscribption;",
  "rows": [
    {
      "cells": [
        "emailid"
      ],
      "line": 125,
      "id": "demowebshop-website;newsletter-subscribption;;1"
    },
    {
      "cells": [
        "sk.munisha54@gmail.com"
      ],
      "line": 126,
      "id": "demowebshop-website;newsletter-subscribption;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 126,
  "name": "Newsletter subscribption",
  "description": "",
  "id": "demowebshop-website;newsletter-subscribption;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 119,
      "name": "@tc_13"
    },
    {
      "line": 1,
      "name": "@DemoWebshop"
    }
  ]
});
formatter.step({
  "line": 121,
  "name": "I launch the homepage1",
  "keyword": "Given "
});
formatter.step({
  "line": 122,
  "name": "I enter the \"sk.munisha54@gmail.com\" in the newsletter section of homepage",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 123,
  "name": "I click subscribe option",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "newsletterpagestepdef.i_launch_the_homepage(int)"
});
formatter.result({
  "duration": 15042493200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sk.munisha54@gmail.com",
      "offset": 13
    }
  ],
  "location": "newsletterpagestepdef.i_enter_the_in_the_newsletter_section_of_homepage(String)"
});
formatter.result({
  "duration": 1920391400,
  "status": "passed"
});
formatter.match({
  "location": "newsletterpagestepdef.i_click_subscribe_option()"
});
formatter.result({
  "duration": 848783200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 129,
  "name": "logging out",
  "description": "",
  "id": "demowebshop-website;logging-out",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 128,
      "name": "@tc_14"
    }
  ]
});
formatter.step({
  "line": 130,
  "name": "I launch the website homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 131,
  "name": "page will open and I login with \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 132,
  "name": "login page will be opened and I click on logout button",
  "keyword": "Then "
});
formatter.examples({
  "line": 133,
  "name": "",
  "description": "",
  "id": "demowebshop-website;logging-out;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 134,
      "id": "demowebshop-website;logging-out;;1"
    },
    {
      "cells": [
        "sk.munisha54@gmail.com",
        "salmamuni54"
      ],
      "line": 135,
      "id": "demowebshop-website;logging-out;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 135,
  "name": "logging out",
  "description": "",
  "id": "demowebshop-website;logging-out;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 128,
      "name": "@tc_14"
    },
    {
      "line": 1,
      "name": "@DemoWebshop"
    }
  ]
});
formatter.step({
  "line": 130,
  "name": "I launch the website homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 131,
  "name": "page will open and I login with \"sk.munisha54@gmail.com\" and \"salmamuni54\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 132,
  "name": "login page will be opened and I click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "logoutpagestepdef.i_launch_the_website_homepage()"
});
formatter.result({
  "duration": 15790864300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sk.munisha54@gmail.com",
      "offset": 33
    },
    {
      "val": "salmamuni54",
      "offset": 62
    }
  ],
  "location": "logoutpagestepdef.page_will_open_and_I_login_with_and(String,String)"
});
formatter.result({
  "duration": 1961024400,
  "status": "passed"
});
formatter.match({
  "location": "logoutpagestepdef.login_page_will_be_opened_and_I_click_on_logout_button()"
});
formatter.result({
  "duration": 1868190200,
  "status": "passed"
});
});