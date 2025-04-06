package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	WebDriver driver;
	public EmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//==============================================EMPLOYEE ADD ICON AND ENTRIES IN BOTTOM OF TABLE======================================================
			//Employee Add icon
			@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']") //WORKING
			private WebElement EmployeeAdd_Icon;
			
			//Customer entries in bottom of Customer table
			@FindBy(xpath = "//div[@id='dataTable_info']")  //WORKING
			private WebElement EmployeeEntries;
			
			public WebElement getCustomerAdd_Icon() {
				return EmployeeAdd_Icon;
			}
			
			public WebElement getCustomerEntries() {
				return EmployeeEntries;
			}
			
			
			/*==============================================ADD EMPLOYEE MODAL INPUTS======================================================*/
			
			//Add Employee Modal inputs
			@FindBy(xpath = "//div[@id='employeeModal']//input[@name='firstname']") //WORKING
			private WebElement FirstName_Input;
			
			@FindBy(xpath = "//div[@id='employeeModal']//input[@name='lastname']") //WORKING
			private WebElement LastName_Input;
			
			@FindBy(xpath = "//div[@id='employeeModal']//select[@name='gender']") //select working 
			private WebElement SelectGender_Select;
			
			@FindBy(xpath = "//div[@id='employeeModal']//input[@name='email']") // working
			private WebElement Email_Input;
			
			@FindBy(xpath = "//div[@id='employeeModal']//input[@name='phonenumber']") //working
			private WebElement PhoneNumber_Input;
			
			@FindBy(xpath = "//div[@id='employeeModal']//select[@name='jobs']") //select working 
			private WebElement SelectJob_Select;
			
			@FindBy(xpath = "//div[@id='employeeModal']//input[@name='hireddate']") // working
			private WebElement HiredDate_Input;
			
			@FindBy(xpath = "//div[@id='employeeModal']//select[@name='province']") //select working 
			private WebElement SelectProvince_Select;
			
			@FindBy(xpath = "//div[@id='employeeModal']//select[@name='city']") //select working 
			private WebElement SelectCity_Select;
			
			
			
			
			
			public WebElement getFirstName_Input() {
				return FirstName_Input;
			}

			public WebElement getLastName_Input() {
				return LastName_Input;
			}

			public WebElement getPhoneNumber_Input() {
				return PhoneNumber_Input;
			}
			
			
			public WebElement getEmployeeAdd_Icon() {
				return EmployeeAdd_Icon;
			}

			public WebElement getEmployeeEntries() {
				return EmployeeEntries;
			}

			public WebElement getSelectGender_Select() {
				return SelectGender_Select;
			}

			public WebElement getEmail_Input() {
				return Email_Input;
			}

			public WebElement getSelectJob_Select() {
				return SelectJob_Select;
			}

			public WebElement getHiredDate_Input() {
				
				return HiredDate_Input;
			}

			public WebElement getSelectProvince_Select() {
				return SelectProvince_Select;
			}

			public WebElement getSelectCity_Select() {
				return SelectCity_Select;
			}


			/*==============================================ADD EMPLOYEE MODAL INPUTS  close , save , reset ,AND Cancel button======================================================*/
			@FindBy(xpath = "//div[@id='employeeModal']//button[@class='close']")
			private WebElement Modal_Close_Button;
			
			@FindBy(xpath = "//div[@id='employeeModal']//button[@class='btn btn-success']")
			private WebElement Modal_Save_Button;
			
			@FindBy(xpath = "//div[@id='employeeModal']//button[@class='btn btn-danger']")
			private WebElement Modal_Reset_Button;
			
			@FindBy(xpath = "//div[@id='employeeModal']//button[@class='btn btn-secondary']")
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
		

		/*=============================================EMPLOYEE SERACH ,DETAILS BUTTON AND EDIT BUTTON =======================================================*/
		//Customer Search
		@FindBy(xpath = "//input[@type='search']")
		private WebElement EmployeeSearch;
		//Customer Details
		@FindBy(xpath = "//table[@id='dataTable']//a[@class='btn btn-primary bg-gradient-primary']")
		private WebElement EmployeeDetails_Row1;
		
		public WebElement getEmployeeSearch() {
			return EmployeeSearch;
		}

		public WebElement getEmployeeDetails_Row1() {
			return EmployeeDetails_Row1;
		}
		
		
		
		/*=========================================EMPLOYEE DETAILS PAGE===========================================================*/
		
		@FindBy(xpath = "//a[@href='employee.php' and @type='button']")
		private WebElement EmployeeDetails_BackButton;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[1]")
		private WebElement EmployeeDetail_FullName;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[2]")
		private WebElement EmployeeDetail_Gender;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[3]")
		private WebElement EmployeeDetail_Email;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[4]")
		private WebElement EmployeeDetail_Contact;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[5]")
		private WebElement EmployeeDetails_Role;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[6]")
		private WebElement EmployeeDetails_HiredDate;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[7]")
		private WebElement EmployeeDetails_Address;
		
		

		public WebElement getEmployeeDetail_FullName() {
			return EmployeeDetail_FullName;
		}

		public WebElement getEmployeeDetail_Contact() {
			return EmployeeDetail_Contact;
		}

		public WebElement getEmployeeDetails_BackButton() {
			return EmployeeDetails_BackButton;
		}

		public WebElement getEmployeeDetail_Gender() {
			return EmployeeDetail_Gender;
		}

		public WebElement getEmployeeDetail_Email() {
			return EmployeeDetail_Email;
		}

		public WebElement getEmployeeDetails_Role() {
			return EmployeeDetails_Role;
		}

		public WebElement getEmployeeDetails_HiredDate() {
			return EmployeeDetails_HiredDate;
		}

		public WebElement getEmployeeDetails_Address() {
			return EmployeeDetails_Address;
		}

		
		

}
