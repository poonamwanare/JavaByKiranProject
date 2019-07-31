package com.jbk.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LiveVdoLinkTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D://sellib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium%20Automation%20PROJECT%20for%20offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void openVideoLink()
	{
		driver.findElement(By.className("button")).click();
	}

	@Test
	public void clickNextvdoButton()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\"youmax-next-div\"]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	  @Test 
	  public void searchForVideo() 
	  { 
		  WebElement search =driver.findElement(By.id("youmax-search-box"));
		  search.sendKeys("Spring boot", Keys.ENTER); 
	  }
	  
	  @Test 
	  public void openSearchedVideo() 
	  { 
		  try {
			WebElement openvdo=driver.findElement(By.xpath("//*[@id=\"youtube_Bnc9_1kPTTU\"]/div[1]/img")); 
			  openvdo.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  }
	 
	 @AfterTest 
	 public void tearDown() 
	 { 
		 driver.quit(); 
	 }
	
}	 


