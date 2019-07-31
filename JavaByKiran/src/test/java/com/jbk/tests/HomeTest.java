package com.jbk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest 
{
	WebDriver driver;

	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "D://sellib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium%20Automation%20PROJECT%20for%20offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void oldStudentFeedbackLink()
	{
		//click on Gets old students feedbak link
		driver.findElement(By.xpath("//a[@href='old-student-feedback-java-by-kiran.html']")).click();
		//get back to home page
		driver.navigate().back();
	}
	
	@Test
	public void seleniumSyllabusLink()
	{
		//Click on selenium syllabus link
		driver.findElement(By.xpath("//a[@href='selenium-testing-syllabus.html']")).click();
		//click on download syllabus
		driver.findElement(By.xpath("//a[@href='download/syllabus/selenium-testing-syllabus.pdf']")).click();
	}
	
	@Test
	public void downloadSyllabusPage()
	{
		//click on Rotate clockwise
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"buttons\"]"))).click().build().perform();
		//driver.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
		//checking for download
		//driver.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
	}
}
