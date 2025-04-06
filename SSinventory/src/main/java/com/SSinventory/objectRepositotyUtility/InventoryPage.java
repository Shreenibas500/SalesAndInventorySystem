package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	/*=============================================INVENTORY Code SERACH ,DETAILS BUTTON AND EDIT BUTTON =======================================================*/
	//Inventory Search
	@FindBy(xpath = "//input[@type='search']")
	private WebElement InventorySearch;
	//Inventory Details
	@FindBy(xpath = "(//table[@id='dataTable']//a[@class='btn btn-primary bg-gradient-primary'])[1]")
	private WebElement InventoryView_Row1;
	
	//Inventory entries in bottom of Inventory table list
	@FindBy(xpath = "//div[@id='dataTable_info']")
	private WebElement InventoryEntries;

	public WebElement getInventorySearch() {
		return InventorySearch;
	}

	public WebElement getInventoryView_Row1() {
		return InventoryView_Row1;
	}

	public WebElement getInventoryEntries() {
		return InventoryEntries;
	}
	
	
	
	
	
	
	
	

}
