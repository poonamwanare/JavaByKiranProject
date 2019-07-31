package com.jbk.tests;

import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadingTest 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D://sellib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium%20Automation%20PROJECT%20for%20offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void getTitle()
	{
		String title = driver.getTitle();
		assertEquals(title, "Best Industrial Java Classes | Selenium Training in Pune");
		System.out.println(title);
	}
	
	@Test
	public void mainHeadingTitle()
	{
		WebElement headingL1 = driver.findElement(By.xpath("//h1[ text()='Java By Kiran']"));
		String lefthead1 = headingL1.getText();
		assertEquals(lefthead1,"Java By Kiran");
		System.out.println(lefthead1);
	}
	
	@Test
	public void belowMainHeading()
	{
		WebElement headingL2 = driver.findElement(By.xpath("//strong[ text()='Java & Selenium Training Institute']"));
		String lefthead2 = headingL2.getText();
		assertEquals(lefthead2, "Java & Selenium Training Institute");
		System.out.println(lefthead2);
	}
	
	@Test
	public void rightHeading()
	{
		WebElement headingR = driver.findElement(By.id("mainright"));
		String righthead = headingR.getText();
		System.out.println(righthead);
	}
	
	
	
	
	@AfterTest
	public void Close()
	{
		driver.quit();
	}
}
