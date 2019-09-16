package com.crm.qa.pages;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddressAdditionPage extends TestBase
{
	@FindBy(id="enterAddressFullName")
	@CacheLookup
	WebElement FullNameTxtBox;
	
	@FindBy(id="enterAddressPhoneNumber")
	@CacheLookup
	WebElement MobNoTxtBox;
	
	@FindBy(id="enterAddressPostalCode")
	@CacheLookup
	WebElement PinTxtBox;
	
	@FindBy(id="enterAddressAddressLine1")
	WebElement FlatTxtBox;
	
	@FindBy(id="enterAddressAddressLine2")
	WebElement AreaTxtBox;
	
	@FindBy(id="enterAddressLandmark")
	WebElement LndMrkTxtBox;
	
	@FindBy(id="enterAddressCity")
	WebElement CityTxtBox;
	
	@FindBy(id="enterAddressStateOrRegion")
	WebElement StateTxtBox;
	
	@FindBy(xpath="//*[@id=\"newShippingAddressFormFromIdentity\"]/div[1]/div[1]/form/div[5]/span/span/input")
	WebElement DlvrAddrssBtn;

public AddressAdditionPage()
{
	PageFactory.initElements(driver, this);
}

//public void ScrollPage() throws FileNotFoundException, IOException, NullPointerException
//{
//	 //to perform Scroll on application
////	try {
////	 JavascriptExecutor js = (JavascriptExecutor) driver;
////	 js.executeScript("window.scrollBy(2000,0)");
//	 
//	 try {
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(2000,0)");
//		}
//		catch(NullPointerException e)
//		{
//			e.printStackTrace();
//		}
//}

public void EnterAddressDetails(String FName, String MobNo, String PinNo, String FltNo, String ArNo, String LndMrk, String city, String state)
{
	FullNameTxtBox.sendKeys(FName);
	MobNoTxtBox.sendKeys(MobNo);
	PinTxtBox.sendKeys(PinNo);
	FlatTxtBox.sendKeys(FltNo);
	AreaTxtBox.sendKeys(ArNo);
	LndMrkTxtBox.sendKeys(LndMrk);
	CityTxtBox.sendKeys(city);
	StateTxtBox.sendKeys(state);
	DlvrAddrssBtn.click();
}
}








