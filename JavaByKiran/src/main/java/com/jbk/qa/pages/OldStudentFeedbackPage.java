package com.jbk.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class OldStudentFeedbackPage extends TestBase{
	
	//Page Factory - Object Repository
	@FindBy(xpath="//title[text()=\"Old Student Feedback | Java By Kiran\"]")
	WebElement gettitleoffeedbacklink;
	
	@FindBy(xpath="//h1[text()=\"Old Student Feedback\"]")
	WebElement checklabeloffeedbackpage;
	
	@FindBy(xpath="//*[@id=\"feedback\"]/figure[1]/a/img")
	WebElement clickonFIRSTimage;
	
	
	
	
	//Initializing the page objects
	public OldStudentFeedbackPage() throws Exception 
	{
		super();
		PageFactory.initElements(driver, this);	
	}

	//Actions:
	public String getFeedbackLinkTitle()
	{
		return driver.getTitle();
	}
	
	public String checkFeedbackPageLabel()
	{
		return checklabeloffeedbackpage.getText();
		//return checklabeloffeedbackpage.isDisplayed();
	}
	
	public  ImageOnePage openFirstImage() throws FileNotFoundException
	{
		clickonFIRSTimage.click();
		return new ImageOnePage();
		
	}
	
	
	
	
}
