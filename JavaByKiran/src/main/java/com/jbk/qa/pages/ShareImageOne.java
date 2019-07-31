package com.jbk.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class ShareImageOne extends TestBase{

	public ShareImageOne() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class=\"pswp__share--facebook\"]")
	WebElement shareonfacebooklink;
	
	public ShareOnFacebookLinkImageOne shareOnFacebookFIRSTImage()
	{
		shareonfacebooklink.click();
		return new ShareOnFacebookLinkImageOne();
	}

}
