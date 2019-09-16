package com.crm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BuyPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class BuyTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	BuyPage buyPage;
	
	public BuyTest()
	{
		super();
	}
	
		@BeforeTest
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		buyPage = new BuyPage();
		homePage = loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
		
		@Test(priority=1)
		public void ValidateBuyAgainLinkTest()
		{
			String BuyAg=buyPage.ValidateBuyAgainLink();
			Assert.assertEquals(BuyAg, "Buy Again");
			buyPage.BuyAgainLink.click();
		}
		
		@Test(priority=2)
		public void ValidateAddToCartBtnTest()
		{
			boolean Adtocrt=buyPage.ValidateAddToCartBtn();
			Assert.assertTrue(Adtocrt);
			buyPage.AddToCartBtn.click();
		}
		
		@Test(priority=3)
		public void ValidateAddToCartLinkTest()
		{
			boolean Adtocrtlnk=buyPage.ValidateAddToCartLink();
			Assert.assertTrue(Adtocrtlnk);
			buyPage.AddToCartLink.click();
		}
	
		@Test(priority=4)
		public void ValidateProceedToBuyBtnTest()
		{
			boolean PrdTobuyBtn=buyPage.ValidateProceedToBuyBtn();
			Assert.assertTrue(PrdTobuyBtn);
			buyPage.ProceedToBuyBtn.click();
		}
		
		@Test(priority=5)
		public void ValidateDelvAddressBtnTest()
		{
			boolean DelAddbtn=buyPage.ValidateDelvAddressBtn();
			Assert.assertTrue(DelAddbtn);
			buyPage.DelvAddressBtn.click();
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	}
