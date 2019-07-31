package com.jbk.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.ImageOnePage;
import com.jbk.qa.pages.OldStudentFeedbackPage;

public class OldStudentFeedbackPageTest extends TestBase{
	HomePage homePage;
	OldStudentFeedbackPage oldstudentfeedbackPage;
	ImageOnePage imageonepage;
	public OldStudentFeedbackPageTest() throws FileNotFoundException {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		try {
			homePage = new HomePage();
			oldstudentfeedbackPage = homePage.getOldStudentsFeesbackLink();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=1)
	public void getFeedbackLinkTitleTest() throws Exception
	{
		String feedbakpagetitle = oldstudentfeedbackPage.getFeedbackLinkTitle();
		Assert.assertEquals(feedbakpagetitle, "Old Student Feedback | Java By Kiran","Title does not matched");
		System.out.println(feedbakpagetitle);
		System.out.println("OldStudentFeedback Page title get matched successfully");
	}
	
	@Test(priority=2)
	public void checkFeedbackPageLabelTest()
	{
		String feedbackpagelabel = oldstudentfeedbackPage.checkFeedbackPageLabel();
		Assert.assertEquals(feedbackpagelabel, "Old Student Feedback");
		System.out.println(feedbackpagelabel);
		System.out.println("Swiched to OldStudenFeedback Page Successfully");
		
	}
	
	@Test(priority=3)
	public void openImageOneTest() throws FileNotFoundException
	{
		oldstudentfeedbackPage.openFirstImage();
		System.out.println("Image One open successfully");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
