package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SSinventory.genericUtility.WebDriverUtility;

public class LoginPage {
	//global object creation
	WebDriver driver;
	WebDriverUtility wu = new WebDriverUtility();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
		
	}
    public void quiteServer(WebDriver driver) {
    	driver.quit();
 
	}
	


	@FindBy(xpath = "//input[@name='user']")
	private WebElement username_Edit;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_Edit;

	@FindBy(xpath = "//button[@name='btnlogin']")
	private WebElement login_Btn;
	
	//for logout
	@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
	private WebElement profile_Icon;
	@FindBy(xpath = "//a[@data-target='#logoutModal']")
	private WebElement logout_Btn;
	//for logout getters method
	public WebElement getProfile_Icon() {
		return profile_Icon;
	}
	public WebElement getLogout_Btn() {
		return logout_Btn;
	}
	
	public void logout() {
		getProfile_Icon().click();
		getLogout_Btn().click();
//		wb.switchToAlertAndAccept(driver);
	}
	


	
	
	
	


	public WebElement getUsername_Edit() {
		return username_Edit;
	}

	public WebElement getPassword_Edit() {
		return password_Edit;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	
	//=================================================LOGIN AND LOGOUT REUSABLE LOGIC============================================================
	public void loginToAdminPanel(WebDriver driver) {
		driver.get("http://49.249.28.218:8081/AppServer/Sales_And_Inventory_System/pages/login.php");
		username_Edit.sendKeys("unguardable");
		password_Edit.sendKeys("admin");
		login_Btn.click();
	}	
	
	public void loginToUserPanel(WebDriver driver, String username, String paswword) {
		username_Edit.sendKeys(username);
		password_Edit.sendKeys(paswword);
		login_Btn.click();
	}	
	
	
	
	
		
	
	
	
}
