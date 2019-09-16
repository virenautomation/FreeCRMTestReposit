package com.crm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.OrdersPage;

public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	static HomePage homePage;
	OrdersPage orderPage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeTest
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		orderPage = new OrdersPage();
		homePage = loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
	
	
	@Test(priority=1)
	public void HomePageTitleTest()
	{
		String title = homePage.ValidateHomePageTitle();
		Assert.assertEquals(title, "Hello, virender");
	}
	
	@Test(priority=2)
	public void IsPrimeMembershipTest()
	{
		boolean prime = homePage.ValidatePrimeMembership();
		Assert.assertTrue(prime, "Prime");
	}
	
	@Test(priority=3)
	public void DeliveryLocationTest()
	{
		String location = homePage.ValildateDeliveryLocation();
		Assert.assertEquals(location, "Ghaziabad 201003â€Œ");
	}
	
	@Test(priority=4)
	public void SearhAllOptionTest()
	{
		boolean search = homePage.ValidateSearchAllOption();
		Assert.assertTrue(search);
	}
	
	@Test(priority=5)
	public void LanguagePreferenceTest()
	{
		boolean lang = homePage.ValidateLanguagePreference();
		Assert.assertTrue(lang);
	}
	
	@Test(priority=6)
	public void OrderLinkTest()
	{
		 boolean order = homePage.ValidateOrderLink();
		Assert.assertEquals(order, true);
	}
	
	@Test(priority=7)
	public void ValidateOrderPageTitleTest()
	{
		orderPage = homePage.ValidateOrderPageTitle();	
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
