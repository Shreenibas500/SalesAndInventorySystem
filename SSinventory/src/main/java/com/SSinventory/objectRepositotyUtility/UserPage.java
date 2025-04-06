package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SSinventory.genericUtility.WebDriverUtility;

public class UserPage {
	
	WebDriver driver;
	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		WebDriverUtility wu = new WebDriverUtility();
	//====================================================================PRODUCT CATEGORY LINK====================================================================================	
	}
	@FindBy(xpath = "//a[text()='Keyboard']")
	private WebElement Kryboard;
	
	@FindBy(xpath = "//a[text()='Mouse']")
	private WebElement Mouse;
	
	@FindBy(xpath = "//a[text()='Headset']")
	private WebElement Headset;
	
	@FindBy(xpath = "//a[text()='CPU']")
	private WebElement CPU;
	
	@FindBy(xpath = "//a[text()='Monitor']")
	private WebElement Monitor;
	
	@FindBy(xpath = "//a[text()='Motherboard']")
	private WebElement Motherboard;
	
	@FindBy(xpath = "//a[text()='Processor']")
	private WebElement Processor;
	
	@FindBy(xpath = "//a[text()='Power Supply']")
	private WebElement PowerSupply;
	
	@FindBy(xpath = "//a[text()='Others']")
	private WebElement Others;
	
	
	public WebElement getKryboard() {
		return Kryboard;
	}

	public WebElement getMouse() {
		return Mouse;
	}

	public WebElement getHeadset() {
		return Headset;
	}

	public WebElement getCPU() {
		return CPU;
	}

	public WebElement getMonitor() {
		return Monitor;
	}

	public WebElement getMotherboard() {
		return Motherboard;
	}

	public WebElement getProcessor() {
		return Processor;
	}

	public WebElement getPowerSupply() {
		return PowerSupply;
	}

	public WebElement getOthers() {
		return Others;
	}
	
	
	
	//=========================================================================== Keyboard PRODUCTS =================================================================================
	
	@FindBy(xpath = "//div[@class='card shadow mb-0']//form[@action='pos.php?action=add&id=25111']//input[@name='addpos']")
	private WebElement KeyBooardProducts_1;
	
	public WebElement getKeyBooardProducts_1() { 
		return KeyBooardProducts_1;
		
	}

	

	//=========================================================================== POS SECTION  =================================================================================
	
	
	@FindBy(xpath = "//select[@name='customer']")
	private WebElement SelectCustomerDropDown;
	
	@FindBy(xpath = "//option[text()='Select Customer']")
	private WebElement CustomerList;
	
	
	@FindBy(xpath = "//button[text()='SUBMIT']")
	private WebElement SUBMIT_Button;
	
	
	
	
	
	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}
	
	public WebElement getCustomerList() {
		return CustomerList;
	}
	
	public WebElement getSUBMIT_Button() {
		return SUBMIT_Button;
	}
	
	//================================================== POS SUMMURY ===========================================================================
	
	@FindBy(xpath = "//input[@placeholder='ENTER CASH']")
	private WebElement SUMMARY_ENTERCASH_Input;
	
	@FindBy(xpath = "//div[@id='posMODAL']//div//h3[@class='font-weight-bold py-3 bg-light']")
	private WebElement SUMMARY_GRANDTOTAL_Text;
	
	@FindBy(xpath = "//button[text()='PROCEED TO PAYMENT']")
	private WebElement SUMMARY_ProceedToPayment_Button;
	

	public WebElement getSUMMARY_ENTERCASH_Input() {
		return SUMMARY_ENTERCASH_Input;
	}

	public WebElement getSUMMARY_ProceedToPayment_Button() {
		return SUMMARY_ProceedToPayment_Button;
	}
	
	public WebElement getSUMMARY_GRANDTOTAL_Text() {
		return SUMMARY_GRANDTOTAL_Text;
	}
	
	
	//===================================================FOR  PROFILE, SETTING, AND LOGOUT ===========================================================================
	

	
	
	@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
	private WebElement Profile_Icon;
	
	@FindBy(xpath = "//button//i[@class='fas fa-user fa-sm fa-fw mr-2 text-gray-400']/..")
	private WebElement ProfileDetails;
	
	@FindBy(xpath = "//a[@data-target='#logoutModal']")
	private WebElement Logout_Link;
	
	@FindBy(xpath ="(//a[text()='Logout'])[1]")
	private WebElement Logout_Btn;
	@FindBy(xpath = "//div[@id='logoutModal' and @class='modal fade show']//a/..//button[text()='Cancel']")
	private WebElement Cancel_Btn;
	
	@FindBy(xpath = "//div[@id='overlay']")
	private WebElement ProfileDetailsMessage;

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
	
	public WebElement getProfileDetailsMessage() {
		return ProfileDetailsMessage;
	}
	
	
	
	
	//==================================================User page BUSINESS LOGICS===========================================================================
	
		

				//user  page logout cancel
			    public void getLogoutCancel() {
			    getProfile_Icon().click();
				getLogout_Link().click();
				getCancel_Btn();
				
			}
			    

			public void getLogoutOk() {
				getProfile_Icon().click();
				getLogout_Link().click();
				getLogout_Btn().click();
				
			}
			
			public void getProfileMessagePage() {
				getProfile_Icon().click();
				getProfileDetails().click();
			}
			
			public String getCustomerByNameFromDropDoen(WebDriver driver, String name) {
				SelectCustomerDropDown.click();
				driver.findElement(By.xpath("//option[text()='"+name+"']")).click();
				return name;
				
			}
	
	
	
	
	

}
