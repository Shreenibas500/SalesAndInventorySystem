package Admin;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SSinventory.baseClassUtility.BaseClassUtility;
import com.SSinventory.genericUtility.JavaUtility;
import com.SSinventory.genericUtility.WebDriverUtility;
import com.SSinventory.objectRepositotyUtility.AccountsPage;
import com.SSinventory.objectRepositotyUtility.CustomerPage;
import com.SSinventory.objectRepositotyUtility.EmployeePage;
import com.SSinventory.objectRepositotyUtility.HomePage;
import com.SSinventory.objectRepositotyUtility.UserPage;

public class EmployeeTest extends BaseClassUtility{
		
		@Test
		public void addEmployeeTest() throws Throwable {
			JavaUtility ju = new JavaUtility();
			WebDriverUtility wu = new WebDriverUtility();
			HomePage hp = new HomePage(driver);
			UserPage up = new UserPage(driver);
			CustomerPage cp = new CustomerPage(driver);
			EmployeePage ep = new EmployeePage(driver);
			AccountsPage ap = new AccountsPage(driver);
			
			
			//1> Open the browser and Enter the URL 
			//2> Enter valid Username and Password and click on Submit button
			//3> Accept the popups
			
			//4> Navigate to "Employee"
			hp.getEmployeeLink().click();
			
			//5>  to "Empolyee"  by click on "+" image
			ep.getEmployeeAdd_Icon().click();
			int rn = ju.getRandomNumber(100);
			//> Add Empolyee details with mandatory fields and click on save button
			//> first name
			String firstName="Arun"+rn;
			//> last name
			String LastName="Sahu"+rn;
			//> Enter First Name:
			ep.getFirstName_Input().sendKeys(firstName);
			//> Enter Last Name:
			ep.getLastName_Input().sendKeys(LastName);
			//> Select Gender:\
			WebElement gender = ep.getSelectGender_Select();
			wu.selectByText(gender, "Male");
			//> Email:
			ep.getEmail_Input().sendKeys("arunsahu@"+rn);
			//> Phone Number:
			ep.getPhoneNumber_Input().sendKeys("12345"+rn);
			//> Select Job
			WebElement job = ep.getSelectJob_Select();
			wu.selectByText(job, "Cashier");;
			//> Hired Date
			String date = ju.getRequiredDateMMDDYYYY();
			WebElement hiredateInput = ep.getHiredDate_Input();
			String InputScript = "document.body.getElementsByClassName('form-control').hireddate.value="+"'"+date+"'";
			
			wu.executeJavascript(driver, hiredateInput, InputScript);
			
			//> Select Province
			WebElement Province = ep.getSelectProvince_Select();
			wu.selectByText(Province,"Abra");
			//>Select City / Municipality"
			WebElement City = ep.getSelectCity_Select();
			wu.selectByText(City,"Bucay");
			//> click on save button
			ep.getModal_Save_Button().click();
			
			//> Navigate to "Employee"
			String FullName = firstName+" "+LastName;
			System.out.println("Entered employee name is: "+FullName);

			//> Click and Enter the Employee name on search textfield
			ep.getEmployeeSearch().sendKeys(FullName);
			//> Click and clear the Search-textfield
			ep.getEmployeeSearch().clear();
			//> Click and Enter the FirstName  in search-textfield
			ep.getEmployeeSearch().sendKeys(firstName);
			//> Click and clear the Search-textfield
			ep.getEmployeeSearch().clear();
			//> Click and Enter the LastName  in search-textfield
			ep.getEmployeeSearch().sendKeys(LastName);
			//> Click on "details" on action section of the Employee 
			ep.getEmployeeDetails_Row1().click();
			//check all details validate
			
			//> Navigate to "Accounts"
			hp.getAccountsLink().click();
			//> Navigate to "Users Accounts"  by click on "+" image
			ap.getAddUser_Icon().click();
			
			
			//> Click on Select Employee dropdown  Select the Employee name
//			WebElement selectEmployee = ap.getEmployee_Select();
			
//			String employeeDetailsTest="James, Prince - Manager";
//            String InputScript2 = "document.body.getElementsByClassName('form-control').empid='Sahu60, Arun60 - Cashier'";
//			wu.executeJavascript(driver, selectEmployee, InputScript2);
			
	
			//> Set  Username and Password by entering the valid details and click on Save button.
			//> Click on Select Employee dropdown  Select the Employee name
			String employeeDetails = LastName+", " +firstName+" - Cashier";
			ap.getSelectEmployee(driver, employeeDetails);
			// Set  Username
			ap.getUserName_Input().sendKeys("arun");
			// Set  Password
			ap.getPassword_Input().sendKeys("arun");
			//click on save button
			ap.getModal_Save_Button().click();
			
			wu.ScrollToElement(driver, ap.getUserAccountDetails_Button(driver, FullName));
			
			ap.getUserAccountDetails_Button(driver, FullName).click();
			
			
			//> Click on profile icon for logout
			//> Click on Logout link
			//> Click on Logout Button
			//> Enter valid Username and Password and click on Submit button
			//> Accept the popups

			

			
		}

}
