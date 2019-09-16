package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class BuyPage extends TestBase{

	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[1]")
	public WebElement BuyAgainLink;
	
	@FindBy(xpath="//*[@id='a-autoid-3']/span/input")
	public WebElement AddToCartBtn;
	
	
	@FindBy(xpath="//*[@id=\"nav-cart-count\"]")
	public WebElement AddToCartLink;
	
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	public WebElement ProceedToBuyBtn;
	
	@FindBy(xpath="//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
	public WebElement DelvAddressBtn;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement EchoAddToCartBtn;
	
	@FindBy(xpath="//*[@id=\"hlb-ptc-btn-native\"]")
	WebElement ProToBuyBtn;


public BuyPage()
{
	PageFactory.initElements(driver, this);
}

public String ValidateBuyAgainLink()
{
	return BuyAgainLink.getText();
//	return BuyAgainLink.isDisplayed();
//	BuyAgainLink.click();
}

public boolean ValidateAddToCartBtn()
{
	return AddToCartBtn.isDisplayed();
//	return AddToCartBtn.isEnabled();
//	AddToCartBtn.click();
}

public boolean ValidateAddToCartLink()
{
	return AddToCartLink.isDisplayed();
//	return AddToCartLink.isEnabled();
//	AddToCartLink.click();
}

public boolean ValidateProceedToBuyBtn()
{
	return ProceedToBuyBtn.isDisplayed();
//	return ProceedToBuyBtn.isEnabled();
//	ProceedToBuyBtn.click();
}

public boolean ValidateDelvAddressBtn()
{
	return DelvAddressBtn.isDisplayed();
//	return DelvAddressBtn.isEnabled();
//	DelvAddressBtn.click();
}

public void ValidateEchoAddToCartBtn()
{
	EchoAddToCartBtn.click();
	ProToBuyBtn.click();
}
}




