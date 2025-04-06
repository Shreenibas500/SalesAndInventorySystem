package Admin;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SSinventory.baseClassUtility.*;
import com.SSinventory.genericUtility.JavaUtility;
import com.SSinventory.genericUtility.WebDriverUtility;
import com.SSinventory.objectRepositotyUtility.CustomerPage;
import com.SSinventory.objectRepositotyUtility.HomePage;
import com.SSinventory.objectRepositotyUtility.UserPage;

@Listeners(com.SSinventory.ListeneresUtility.ListenerImplementation.class)

public class CustomerTest extends BaseClassUtility{
	@Test
	public void addCustomerTest() {
		
		JavaUtility ju = new JavaUtility();
		WebDriverUtility wu = new WebDriverUtility();
		HomePage hp = new HomePage(driver);
		CustomerPage cp = new CustomerPage(driver);
		UserPage up = new UserPage(driver);
		/*
		//1> Open the browser and Enter the URL 
		//2> Enter valid Username and Password and click on Submit button
		//3> Accept the popups
		*/
		
		//4> Capture the Customer Records (for verification)
		String BeforeAddCustomerRecords = hp.getCustomersRecords().getText();
		System.out.println("The Customer recors in hompe page is: "+BeforeAddCustomerRecords);
		
		
		//5> Navigate to "Customer Page"
		hp.getCustomerLink().click();
		String CE_BeforeAddCustomer =cp.getCustomerEntries().getText();
		System.out.println("The Customer entries Before Added is: "+CE_BeforeAddCustomer);
		
		//6> Navigate to "Add new Customer"  by click on "+" image
		cp.getCustomerAdd_Icon().click();
		
		//7> Add Customer  with mandatory fields and click on save button
		//=====================================================================
		int rn = ju.getRandomNumber(100);
		//> first name
		String firstName="Shreenibas"+rn;
		//> last name
		String LastName="Samal"+rn;
		//> phone number
		String InputPhoneNumber="8249469"+rn;
		//> Full Name
		String InputName=firstName+" "+LastName;//add space for disect
		
		System.out.println("Entered Name is :"+InputName);
		System.out.println("Entered PhoneNumber is :"+InputPhoneNumber);
		//====================================================================
		
		
		//7> Enter first name
		cp.getFirstName_Input().sendKeys(firstName);
		//8> Enter last name
		cp.getLastName_Input().sendKeys(LastName);
		//9> Enter phone number
		cp.getPhoneNumber_Input().sendKeys(InputPhoneNumber);
		//10> Click on Save Button
		cp.getModal_Save_Button().click();
		//11> get the data Customer entries on bottom of the table
		String CE_AfterAddCustomer = cp.getCustomerEntries().getText();
		
		//========================================================================================
		System.out.println("The Customer entries After Added is: "+CE_AfterAddCustomer);
		//========================================================================================
		
		//12> Click and Enter the Customer name on search textfield
		cp.getCustomerSearch().sendKeys(InputName);
		//13> Click on Details searched Customer
		cp.getCustomerDetails_Row1().click();
		//14> Capture the details from Customer Details
		String Name = cp.getCustomerDetail_FullName().getText();
		String PhoneNumber = cp.getCustomerDetail_Contact().getText();
		
		//=========================================================================================
		System.out.println("Name in Customer details"+Name);
		System.out.println("PhoneNumber in Customer Details"+PhoneNumber);
		//=========================================================================================
		
		//15> Navigation to Homepage and capture Customer records
		hp.getHomePage_Link().click();
		//16> Capture the Customer Records (for verification)
		String AfterAddCustomerRecords = hp.getCustomersRecords().getText();
		
		//===============================================================================================
		System.out.println("The Customer recors After Added in hompe page is: "+AfterAddCustomerRecords);
		//===============================================================================================
		
		//17> Navigation to  Customer page
		hp.getCustomerLink().click();
		
		wu.waitForElementPresent(driver, 10, cp.getCustomerSearch());
		
		//Assersion for value compoarision
		
		
		//18> Click and Enter the PhoneNumber  in search-textfield
		cp.getCustomerSearch().sendKeys(InputPhoneNumber);
		//19> Click and clear the Search-textfield
		cp.getCustomerSearch().clear();
	
		//20> Click and Enter the FirstName  in search-textfield
		cp.getCustomerSearch().sendKeys(firstName);
		//21> Click and clear the Search-textfield
		cp.getCustomerSearch().clear();
		
		//22> Click and Enter the LastName  in search-textfield
		cp.getCustomerSearch().sendKeys(LastName);
		//23> Click and clear the Search-textfield
		cp.getCustomerSearch().clear();
		
		//24> Click on "details" on action section of the customer 
		cp.getCustomerDetails_Row1().click();
		
		//25> Click on "POS" link
		hp.getPosLink().click();
		
		
		//26> click on "Headset" Category 
		up.getKryboard().click();
		//27> Click on "Add" button  for any product
		up.getKeyBooardProducts_1().click();
		//28> Click on "Select Customer" dropdown 
		up.getSelectCustomerDropDown().click();
		//compare add customer name on userpanel page
		
		// Logout from User panel

	}

}
