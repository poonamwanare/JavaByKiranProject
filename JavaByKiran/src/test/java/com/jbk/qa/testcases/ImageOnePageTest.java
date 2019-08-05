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
import com.jbk.qa.pages.ShareImageOne;

public class ImageOnePageTest extends TestBase{
	HomePage homePage;
	OldStudentFeedbackPage oldstudentfeedbackPage;
	ImageOnePage imageonepage;
	ShareImageOne sharefirstimage;
	
	public ImageOnePageTest() throws FileNotFoundException {
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
	public void imageOneCountTest() throws FileNotFoundException 
	{
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		String imageonecount = imageonepage.checkFirstImageCount();
		Assert.assertEquals(imageonecount, "1 / 12","Image One Count is not matched");
		System.out.println(imageonecount);
		System.out.println("Image One Count matched successfully");
		
	}
	
	@Test(priority=2)
	public void imageOneZoomInTest() throws FileNotFoundException 
	{
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		imageonepage.zoominFIRSTImage();
		System.out.println("Image One Zoom In successfully");
		
	}
	
	@Test(priority=3)
	public void imageOneZoomOutTest() throws FileNotFoundException 
	{
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		imageonepage.zoomoutFIRSTImage();
		System.out.println("Image One Zoom Out successfully");
		
	}
	
	@Test(priority=4)
	public void toggleFullscreenImageOneTest() throws FileNotFoundException 
	{
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		imageonepage.toggleFullscreenFIRSTImage();
		System.out.println("Image One Toggled Fullscreen successfully");
		
	}
	
	@Test(priority=5)
	public void detoggleFullscreenImageOneTest() throws FileNotFoundException 
	{
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		imageonepage.detoggleFullscreenFIRSTImage();
		System.out.println("Image One Detoggled Fullscreen successfully");
		
	}
	
	@Test(priority=6)
	public void shareImageOneTest() throws FileNotFoundException 
	{
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		imageonepage.shareFIRSTImage();
		System.out.println("Image One sharing");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

