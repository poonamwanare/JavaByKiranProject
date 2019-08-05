package com.jbk.qa.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.ImageOnePage;
import com.jbk.qa.pages.OldStudentFeedbackPage;
import com.jbk.qa.pages.ShareImageOne;

public class ShareImageOneTest extends TestBase{
	
	HomePage homePage;
	OldStudentFeedbackPage oldstudentfeedbackPage;
	ImageOnePage imageonepage;
	ShareImageOne sharefirstimage;
	
	public ShareImageOneTest() throws FileNotFoundException {
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
	public void shareImageOneOnFacebookTest() throws FileNotFoundException
	{
		//System.out.println("1");
		Actions action = new Actions(driver);
		System.out.println("2");
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		System.out.println("3");
		sharefirstimage = imageonepage.shareFIRSTImage();
		System.out.println("4");
		WebElement shareonfacebook = driver.findElement(By.xpath("//a[text()=\"Share on Facebook\"]"));
		System.out.println("5");
		action.moveToElement(shareonfacebook).build().perform();
		System.out.println("6");
		sharefirstimage.shareOnFacebookFIRSTImage();
		System.out.println("Image one share on facebook");
	}
	
	@Test(priority=2)
	public void shareImageOneOnTwitterTest() throws FileNotFoundException
	{
		Actions action = new Actions(driver);
		imageonepage = oldstudentfeedbackPage.openFirstImage();
		sharefirstimage = imageonepage.shareFIRSTImage();
		WebElement shareontwitter = driver.findElement(By.xpath("//a[@class=\"pswp__share--twitter\"]"));
		action.moveToElement(shareontwitter).perform();
		sharefirstimage.shareOnTwitterFIRSTImage();
		System.out.println("Image one share on twitter");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
