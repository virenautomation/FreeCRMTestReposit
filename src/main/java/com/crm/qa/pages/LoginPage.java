package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{

	//Page Factory - OR;
	@FindBy(xpath="//*[@id=\'nav-link-accountList\']/span[2]/span")
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;

	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;
	
	@FindBy(xpath="//*[@id=\"nav-logo\"]/a[1]/span[1]")
	WebElement AmazonLogo;
	
	//Initializing the page objects:
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions:
	public String validateAmazonPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo()
	{
		return AmazonLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
		loginbtn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		username.clear();
		username.sendKeys(un);
		continuebtn.click();
		password.clear();
		password.sendKeys(pwd);
		signinbtn.click();		
		
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		signinbtn.click();
		
		return new HomePage();
		
	}
	
	
	
}
