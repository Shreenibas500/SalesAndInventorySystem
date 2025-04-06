package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	WebDriver driver;
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
		//==============================================CUSTOMER ADD ICON AND ENTRIES IN BOTTOM OF TABLE======================================================
		//Customer Add icon
		@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']")
		private WebElement CustomerAdd_Icon;
		
		//Customer entries in bottom of Customer table
		@FindBy(xpath = "//div[@id='dataTable_info']")
		private WebElement CustomerEntries;
		
		public WebElement getCustomerAdd_Icon() {
			return CustomerAdd_Icon;
		}
		
		public WebElement getCustomerEntries() {
			return CustomerEntries;
		}
		
		
		/*==============================================ADD CUSTOMER MODAL INPUTS======================================================*/
		
		//Add Customer Modal inputs
		@FindBy(xpath = "//div[@id='customerModal']//input[@name='firstname']")
		private WebElement FirstName_Input;
		
		@FindBy(xpath = "//div[@id='customerModal']//input[@name='lastname']")
		private WebElement LastName_Input;
		
		@FindBy(xpath = "//div[@id='customerModal']//input[@name='phonenumber']")
		private WebElement PhoneNumber_Input;
		public WebElement getFirstName_Input() {
			return FirstName_Input;
		}

		public WebElement getLastName_Input() {
			return LastName_Input;
		}

		public WebElement getPhoneNumber_Input() {
			return PhoneNumber_Input;
		}
		
		
		/*==============================================ADD CUSTOMER MODAL INPUTS  close , save , reset ,AND Cancel button======================================================*/
		@FindBy(xpath = "//div[@id='customerModal']//button[@class='close']")
		private WebElement Modal_Close_Button;
		
		@FindBy(xpath = "//div[@id='customerModal']//button[@class='btn btn-success']")
		private WebElement Modal_Save_Button;
		
		@FindBy(xpath = "//div[@id='customerModal']//button[@class='btn btn-danger']")
		private WebElement Modal_Reset_Button;
		
		@FindBy(xpath = "//div[@id='customerModal']//button[@class='btn btn-secondary']")
		private WebElement Modal_Cancel_Button;
		
		public WebElement getModal_Close_Button() {
			return Modal_Close_Button;
		}

		public WebElement getModal_Save_Button() {
			return Modal_Save_Button;
		}

		public WebElement getModal_Reset_Button() {
			return Modal_Reset_Button;
		}

		public WebElement getModal_Cancel_Button() {
			return Modal_Cancel_Button;
		}
	

	/*=============================================CUSTOMER SERACH ,DETAILS BUTTON AND EDIT BUTTON =======================================================*/
	//Customer Search
	@FindBy(xpath = "//input[@type='search']")
	private WebElement CustomerSearch;
	//Customer Details
	@FindBy(xpath = "//table[@id='dataTable']//a[@class='btn btn-primary bg-gradient-primary']")
	private WebElement CustomerDetails_Row1;
	public WebElement getCustomerSearch() {
		return CustomerSearch;
	}

	public WebElement getCustomerDetails_Row1() {
		return CustomerDetails_Row1;
	}
	
	
	
	/*=========================================CUSTOMER DETAILS PAGE===========================================================*/
	
	@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[1]")
	private WebElement CustomerDetail_FullName;
	
	@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[2]")
	private WebElement CustomerDetail_Contact;
	
	@FindBy(xpath = "//a[@href='customer.php' and @type='button']")
	private WebElement CustomerDetails_BackButton;

	public WebElement getCustomerDetail_FullName() {
		return CustomerDetail_FullName;
	}

	public WebElement getCustomerDetail_Contact() {
		return CustomerDetail_Contact;
	}

	public WebElement getCustomerDetails_BackButton() {
		return CustomerDetails_BackButton;
	}
	
	

}
