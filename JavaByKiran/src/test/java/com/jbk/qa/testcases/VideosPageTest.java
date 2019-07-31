package com.jbk.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.VideosPage;

public class VideosPageTest extends TestBase
{
	
	public VideosPageTest() throws FileNotFoundException {
		super();
	}

	HomePage homePage;
	VideosPage videosPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		try {
			homePage = new HomePage();
			//videosPage = new VideosPage();
			videosPage = homePage.liveVdoLink();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test(priority=1)
	public void liveVideoTitleTest() {
		String vdolinktitle = videosPage.validateLiveVideosTitle();
		Assert.assertEquals(vdolinktitle, "Java-J2EE Videos | Java By Kiran","Video Page title is not matched");
		System.out.println(vdolinktitle);
	}
	
	
	  @Test(priority=2) 
	  public void checkVdoPageLAbelTest() { 
	  //String labelvdo = videosPage.checkVdoPageLabel(); 
	  Assert.assertTrue(videosPage.checkVdoPageLabel()); 
	  //System.out.println(labelvdo); 
	  }
	  
	/*
	 * @Test(priority=3) public void searchBoxTest() throws Exception {
	 * videosPage.searchBoxValidation(); }
	 */


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
