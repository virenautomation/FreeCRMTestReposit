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
		public void ValidateSearchTxtBoxTest()
		{
			boolean srhTx=buyPage.ValidateSearchTxtBox();
//			Assert.assertEquals(BuyAg, "virender's Amazon.in");
			Assert.assertTrue(srhTx, "The Textbox is enabled");
			buyPage.SearchTxtBx.sendKeys("Echo dot");
		}
		
		@Test(priority=2)
		public void ValidateSearchGoLink()
		{
			boolean srhLnk=buyPage.ValidateSearchGoLink();
			Assert.assertTrue(srhLnk);
			buyPage.searchGolink.click();
		}
		
		@Test(priority=3)
		public void ValidateEchoDotLinkTest()
		{
			boolean Echolnk=buyPage.ValidateEchodotLink();
			Assert.assertTrue(Echolnk);
			buyPage.EchoDotLink.click();
		}
	
		@Test(priority=4)
		public void ValidateAddToCartBtnTest()
		{
			boolean AddToBtn=buyPage.ValidateAddToCartBtn();
			Assert.assertTrue(AddToBtn);
			buyPage.AddToCartBtn.click();
		}
		
		@Test(priority=5)
		public void ValidateProceedToBuyBtnTest()
		{
			boolean PrdTobuyBtn=buyPage.ValidateProceedToBuyBtn();
			Assert.assertTrue(PrdTobuyBtn);
			buyPage.ProceedToBuyBtn.click();
		}
		
//		@Test(priority=5)
//		public void ValidateDelvAddressBtnTest()
//		{
//			boolean DelAddbtn=buyPage.ValidateDelvAddressBtn();
//			Assert.assertTrue(DelAddbtn);
//			buyPage.DelvAddressBtn.click();
//		}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	}
