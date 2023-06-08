package Ex01_ProductList_stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.ProductListPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utility.*;

public class Ex_01 extends Utility
{
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
	public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException
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
		//Thread.sleep();
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
		Utility.implicitWait();
        //Thread.sleep(1000);
		lp.loginmobilenumber(mn);
		Logger.log(Status.INFO,"Step 4 is executed");
		System.out.println("mobile");
    }
	
	@When("Clicks on login button")
	public void clicks_on_login_button() throws IOException, InterruptedException {
		
		objectMethod();
		Utility.implicitWait();
		//Thread.sleep(5000);
        lp.Loginbtn();
        Logger.log(Status.INFO,"Step 5 is executed");
        System.out.println("clicked");
        Thread.sleep(15000);

	}
	
	@When("User enter the OTP")
	public void user_enter_the_otp() throws InterruptedException, IOException {
	    objectMethod();
	    //Utility.implicitWait();
	    Logger.log(Status.INFO,"Step 6 is executed");
	    //I am entering OTP manually no need for anytime because it dynamic
	    System.out.println("enter otp");
	
		
	}
	
	@When("User click on verify otp button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
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
		
	
	
	 @And("User Clicks on search box")
	 public void user_clicks_on_search_box() throws IOException, InterruptedException  {
		 objectMethod();
		 Utility.implicitWait();
		 //Thread.sleep(1000);
		 hp.SearchBox();
		 Logger.log(Status.INFO,"Step 9 is executed");
		 System.out.println("click search box");
	}
	 

	 @When("User search the course {string}")
	 public void user_search_the_course(String course) throws IOException, InterruptedException {
		 objectMethod();
		 Thread.sleep(1000);
		 //Utility.implicitWait();
		 hp.Searchkeyword(course);
		 Logger.log(Status.INFO,"Step 10 is executed");
		 System.out.println("searched");
		 Thread.sleep(5000);
	     
	 }

	 
	 @Then("User click on particular course")
	 public void user_click_on_particular_course() throws IOException, InterruptedException {
	     objectMethod();
	     Thread.sleep(1000);
	     //Utility.implicitWait();
	     hp.SearchResult();
	     Logger.log(Status.INFO,"Step 11 is executed");
	     System.out.println("Clicked course");
	     Thread.sleep(5000);
	 }

	 @Then("User navigates on to the course list page")
	 public void user_navigates_on_to_the_course_list_page() throws InterruptedException, IOException
	 {   
		 objectMethod();
		 //Thread.sleep(1000);
		 Utility.implicitWait();
		 Logger.log(Status.INFO,"Validating Product list page title");
		 System.out.println("Navigate course list page");
		 
		 String actualTitle =pl.validateProductListPageTitle();
		 String expectedTitle ="Unacademy - India's largest learning platform";
		 try {
			 assertEquals(actualTitle,expectedTitle);
			Logger.log(Status.PASS,"Step 12 is passed");
			System.out.println(actualTitle);
			assert true;
		 }catch(AssertionError e)
		 {
			 e.printStackTrace();
			 Logger.log(Status.FAIL,"Step 12 failed");
			 captureScreenshotOnFailure();
			 assert false;
			
		 }
       }
	 

     @Then("CourseListPage title is visible to the user")
     public void course_list_page_title_is_visible_to_the_user() throws IOException, InterruptedException {
    	  objectMethod();
          //Thread.sleep(1000);
          Utility.implicitWait();
          String actualtext = pl.Heading();
          String expectedtext = "Showing results for \"Software Testing\"";
          assertEquals(expectedtext,actualtext);
          Logger.log(Status.INFO, "Step 13 is executed");
          System.out.println(actualtext);
     }
   
     @And("User is able see the Logo")
     public void user_is_able_see_the_logo() throws IOException, InterruptedException {
    	 objectMethod();
    	 //Thread.sleep(1000);
    	 Utility.implicitWait();
         boolean checkLogo = pl.Logo();
         assertTrue(checkLogo);
         Logger.log(Status.INFO,"Step 14 is executed");
         System.out.println("logo");
         Thread.sleep(1000);
     }
   
     @And("User is able to see call logo")
     public void user_is_able_to_see_call_logo() throws IOException, InterruptedException {
    	 objectMethod();
    	 //Thread.sleep(1000);
    	 Utility.implicitWait();
    	 boolean CheckCall = pl.Call();
    	 assertTrue(CheckCall);
    	 Logger.log(Status.INFO,"Step 15 is executed");
    	 System.out.println("call");
    	 Thread.sleep(1000);
    	 
     }
    
	 
	 @When("User clicks on {string} link")
	 public void user_clicks_on_link(String string) throws InterruptedException, IOException {
	   objectMethod();
	   //Thread.sleep(1000);
	   Utility.implicitWait();
	   pl.SEEALL();
	   System.out.println("click seeall");
	   Logger.log(Status.INFO,"Step 16 is executed");
	   Thread.sleep(3000);
	 }
	 
	 @Then("{string} link should clickable")
	 public void link_should_clickable(String string) throws IOException {
		 objectMethod();
		 Logger.log(Status.INFO,"Step 17 is executed");
		 System.out.println("link is clickable");
	    
	 }

	
}
