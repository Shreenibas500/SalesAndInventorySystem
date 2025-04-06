package Admin;

import org.testng.annotations.Test;

import com.SSinventory.baseClassUtility.BaseClassUtility;
import com.SSinventory.genericUtility.JavaUtility;
import com.SSinventory.genericUtility.WebDriverUtility;
import com.SSinventory.objectRepositotyUtility.AccountsPage;
import com.SSinventory.objectRepositotyUtility.CustomerPage;
import com.SSinventory.objectRepositotyUtility.EmployeePage;
import com.SSinventory.objectRepositotyUtility.HomePage;
import com.SSinventory.objectRepositotyUtility.LoginPage;
import com.SSinventory.objectRepositotyUtility.UserPage;

public class AccountsTest extends BaseClassUtility{
	
	@Test
	public void addAccountTest() throws Throwable {
		JavaUtility ju = new JavaUtility();
		WebDriverUtility wu = new WebDriverUtility();
		HomePage hp = new HomePage(driver);
		UserPage up = new UserPage(driver);
		CustomerPage cp = new CustomerPage(driver);
		EmployeePage ep = new EmployeePage(driver);
		AccountsPage ap = new AccountsPage(driver);
		LoginPage lp = new LoginPage(driver);
		
		
		//> Navigate to "Accounts"
		hp.getAccountsLink().click();
		//> Navigate to "Users Accounts"  by click on "+" image
		ap.getAddUser_Icon().click();
		//> Click on Select Employee dropdown  Select the Employee name
		
		String firstName = "Arun60";
		String LastName = "Sahu60";
		String FullName =firstName+" "+LastName;
		
		String empDetails = "Sahu19, Arun19 - Cashier";
		
		ap.getSelectEmployee(driver, empDetails);
		
		//> Set  Username and Password by entering the valid details and click on Save button.
		String username = "Sahu19";
		String password = "arun";
		
		ap.getUserName_Input().sendKeys(username);
		ap.getPassword_Input().sendKeys(password);
		ap.getModal_Save_Button().click();
		
		//get account details in table if it is added
		
		wu.ScrollToElement(driver, ap.getUserAccountDetails_Button(driver, FullName));
		//click on details button
		ap.getUserAccountDetails_Button(driver, FullName).click();
		//compare the the details
		
		//navigate to back panel
		wu.navigationBack(driver);
		
		//logout from Account page
		hp.getlogoutOK();
		
		//Login to UserPanel with added employee credential
		String username1 = "arun123";
		String password1 = "arun";
		lp.getUsername_Edit().sendKeys(username1);
		lp.getPassword_Edit().sendKeys(password1);
		lp.getLogin_Btn();
		
		up.getProfile_Icon().click();
		up.getProfileDetails().click();
		up.getProfileDetailsMessage().click();
		
		up.getLogoutOk();
		
		
	}

}
