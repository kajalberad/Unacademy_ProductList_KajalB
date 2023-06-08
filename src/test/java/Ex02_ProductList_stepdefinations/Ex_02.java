package Ex02_ProductList_stepdefinations;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.ProductListPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex_02 extends Utility {
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public ProductListPage pl;
	
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp  = new HomePage();
		pl = new ProductListPage();
	}
	
	@Given("Chrome is opened and Unacademy app is opened")
	public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException 
	{
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
	public void user_clicks_on_login_button() throws IOException, InterruptedException 
	{
		objectMethod();
        ldp.LoginButton();
        Thread.sleep(3000);
        //Utility.implicitWait();
        Logger.log(Status.INFO, "Step 2 is executed");
        System.out.println("clicked");
	    
	}
	@Then("User Navigates onto login page")
	public void user_navigates_onto_login_page() throws IOException, InterruptedException 
	{
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
	public void clicks_on_login_button() throws IOException, InterruptedException 
	{
		objectMethod();
		//Utility.implicitWait();
		Thread.sleep(5000);
        lp.Loginbtn();
        Logger.log(Status.INFO,"Step 5 is executed");
        System.out.println("clicked");
	    
	}
	@When("User enter the OTP")
	public void user_enter_the_otp() throws IOException, InterruptedException 
	{
		objectMethod();
	    //Utility.implicitWait();
	    Thread.sleep(15000);
	    Logger.log(Status.INFO,"Step 6 is executed");
	    //I am entering OTP manually no need for anytime because it dynamic
	    System.out.println("enter otp");
	}
	@When("User click on verify otp button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(5000);
		hp=lp.Verifyotp();
		Logger.log(Status.INFO,"Step 7 is executed");
		System.out.println("verify otp");
		Thread.sleep(5000);
	}
	
	@Then("User navigates onto Home Page")
	public void user_navigates_onto_home_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		//Utility.implicitWait();
		Logger.log(Status.INFO,"Step 8 is executed");
		System.out.println("navigated");   
	}
	
	@Then("User Clicks on search box")
	public void user_clicks_on_search_box() throws IOException, InterruptedException 
	{
		 objectMethod();
		 Utility.implicitWait();
		 //Thread.sleep(1000);
		 hp.SearchBox();;
		 Logger.log(Status.INFO,"Step 9 is executed");
		 System.out.println("click search box");
	}
	
	@When("User Enters {string} in search box")
	public void user_enters_in_search_box(String search1) throws IOException, InterruptedException 
	{
		 objectMethod();
		 Thread.sleep(1000);
		 hp.SearchKey(search1);
		 Logger.log(Status.INFO,"Step 10 is executed");
		 System.out.println("searched");
		 Thread.sleep(5000);
	}
	@Then("Relevant search result is displayed")
	public void relevant_search_result_is_displayed() throws IOException, InterruptedException 
	{
		objectMethod();
	    //Thread.sleep(2000);
	    Utility.implicitWait();
	    Logger.log(Status.INFO,"Step 11 is executed");
	    System.out.println("valid result displayed");
	    
	}

	@When("User Enters {string} in   search box")
	public void user_enters_in_search_box1(String search1) throws IOException, InterruptedException 
	{
		 objectMethod();
		 Thread.sleep(1000);
		 hp.SearchKey1(search1);
		 Logger.log(Status.INFO,"Step 12 is executed");
		 System.out.println("searched");
		 Thread.sleep(3000);
	}
	
	@Then("Relevant search result is not displayed")
	public void relevant_search_result_is_not_displayed() throws IOException, InterruptedException 
	{
		 objectMethod();
		 //Thread.sleep(1000);
		 Utility.implicitWait();
		 Logger.log(Status.INFO,"Step 13 is executed");
		 System.out.println("not displayed");
		   
	}
	

}
