package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomePage extends Utility {

	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	public String validateHomePageTitle()
	{
		return driver.getTitle(); 
	}  
	

    ////*[@placeholder='Search courses, test series and educators']
	//Home Page search box click
	@FindBy(xpath="//input")
	private WebElement searchbox;
	
	public void SearchBox() throws IOException 
	{
		searchbox.click();

	}
	
	
	//Home page sendkeys in searchbox
	public void Searchkeyword(String course)
	{
		searchbox.sendKeys(course);
	}
	
	
	// select the course
	@FindBy(xpath="//*[text()='Topic • 22 courses']")
	WebElement searchresult;
	
	public void SearchResult() {
		searchresult.click();
	}
	
	

	//sendkeys for valid keyword-outline
	public void SearchKey(String search1)
	{
		searchbox.sendKeys(search1);
		
	}
	
	
	
	//sendkeys for invalid keyword-outline
	public void SearchKey1(String search1)
	{
		searchbox.sendKeys(search1); 
	}
	
	
}

	

