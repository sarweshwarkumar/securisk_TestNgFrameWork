package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.IntermediaryProductsPage;


public class IntermediaryAddProductTest extends Baseclass{

	public IntermediaryAddProductTest() {
		super(driver, wait);
		
	}
	
		@Test
		public void addProduct() throws InterruptedException {
			Tc_LoginPage tc= new Tc_LoginPage();
			tc.launch();
			IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
			WaitUntilElementVisible(ip.IntermediaryDropdown);
			ip.clickOnIntermediary();
			ip.clickOnProducts();
			ip.clickOnCreateProduct();
			WaitUntilElementVisible(ip.ProductnameFiled);
			ip.enterProductName("Demo");
			WaitUntilElementVisible(ip.ProductTypeDropdown);
			ip.selectProductType();
			WaitUntilElementVisible(ip.NonEBValue);	
			ip.selectNonEBProduct();
			WaitUntilElementVisible(ip.AddProduct);		
			ip.addProduct();
			WaitUntilElementVisible(ip.ConfirmAddProduct);
			Assert.assertEquals(true, ip.productAdded());
			WaitUntilElementVisible(ip.ClosePopupbtn);
			ip.closePopUP();

		}

		
	}
	
	


