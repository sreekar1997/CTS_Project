package com.testrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(   features = "C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\features\\c.feature",
	  glue = "com.stepdefinition",
	  plugin = {"pretty","html:target/cucumber-html-report",
			             "json:target/cucumber-json-report",
			             "junit:target/cucumber-junit-report",
			             "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"}
	 
)
	

public class testrunner {

}
