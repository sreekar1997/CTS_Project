$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/3lok/Desktop/selenium/DemoWebshop2/src/test/resources/features/s.feature");
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
      "name": "@tc_01_Register"
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
        "demo@gmai.com",
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
      "name": "@tc_01_Register"
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
  "name": "I enter \"user1\" \"demo\" \"demo@gmai.com\" \"demo1234\" \"demo1234\"",
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
  "duration": 19681931300,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_click_on_register_button()"
});
formatter.result({
  "duration": 1029727100,
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
      "val": "demo@gmai.com",
      "offset": 24
    },
    {
      "val": "demo1234",
      "offset": 40
    },
    {
      "val": "demo1234",
      "offset": 51
    }
  ],
  "location": "Register.i_enter(String,String,String,String,String)"
});
formatter.result({
  "duration": 926820600,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_Clicks_Submit()"
});
formatter.result({
  "duration": 2451080600,
  "status": "passed"
});
formatter.match({
  "location": "Register.registration_successful_message_will_be_displayed()"
});
formatter.result({
  "duration": 531445000,
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
      "name": "@tc_02_Change_quantity"
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
  "duration": 19744131900,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_navigate_to_cart()"
});
formatter.result({
  "duration": 1118873000,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_change_the_quantity_of_the_item()"
});
formatter.result({
  "duration": 443540500,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_click_on_update_cart()"
});
formatter.result({
  "duration": 1076066900,
  "status": "passed"
});
formatter.match({
  "location": "ChangeQuantity.i_receive_feedback_that_cart_is_updated()"
});
formatter.result({
  "duration": 409671800,
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
      "name": "@tc_03_contactus"
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
  "duration": 35566297600,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_navigate_to_contactus_page()"
});
formatter.result({
  "duration": 2302106700,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_enter_query()"
});
formatter.result({
  "duration": 642405000,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_click_submit()"
});
formatter.result({
  "duration": 1435021800,
  "status": "passed"
});
formatter.match({
  "location": "Contact.i_will_receive_feedback_stating_query_is_successfully_sent()"
});
formatter.result({
  "duration": 898510700,
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
      "name": "@tc_04_Estimate_Shipping"
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
  "duration": 76713319300,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.i_navigate_to_shopping_cart()"
});
formatter.result({
  "duration": 1579157300,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.i_enter_the_country_and_pincode()"
});
formatter.result({
  "duration": 258498500,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.i_click_on_submit()"
});
formatter.result({
  "duration": 973808600,
  "status": "passed"
});
formatter.match({
  "location": "EstimateShipping.shipping_charge_will_be_displayed()"
});
formatter.result({
  "duration": 567657500,
  "status": "passed"
});
});