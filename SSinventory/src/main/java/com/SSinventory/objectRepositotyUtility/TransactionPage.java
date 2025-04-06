package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage {
	public WebDriver driver;
	public TransactionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	//=======================================================================================================================
		//
		@FindBy(xpath = "//input[@type='search']")
		private WebElement Search_Input;
		
		
		@FindBy(xpath = "//table[@id='dataTable']//a[@class='btn btn-primary bg-gradient-primary']/../../td[text()='032652719']")
		private WebElement forGettingTransactionNumberDoneByCustomer_Text;
		
		
		public WebElement getSearch_Input() {
			return Search_Input;
		}

		public WebElement getForGettingTransactionNumberDoneByCustomer_Text() {
			return forGettingTransactionNumberDoneByCustomer_Text;
		}
		
		
		
		//=====================================================Transaction Invoice================================================================
		
		@FindBy(xpath = "(//div[@class='container-fluid']//div//h6[@class='font-weight-bold'])[1]")
		private WebElement CustomerNameOnInvoice_Text;
		
		public WebElement getCustomerNameOnInvoice_Text() {
			return CustomerNameOnInvoice_Text;
		}
		
		
		//========================================================BUSSINESS LOGIC===============================================================

		

		public void clickOnViewButtonOnRow_1(WebDriver driver, String name) {
			driver.findElement(By.xpath("(//table[@id='dataTable']//tbody//td[text()='"+name+"']/../td//a[@type='button'])[1]")).click();
		}
		
		public String getTransactionCodeFromRow_1(WebDriver driver, String name) {
			String transactionCode = driver.findElement(By.xpath("((//table[@id='dataTable']//tbody//td[text()='"+name+"']/../td//a[@type='button'])[1]/../..//td)[1]")).getText();
		return transactionCode;
		}
		
		
		
		
		
		
	
	
}
