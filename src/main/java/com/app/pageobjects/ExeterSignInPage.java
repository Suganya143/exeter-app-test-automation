package com.app.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.commons.PageUtils;

public class ExeterSignInPage {

	final WebDriver driver;
	
	@FindBy(name = "txtUsername")
	WebElement userName;
	
	public ExeterSignInPage() {
		this.driver = PageUtils.getDriver();
		PageFactory.initElements(driver, this);
	}
	
}
