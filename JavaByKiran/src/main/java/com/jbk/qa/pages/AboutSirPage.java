package com.jbk.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class AboutSirPage extends TestBase{

	public AboutSirPage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}	
	
	
}
