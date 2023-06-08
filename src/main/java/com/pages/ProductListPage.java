package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class ProductListPage extends Utility
{
	public String validateProductListPageTitle()
    {

        return driver.getTitle();

    }

    public 	ProductListPage() throws IOException
    {
         PageFactory.initElements(driver,this);
         
    }

    //Product list page heading for UI
    @FindBy(xpath="//*[text()='Showing results for \"Software Testing\"']")
    private WebElement heading;
    
    public String Heading()
    {
    	 return heading.getText();
   
    }
    
    
    //Product list Page unacademy logo
    @FindBy(xpath="(//img[@alt='Company Logo'])[1]")
    private WebElement logo;
    
    public boolean Logo() 
    {
    	System.out.println(logo.isDisplayed());
    	return logo.isDisplayed();
    }
    
    
    
    
    //Product list page Logo xpath
    @FindBy(xpath=("//img[@alt='ttu']"))
    private WebElement call;
    
    public boolean Call() 
    {
    	System.out.println(call.isDisplayed());
    	return call.isDisplayed();
    }
    
     
    
    //SEEALL button xpath
    @FindBy(xpath="//a[@href='/search/Software%20Testing/user\']")
    WebElement seeall;
    
    public void SEEALL() {
    	seeall.click();
    }
    
    
   
}