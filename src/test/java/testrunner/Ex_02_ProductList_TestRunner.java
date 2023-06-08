package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/features/ProductList_2.feature"},
		glue= {"Ex02_ProductList_stepdefinations","apphooks"},
		plugin= {"pretty",
				"html:Cucumber_Reports/cucumber",
				 "json:Cucumber_Reports/cucumber.json",
		 		 "junit:Cucumber_Reports/cucumber.xml"}
		
		)
public class Ex_02_ProductList_TestRunner extends AbstractTestNGCucumberTests {
  
}
