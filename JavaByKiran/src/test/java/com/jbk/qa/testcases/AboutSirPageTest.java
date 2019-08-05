package com.jbk.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.AboutSirInfoPage;
import com.jbk.qa.pages.HomePage;

public class AboutSirPageTest extends TestBase{
	HomePage homePage;
	AboutSirInfoPage aboutsirpage;

	public AboutSirPageTest() throws FileNotFoundException {
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
	
	@Test()
	public void aboutSirLinkTest() throws FileNotFoundException
	{
		aboutsirpage = homePage.aboutSirLinkSelect();
		System.out.println("About Sir link clicked successfully");
	}
	
	
	

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
