package com.jbk.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class HomePage extends TestBase
{
	//Page Factory - Object Repository
	
	@FindBy(xpath = "//h1[ text()='Java By Kiran']")
	WebElement headingL1;
	
	@FindBy(xpath = "//strong[ text()='Java & Selenium Training Institute']")
	WebElement headingL2;
	
	@FindBy(id = "mainright")
	WebElement headingR;
	
	@FindBy(className = "button")
	WebElement liveVdo;
	
	@FindBy(xpath="//a[text()=\" Get Old Students Feedback \"]")
	WebElement oldStudFeedback;
	
	//Initializing the page objects
	public HomePage() throws Exception 
	{
		super();
		PageFactory.initElements(driver, this);	
	}
	
	//Actions:
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String leftMainHeading()
	{
		return headingL1.getText();
	}
	
	public String leftHeading()
	{
		return headingL2.getText();
	}
	
	public String rightHeading()
	{
		return headingR.getText();
	}
	
	public VideosPage liveVdoLink() throws Exception
	{
		liveVdo.click();
		return new VideosPage();
	}
	
	public OldStudentFeedbackPage getOldStudentsFeesbackLink() throws Exception
	{
		oldStudFeedback.click();
		return new OldStudentFeedbackPage();
	}

}
