package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPage extends Utility
{
	
	public LoginPage()throws IOException
	{
	   PageFactory.initElements(driver,this);	
	}
	
	public String validateLoginPageTitle() 
	{
		
		return driver.getTitle();
	}
	
	
	//Mobile Number Xpath
	@FindBy(xpath="//input[@aria-invalid='false']")
    WebElement mobilenumber;  
	
	public void loginmobilenumber(String mn) 
	{
    mobilenumber.sendKeys(mn);
     }
    
	
    //For second login button after enter mobile number
	@FindBy(xpath="(//*[text()='Log in'])[2]")
    private WebElement loginB;
	
	public void Loginbtn()
	   { 
		 loginB.click();
	   }

	  
//	@FindBy(name="otp")
//	  WebElement otp;
//
//   public void loginotp(String ot) {
//    	otp.sendKeys(ot);
//    }
    
      
	//Verify OTP Xpath
      @FindBy(xpath="//*[text()='Verify OTP']")
      private WebElement verifyotp;
      
      public HomePage Verifyotp() throws IOException {
 
         verifyotp.click();

        return new HomePage();

    }    

}        
    

       
 


	

