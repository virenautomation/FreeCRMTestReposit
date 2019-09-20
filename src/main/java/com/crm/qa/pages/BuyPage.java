package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class BuyPage extends TestBase{

	@FindBy(id="twotabsearchtextbox")
	public WebElement SearchTxtBx;
	
	@FindBy(xpath="//*[@id='nav-search']/form/div[2]/div/input")
	public WebElement searchGolink;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	public WebElement EchoDotLink;
	
	@FindBy(id="add-to-cart-button")
	public WebElement AddToCartBtn;
	
	@FindBy(id="hlb-ptc-btn-native")
	public WebElement ProceedToBuyBtn;
	
//	@FindBy(xpath="//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
//	public WebElement DelvAddressBtn;
//	
//	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
//	WebElement EchoAddToCartBtn;
//	
//	@FindBy(xpath="//*[@id=\"hlb-ptc-btn-native\"]")
//	WebElement ProToBuyBtn;


public BuyPage()
{
	PageFactory.initElements(driver, this);
}

public boolean ValidateSearchTxtBox()
{
	return SearchTxtBx.isDisplayed();
//	return BuyAgainLink.isDisplayed();
//	BuyAgainLink.click();
}

public boolean ValidateSearchGoLink()
{
	return searchGolink.isEnabled();
//	return AddToCartBtn.isEnabled();
//	AddToCartBtn.click();
}

public boolean ValidateEchodotLink()
{
	return EchoDotLink.isDisplayed();
//	return AddToCartLink.isEnabled();
//	AddToCartLink.click();
}

public boolean ValidateAddToCartBtn()
{
	return AddToCartBtn.isEnabled();
//	return AddToCartLink.isEnabled();
//	AddToCartLink.click();
}

public boolean ValidateProceedToBuyBtn()
{
	return ProceedToBuyBtn.isDisplayed();
//	return ProceedToBuyBtn.isEnabled();
//	ProceedToBuyBtn.click();
}

//public boolean ValidateDelvAddressBtn()
//{
//	return DelvAddressBtn.isDisplayed();
////	return DelvAddressBtn.isEnabled();
////	DelvAddressBtn.click();
//}
//
//public void ValidateEchoAddToCartBtn()
//{
//	EchoAddToCartBtn.click();
//	ProToBuyBtn.click();
}





