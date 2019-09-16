package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span[1]")
	WebElement HomePageTitle;
	
	@FindBy(xpath="//*[@id=\"nav-link-prime\"]")
	WebElement PrimeMember;
	
	@FindBy(xpath="//*[@id=\"icp-nav-flyout\"]")
	WebElement LanguagePreference;
	
	@FindBy(xpath="//*[@id=\"glow-ingress-line2\"]")
	WebElement DeliveryLocation;
	
//	@FindBy(id="//*[@id=\"searchDropdownBox\"]")
	@FindBy(id="searchDropdownBox")
	WebElement SearhAllOption;
	
	@FindBy(xpath="//*[@id=\"nav-orders\"]")
	WebElement OrderLink;
	
	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]/span[1]")
	WebElement CategorySelection;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[1]/span")
	WebElement AlexaCat;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[1]/div[1]/div/a[1]/span[1]")
	WebElement Echodotselect;
	
//	@FindBy(xpath="//*[@id=\"yourOrdersContent\"]/div[3]/div[1]/h1")
//	WebElement OrderPageTitle;


public HomePage()
{
	PageFactory.initElements(driver, this);
}

public String ValidateHomePageTitle()
{
	return HomePageTitle.getText();
}

public boolean ValidatePrimeMembership()
{
	return PrimeMember.isDisplayed();
}

public boolean ValidateLanguagePreference()
{
	return LanguagePreference.isDisplayed();
}

public String ValildateDeliveryLocation()
{
	return DeliveryLocation.getText();
}

public boolean ValidateSearchAllOption()
{
	return SearhAllOption.isEnabled();
}

public boolean ValidateOrderLink()
{
	return OrderLink.isEnabled();
//	return new OrdersPage(); 
}

public OrdersPage ValidateOrderPageTitle()
{
	OrderLink.click();
	return new OrdersPage(); 
//	OrderPageTitle.isDisplayed();
}

public void ShopAllCategoryLink()
{
	Actions action = new Actions(driver);
	action.moveToElement(CategorySelection).build().perform();
	action.moveToElement(AlexaCat).build().perform();
	Echodotselect.click();
}

}










