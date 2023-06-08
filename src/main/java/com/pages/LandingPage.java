package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility {
	

   
	public LandingPage()throws IOException
	{
	   PageFactory.initElements(driver,this);	
	}
	
	public String validateLandingPageTitle() 
	{
		
		return driver.getTitle();
	}
	
	
	//Landing page login button
	@FindBy(xpath="//*[normalize-space(text())='Log in']")
	private WebElement loginButton;
	
	
	//click on login button
	public LoginPage LoginButton() throws IOException
	{
		loginButton.click();
		return new LoginPage();
	}

}

