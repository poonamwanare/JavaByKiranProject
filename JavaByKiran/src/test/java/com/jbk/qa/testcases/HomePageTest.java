package com.jbk.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.VideosPage;

public class HomePageTest extends TestBase
{
	HomePage homePage;
	VideosPage videosPage;
	public HomePageTest() throws Exception 
	{
		super();	
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		try {
			homePage = new HomePage();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void HomePageTitleTest()
	{
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Best Industrial Java Classes | Selenium Training in Pune");
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void mainHeadingTitleTest()
	{
		String lefthead1 = homePage.leftMainHeading();
		Assert.assertEquals(lefthead1,"Java By Kiran");
		System.out.println(lefthead1);
	}
	
	@Test(priority=3)
	public void belowMainHeadingTest()
	{
		String lefthead2 = homePage.leftHeading();
		Assert.assertEquals(lefthead2, "Java & Selenium Training Institute");
		System.out.println(lefthead2);
	}
	
	@Test(priority=4)
	public void rightHeadingTest()
	{
		String righthead = homePage.rightHeading();
		System.out.println(righthead);
	}
	
	@Test(priority=5)
	public void liveVdoLinkTest() throws Exception
	{
		videosPage = homePage.liveVdoLink();
	}
	
	@Test(priority=6)
	public void clickOnGetStudentFeedbackLink() throws Exception
	{
		homePage.getOldStudentsFeesbackLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
