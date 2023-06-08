package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/features/Excel.feature"},
		glue= {"Ex03_Excel_stepdefinations","apphooks"},
		plugin= {"pretty",
				"html:Cucumber_Reports/cucumber",
				 "json:Cucumber_Reports/cucumber.json",
		 		 "junit:Cucumber_Reports/cucumber.xml"}
		
		)
public class Ex_03_Excel_TestRunner extends AbstractTestNGCucumberTests {
}