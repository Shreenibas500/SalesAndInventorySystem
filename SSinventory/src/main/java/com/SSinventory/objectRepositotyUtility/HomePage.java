package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SSinventory.genericUtility.WebDriverUtility;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//===================================================FOR POS LINK====================================================================
	//for POS module
	@FindBy(xpath = "//span[text()='POS']")
	private WebElement PosLink;
	
	public WebElement getPosLink() {
		return PosLink;
	}
	
	/*=============================================HOME PAGE LINK=======================================================*/
	@FindBy(xpath = "//span[text()='Home']")
	private WebElement HomePage_Link;
	
	public WebElement getHomePage_Link() {
		return HomePage_Link;
	}
	
	
	//===================================================FOR  PROFILE, SETTING, AND LOGOUT ===========================================================================
	
			@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
			private WebElement Profile_Icon;
			
			@FindBy(xpath = "//button//i[@class='fas fa-user fa-sm fa-fw mr-2 text-gray-400']/..")
			private WebElement ProfileDetails;
			
			@FindBy(xpath = "//a[@data-target='#logoutModal']")
			private WebElement Logout_Link;
			
			@FindBy(xpath = "//div[@id='logoutModal' and @class='modal fade show']//div//a[text()='Logout']")
			private WebElement Logout_Btn;
			
			@FindBy(xpath = "//div[@id='logoutModal' and @class='modal fade show']//a/..//button[text()='Cancel']")
			private WebElement Cancel_Btn;

			public WebElement getProfile_Icon() {
				return Profile_Icon;
				
				
			}
			public WebElement getProfileDetails() {
				return ProfileDetails;
			}
			public WebElement getLogout_Link() {
				return Logout_Link;
			}
			public WebElement getLogout_Btn() {
				return Logout_Btn;
			}
			public WebElement getCancel_Btn() {
				return Cancel_Btn;
			}
	

	//===================================================FOR DASHBOARD RECORDS=========================================================================
	//for Customer module
	@FindBy(xpath = "//div[@class='card border-left-primary shadow h-100 py-2']//div//div//div[@class='h6 mb-0 font-weight-bold text-gray-800']")
	private WebElement CustomersRecords;
	
	//for Employees module
	@FindBy(xpath = "//div[@class='card border-left-success shadow h-100 py-2']//div//div//div[@class='h6 mb-0 font-weight-bold text-gray-800']")
	private WebElement EmployeesRecords;
	
	//for Product module
	@FindBy(xpath = "//div[@class='card border-left-info shadow h-100 py-2']//div//div//div[@class='h6 mb-0 mr-3 font-weight-bold text-gray-800']")
	private WebElement ProductRecords;
		
	//for  Supplier module
	@FindBy(xpath = "//div[@class='card border-left-warning shadow h-100 py-2']//div//div//div[@class='h6 mb-0 font-weight-bold text-gray-800']")
	private WebElement SupplierRecords;
		
	//for RegisteredAccount module
	@FindBy(xpath = "//div[@class='card border-left-danger shadow h-100 py-2']//div//div//div[@class='h6 mb-0 font-weight-bold text-gray-800']")
	private WebElement RegisteredAccountRecords;
	
	//for RecentProducts module
		@FindBy(xpath = "//div[@class='list-group']")
		private WebElement RecentProducts;
	
	//for ViewAllProduct module
	@FindBy(xpath = "//a[text()='View All Products']")
	private WebElement ViewAllProduct;
		
		
	public WebElement getCustomersRecords() {
		return CustomersRecords;
	}
		
		public WebElement getEmployeesRecords() {
		return EmployeesRecords;
	}

	public WebElement getProductRecords() {
		return ProductRecords;
	}

	public WebElement getSupplierRecords() {
		return SupplierRecords;
	}

	public WebElement getRegisteredAccountRecords() {
		return RegisteredAccountRecords;
	}
	
	public WebElement getRecentProducts() {
		return RecentProducts;
	}

	public WebElement getViewAllProduct() {
		return ViewAllProduct;
	}

		
	//===================================================FOR ALL MODULE LINKS=========================================================================
	
	
	@FindBy(xpath = "//span[text()='Customer']")
	private WebElement CustomerLink;
	
	
	//For Empoloyee Module
	@FindBy(xpath = "//span[text()='Employee']")
	private WebElement EmployeeLink;
	
	//For Product Module
	@FindBy(xpath = "//span[text()='Product']")
	private WebElement ProductLink;
		
	//For Inventory Module
	@FindBy(xpath = "//span[text()='Inventory']")
	private WebElement InventoryLink;
	
	//For Transaction Module
	@FindBy(xpath = "//span[text()='Transaction']")
	private WebElement TransactionLink;
	
	//For Supplier Module
	@FindBy(xpath = "//span[text()='Supplier']")
	private WebElement SupplierLink;
		
	//For Accounts Module
	@FindBy(xpath = "//span[text()='Accounts']")
	private WebElement AccountsLink;
	
	public WebElement getCustomerLink() {
		return CustomerLink;
	}
	
	public WebElement getEmployeeLink() {
		return EmployeeLink;
	}
	public WebElement getProductLink() {
		return ProductLink;
	}
	public WebElement getInventoryLink() {
		return InventoryLink;
	}
	public WebElement getTransactionLink() {
		return TransactionLink;
	}
	public WebElement getSupplierLink() {
		return SupplierLink;
	}
	public WebElement getAccountsLink() {
		return AccountsLink;
	}
	

	
		
		
		//==================================================BUSINESS LOGICS LOGOUT and LOGIN===========================================================================
		
		//home page logout OK
		public void getlogoutOK() {
			WebDriverUtility wu = new WebDriverUtility();
		getProfile_Icon().click();
		getLogout_Link().click();
		getLogout_Btn().click();
		wu.acceptAlert(driver);
		}
		//home page logout cancel
		public void getlogoutCancel() {
			getCancel_Btn();
		}
		
		
	
	
	
	
	


}
