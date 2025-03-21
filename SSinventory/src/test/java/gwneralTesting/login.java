package gwneralTesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.SSinventory.genericUtility.WebDriverUtility;
import com.SSinventory.objectRepositotyUtility.LoginPage;

public class login {

	public static void main(String[] args) throws Throwable {
		WebDriverUtility wu = WebDriverUtility();
		ChromeOptions option = new ChromeOptions();

		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://49.249.28.218:8081/AppServer/Sales_And_Inventory_System/pages/login.php");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp("unguardable", "admin");
		wu.switchToAlertAndAccept(driver);
		
		
		
		
	Thread.sleep(3000);
		driver.quit();
	}

	private static WebDriverUtility WebDriverUtility() {
		// TODO Auto-generated method stub
		return null;
	}


}
