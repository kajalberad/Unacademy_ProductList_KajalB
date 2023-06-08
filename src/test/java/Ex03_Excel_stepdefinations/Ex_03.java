package Ex03_Excel_stepdefinations;

import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.aventstack.extentreports.Status;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.ProductListPage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex_03 extends Utility 
{
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public ProductListPage pl;
	public ExcelReader reader;
	
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp  = new HomePage();
		pl = new ProductListPage();
	}
	
	@Given("Chrome is opened and Unacademy app is opened")
	public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(2000);
		Utility.implicitWait();
	    Logger = report.createTest("test01");
        Logger.log(Status.INFO, "Validating landing page title");

		String actualTitle = ldp.validateLandingPageTitle();
		String expectedTitle = "Unacademy - India's largest learning platform"; 
		 try {
	            assertEquals(actualTitle, expectedTitle);
	            Logger.log(Status.PASS, "Step 1 is passed");
	            System.out.println(actualTitle);
	            assert true;
	        } catch (AssertionError e) 
		      {
	            e.printStackTrace();
	            Logger.log(Status.FAIL, "Step 1 is failed");
	            captureScreenshotOnFailure();
	            assert false;
	        }
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
        ldp.LoginButton();
        //Thread.sleep(3000);
        Utility.implicitWait();
        Logger.log(Status.INFO, "Step 2 is executed");
        System.out.println("clicked");
	}
	
	@Then("User Navigates onto login page")
	public void user_navigates_onto_login_page() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(1000);
		Utility.implicitWait();
		Logger.log(Status.INFO,"Validating login page title");
		System.out.println("Navigates on to loginPage");	

		String actualTitle =lp.validateLoginPageTitle();
	    String expectedTitle="Unacademy - India's largest learning platform";
		try {
			assertEquals(actualTitle,expectedTitle);
			Logger.log(Status.PASS,"Step 3 is Paased");
			assert true;
		}catch(AssertionError e)
		{
			e.printStackTrace();
			Logger.log(Status.FAIL,"Step 3 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
	}
	
	@When("User enters mobile number {string}")
	public void user_enters_mobile_number(String mn) throws IOException, InterruptedException 
	{
		objectMethod();
		//Utility.implicitWait();
		Thread.sleep(1000);
		lp.loginmobilenumber(mn);
		Logger.log(Status.INFO,"Step 4 is executed");
		System.out.println("mobile");
    }
	
	@When("Clicks on login button")
	public void clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		//Utility.implicitWait();
		Thread.sleep(5000);
        lp.Loginbtn();
        Logger.log(Status.INFO,"Step 5 is executed");
        System.out.println("clicked");
	}
	
	@When("User enter the OTP")
	public void user_enter_the_otp() throws IOException, InterruptedException {
		objectMethod();
	    //Utility.implicitWait();
	    Thread.sleep(15000);
	    Logger.log(Status.INFO,"Step 6 is executed");
	    //I am entering OTP manually no need for anytime because it dynamic
	    System.out.println("enter otp");   
	}
	
	@When("User click on verify otp button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		hp=lp.Verifyotp();
		Logger.log(Status.INFO,"Step 7 is executed");
		System.out.println("verify otp");
		Thread.sleep(5000);
	}
	
	@Then("User navigates onto Home Page")
	public void user_navigates_onto_home_page() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(1000);
		Utility.implicitWait();
		Logger.log(Status.INFO,"Step 8 is executed");
		System.out.println("navigated");   
	}
	
	@Then("User Clicks on search box")
	public void user_clicks_on_search_box() throws IOException, InterruptedException {
		 objectMethod();
		 Utility.implicitWait();
		 //Thread.sleep(1000);
		 hp.SearchBox();
		 Logger.log(Status.INFO,"Step 9 is executed");
		 System.out.println("click search box");
	}
	
	@When("User fills the data from given sheetname {string} and rownumber {int} in search box")
	public void user_fills_the_data_from_giver_sheetname_and_rownumber_in_search_box(String sheetName, Integer rowNumber) throws InterruptedException, IOException, InvalidFormatException {
		Thread.sleep(10000);
        objectMethod();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);

        String search = testData.get(rowNumber).get("searchkeyword");
        
        hp.SearchKey(search);
        Logger.log(Status.INFO, "Step 10 is executed");
        Thread.sleep(1000);
  
	}
	@Then("Relevant search result is displayed")
	public void relevant_search_result_is_displayed() throws IOException, InterruptedException {
		
		objectMethod();
	    //Thread.sleep(2000);
		Utility.implicitWait();
	    Logger.log(Status.INFO,"Step 11 is executed");
	    System.out.println("displayed");
	    //Thread.sleep(1000);
	    
	}


}
