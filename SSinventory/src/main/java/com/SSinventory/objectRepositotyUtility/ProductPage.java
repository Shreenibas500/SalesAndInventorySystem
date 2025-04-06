package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//==============================================PRODUCT ADD ICON AND ENTRIES IN BOTTOM OF TABLE======================================================
			//Product Add icon
			@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']")
			private WebElement ProductAdd_Icon;
			
			//Customer entries in bottom of Customer table
			@FindBy(xpath = "//div[@id='dataTable_info']")
			private WebElement ProductEntries;
			
			public WebElement getProductAdd_Icon() {
				return ProductAdd_Icon;
			}
			
			public WebElement getProductEntries() {
				return ProductEntries;
			}
			
			
			/*==============================================ADD PRODUCT MODAL INPUTS======================================================*/
			
			//Add Product Modal inputs
			@FindBy(xpath = "//div[@id='aModal']//input[@name='prodcode']")
			private WebElement ProductCode_Input;
			
			@FindBy(xpath = "//div[@id='aModal']//input[@name='name']")
			private WebElement Name_Input;
			
			@FindBy(xpath = "//div[@id='aModal']//textarea[@name='description']")
			private WebElement Description_Input;
			
			@FindBy(xpath = "//div[@id='aModal']//input[@name='quantity']")
			private WebElement Quantity_Input;
			
			@FindBy(xpath = "//div[@id='aModal']//input[@name='onhand']")
			private WebElement OnHand_Input;
			
			@FindBy(xpath = "//div[@id='aModal']//input[@name='price']")
			private WebElement Price_Input;
			
			@FindBy(xpath = "//div[@id='aModal']//select[@name='category']")
			private WebElement SelectCategoty_Select;
			
			@FindBy(xpath = "//div[@id='aModal']//select[@name='supplier']")
			private WebElement SelectSupplier_Select;
			
			@FindBy(xpath = "datestock")
			private WebElement DateStockIn_Input;
			
			
			
			
			
			
			
			public WebElement getProductCode_Input() {
				return ProductCode_Input;
			}

			public WebElement getName_Input() {
				return Name_Input;
			}

			public WebElement getDescription_Input() {
				return Description_Input;
			}

			public WebElement getQuantity_Input() {
				return Quantity_Input;
			}

			public WebElement getOnHand_Input() {
				return OnHand_Input;
			}

			public WebElement getPrice_Input() {
				return Price_Input;
			}

			public WebElement getSelectCategoty_Select() {
				return SelectCategoty_Select;
			}

			public WebElement getSelectSupplier_Select() {
				return SelectSupplier_Select;
			}

			public WebElement getDateStockIn_Input() {
				return DateStockIn_Input;
			}

			/*========================ADD PRODUCT MODAL INPUTS  close , save , reset ,AND Cancel button======================================================*/
			@FindBy(xpath = "//div[@id='aModal']//button[@class='close']")
			private WebElement Modal_Close_Button;
			
			@FindBy(xpath = "//div[@id='aModal']//button[@class='btn btn-success']")
			private WebElement Modal_Save_Button;
			
			@FindBy(xpath = "//div[@id='aModal']//button[@class='btn btn-danger']")
			private WebElement Modal_Reset_Button;
			
			@FindBy(xpath = "//div[@id='aModal']//button[@class='btn btn-secondary']")
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
		

		/*=============================================PRODUCT Code SERACH ,DETAILS BUTTON AND EDIT BUTTON =======================================================*/
		//Product Search
		@FindBy(xpath = "//input[@type='search']")
		private WebElement ProductSearch;
		//Product Details
		@FindBy(xpath = "(//table[@id='dataTable']//a[@class='btn btn-primary bg-gradient-primary'])[1]")
		private WebElement ProductDetails_Row1;
		
		public WebElement getCustomerSearch() {
			return ProductSearch;
		}

		public WebElement getProductDetails_Row1() {
			return ProductDetails_Row1;
		}
		
		
		
		/*=========================================PRODUCT DETAILS PAGE===========================================================*/
		
		@FindBy(xpath = "//a[@href=\"product.php?action=add\" and @type='button']")
		private WebElement ProductsDetails_BackButton;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[1]")
		private WebElement ProductsDetails_ProductCode;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[2]")
		private WebElement ProductsDetails_ProductName;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[3]")
		private WebElement ProductsDetails_Description;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[4]")
		private WebElement ProductsDetails_Price;
		
		@FindBy(xpath = "(//div[@class='card shadow mb-4 col-xs-12 col-md-8 border-bottom-primary']//div//div//div[2]//h5)[5]")
		private WebElement ProductsDetails_Category;

		public WebElement getProductsDetails_BackButton() {
			return ProductsDetails_BackButton;
		}

		public WebElement getProductsDetails_ProductCode() {
			return ProductsDetails_ProductCode;
		}

		public WebElement getProductsDetails_ProductName() {
			return ProductsDetails_ProductName;
		}

		public WebElement getProductsDetails_Description() {
			return ProductsDetails_Description;
		}

		public WebElement getProductsDetails_Price() {
			return ProductsDetails_Price;
		}

		public WebElement getProductsDetails_Category() {
			return ProductsDetails_Category;
		}
		
		
		
		
		
		
		
		
		

		
}
