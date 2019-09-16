package com.crm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
	super();
}

	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void AmazonTitleTest()
	{
		String title = loginPage.validateAmazonPageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "The Title is not matched");
	}
	
	@Test(priority=2)
	public void AmazonLogoImageTest()
	{
		boolean flag = loginPage.validateAmazonLogo();
		Assert.assertTrue(flag);
		}
	
	@Test(priority=3)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}