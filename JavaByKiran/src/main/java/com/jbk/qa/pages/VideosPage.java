package com.jbk.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class VideosPage extends TestBase{

	@FindBy(xpath="//h1[contains(text(),\"Java-J2EE Videos\")]")
	WebElement checkvdoLabels;
	
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	WebElement searchbox;
	
	//Initializing the page objects
		public VideosPage() throws Exception 
		{
			super();
			PageFactory.initElements(driver, this);	
		}
		
		//Actions:
		public String validateLiveVideosTitle()
		{
			return driver.getTitle();
		}
		
		public boolean checkVdoPageLabel()
		{
			return checkvdoLabels.isDisplayed();
		}
		
		public void searchBoxValidation() throws Exception
		{
			System.out.println("Enter in searchBoxValidation");
			searchbox.sendKeys("Spring boot", Keys.ENTER);
					}
	
	
	
	
	
}
