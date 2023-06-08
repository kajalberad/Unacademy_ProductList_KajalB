package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features/ProductList_1.feature"},
		glue = {"Ex01_ProductList_stepdefinations", "apphooks"},
	    plugin= {"pretty" ,
						 "html:Cucumber_Reports/cucumber",
						 "json:Cucumber_Reports/cucumber.json",
				 		 "junit:Cucumber_Reports/cucumber.xml"}
		
		)
public class Ex_01_ProductList_TestRunner extends AbstractTestNGCucumberTests
{
  
}
