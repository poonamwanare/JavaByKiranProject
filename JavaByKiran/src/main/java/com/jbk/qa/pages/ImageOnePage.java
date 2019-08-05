package com.jbk.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class ImageOnePage extends TestBase{

	public ImageOnePage() throws FileNotFoundException {
		super();
		
		PageFactory.initElements(driver, this);
	}
	//Page Factory
	@FindBy(className="pswp__counter")
	WebElement checkingimagecount;
	
	@FindBy(xpath="//button[@class=\"pswp__button pswp__button--zoom\"]")
	WebElement zoominimageOne;
	
	@FindBy(xpath="//button[@class=\"pswp__button pswp__button--zoom\"]")
	WebElement zoomoutimageOne;
	
	@FindBy(xpath="//button[@class=\"pswp__button pswp__button--fs\"]")
	WebElement togglefullscreenimageone;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div[2]/div[2]")
	WebElement detogglefullscreenimageone;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div[2]/div[2]/div[1]/button[2]")
	WebElement shareimageone;
	
	//Actions
	public String checkFirstImageCount() 
	{
		return checkingimagecount.getText();
	}
	
	public ZoomImageOne zoominFIRSTImage()
	{
		zoominimageOne.click();
		return new ZoomImageOne();
	}

	public ZoomImageOne zoomoutFIRSTImage()
	{
		zoominimageOne.click();
		return new ZoomImageOne();
	}
	
	public ToggleFullscreenImageOne toggleFullscreenFIRSTImage()
	{
		togglefullscreenimageone.click();
		return new ToggleFullscreenImageOne();
	}
	
	public DetoggleFullscreenImageOne detoggleFullscreenFIRSTImage()
	{
		detogglefullscreenimageone.click();
		return new DetoggleFullscreenImageOne();
	}
	
	public ShareImageOne shareFIRSTImage() throws FileNotFoundException
	{
		shareimageone.click();
		return new ShareImageOne();
	}
	
}
