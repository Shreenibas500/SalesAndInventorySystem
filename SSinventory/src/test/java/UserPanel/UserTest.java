package UserPanel;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SSinventory.baseClassUtility.BaseClassUserPanel;
import com.SSinventory.genericUtility.WebDriverUtility;
import com.SSinventory.objectRepositotyUtility.HomePage;
import com.SSinventory.objectRepositotyUtility.LoginPage;
import com.SSinventory.objectRepositotyUtility.TransactionPage;
import com.SSinventory.objectRepositotyUtility.UserPage;

public class UserTest extends BaseClassUserPanel{
	WebDriverUtility wu = new WebDriverUtility();
	LoginPage lp = new LoginPage(driver);
	
	
	// User Login test with 10 set of data through DataProvider
	@Test(dataProvider = "UserLoginData")
	public void UserLogInTest(String username, String password) throws Throwable {
		//object creation of POM 
		LoginPage lp = new LoginPage(driver);
		UserPage up = new UserPage(driver);
		// Use parameters from DataProvider (Which is mention Below)
		lp.getUsername_Edit().sendKeys(username);
		lp.getPassword_Edit().sendKeys(password);
		lp.getLogin_Btn().click();
		wu.waitForAlert(driver);
		
		up.getProfileMessagePage();
		boolean status = up.getProfileDetailsMessage().isDisplayed();
		if(status==true) {
			up.getProfileDetailsMessage().click();
			up.getLogoutOk();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
			up.getProfileDetailsMessage().click();
			up.getLogoutOk();
		}
		
	}
	
//=========================================================DataProvideer===========================================================
	    @DataProvider(name = "UserLoginData")
	    public static Object[][] getLoginData() {
	        return new Object[][] {
	        	
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            { "Sahu16", "user" },
	            
	        };
	    }
//=================================================================================================================================

	    @Test
	    public void userCreatetransactionTest() throws Throwable {
	    	//object creation of POM 
			LoginPage lp = new LoginPage(driver);
			UserPage up = new UserPage(driver);
			HomePage hp = new HomePage(driver);
			TransactionPage tp = new TransactionPage(driver);
			// Use parameters from DataProvider (Which is mention Below)
			lp.getUsername_Edit().sendKeys( "Sahu16");
			lp.getPassword_Edit().sendKeys("user");
			lp.getLogin_Btn().click();
			wu.waitForAlert(driver);
			up.getKryboard().click();
			up.getKeyBooardProducts_1().click();
			up.getSelectCustomerDropDown().click();
			up.getCustomerByNameFromDropDoen(driver, "Shreenibas Samal");
			wu.ScrollToElement(driver, up.getSUBMIT_Button());
			up.getSUBMIT_Button().click();
			String grandTotal = up.getSUMMARY_GRANDTOTAL_Text().getText();
			up.getSUMMARY_ENTERCASH_Input().sendKeys(grandTotal);
			up.getSUMMARY_ProceedToPayment_Button().click();
			wu.waitForAlert(driver);
			up.getLogoutOk();
			
			Thread.sleep(3000);
			
			lp.loginToAdminPanel(driver);
			wu.waitForAlert(driver);
			hp.getTransactionLink().click();
			tp.getSearch_Input().sendKeys("Shreenibas Samal");
			String TransactionCode = tp.getTransactionCodeFromRow_1(driver, "Shreenibas Samal").toString();
			tp.clickOnViewButtonOnRow_1(driver, "Shreenibas Samal");
			
			String CustomerNameOnInvoice = tp.getCustomerNameOnInvoice_Text().getText();
			
			Assert.assertEquals(CustomerNameOnInvoice, "Shreenibas Samal", "Test Passed");
			
			Thread.sleep(3000);
			
			
			
			
	    	
	    }
	    
	    
}
