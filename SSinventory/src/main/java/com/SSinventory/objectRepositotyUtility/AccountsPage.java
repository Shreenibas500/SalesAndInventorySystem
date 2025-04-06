package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountsPage {
	WebDriver driver;
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
		
		public WebDriver getDriver() {
			return driver;
		}
		//=============================================================================================================================
		@FindBy(xpath="//a[@data-target='#supplierModal']")
		private WebElement AddUser_Icon;
		
		public WebElement getAddUser_Icon() {
			return AddUser_Icon;
		}
		/*==============================================ADD USER ACCOUNT MODAL INPUTS======================================================*/
		@FindBy(name="empid")
		private WebElement Employee_Select;
		
		@FindBy(xpath="(//input[@name='username'])[2]")
		private WebElement UserName_Input;
		
		@FindBy(xpath="(//input[@name='password'])[2]")
		private WebElement Password_Input;
		
		
		public WebElement getEmployee_Select() {
			return Employee_Select;
		}

		public void setEmployee_Select(WebElement employee_Select) {
			Employee_Select = employee_Select;
		}

		public WebElement getUserName_Input() {
			return UserName_Input;
		}

		public WebElement getPassword_Input() {
			return Password_Input;
		}
		
		
		/*==============================================ADD USER ACCOUNT MODAL INPUTS  close , save , reset ,AND Cancel button======================================================*/
		@FindBy(xpath = "//div[@id='supplierModal']//button[@class='close']")
		private WebElement Modal_Close_Button;
		
		@FindBy(xpath = "//div[@id='supplierModal']//button[@class='btn btn-success']")
		private WebElement Modal_Save_Button;
		
		@FindBy(xpath = "//div[@id='supplierModal']//button[@class='btn btn-danger']")
		private WebElement Modal_Reset_Button;
		
		@FindBy(xpath = "//div[@id='supplierModal']//button[@class='btn btn-secondary']")
		private WebElement Modal_Cancel_Button;
		
		
		
		

		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}

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

		/*============================================== BUSSINESS LOGICS OF ACCOUNTS PAGE ======================================================*/
		public WebElement getUserAccountDetails_Button(WebDriver driver,String name) {
			 WebElement detailButton = driver.findElement(By.xpath("//a[@class='btn btn-primary bg-gradient-primary']/../../..//tr//td[text()='"+name+"']/..//a[@class='btn btn-primary bg-gradient-primary']"));
			
			return detailButton;
		}
		
		public WebElement getUserAccountEditLink_Button(WebDriver driver,String name) {
			 WebElement detailButton = driver.findElement(By.xpath("//a[@class='btn btn-primary bg-gradient-primary']/../../..//tr//td[text()='"+name+"']/..//div/a[@class='btn btn-primary bg-gradient-primary dropdown no-arrow']"));
			
			return detailButton;
		}
		

		public WebElement getUserAccountEditPage_Button(WebDriver driver,String name) {
			 WebElement detailButton = driver.findElement(By.xpath("//a[@class='btn btn-primary bg-gradient-primary']/../../..//tr//td[text()='"+name+"']/..//div/ul[@class='dropdown-menu text-center show']"));
			
			return detailButton;
		}
		
		public WebElement getSelectEmployee(WebDriver driver,String EmployeeDetails) {
			 driver.findElement(By.xpath("//select[@name='empid']/option[text()='"+EmployeeDetails+"']")).click();
			
			return null;
		}
	
	

}
