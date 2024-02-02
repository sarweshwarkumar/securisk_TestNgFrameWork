package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageobjects.IntermediaryProductsPage;
import pageobjects.Reusablemethods;


public class IntermediaryAddProductTest extends Baseclass{

	public IntermediaryAddProductTest() {
		super(driver, wait);
		
	}
	
		@Test(priority = 2)
		public void addProduct() throws InterruptedException, Exception {
			Reusablemethods rc = new Reusablemethods(driver);
			Tc_LoginPage tc= new Tc_LoginPage();
			tc.launch();
			IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
			startReport("IntermediaryProducts");
			test = reports.startTest("AddProduct With Valid Data");
			WaitUntilElementVisible(ip.IntermediaryDropdown);
			ip.clickOnIntermediary();
			ip.clickOnProducts();
			test.log(LogStatus.PASS, "Products Selected");
			ip.clickOnCreateProduct();
			WaitUntilElementVisible(ip.ProductnameFiled);
			ip.enterProductName("Demo");
			WaitUntilElementVisible(ip.ProductTypeDropdown);
			ip.selectProductType();
			WaitUntilElementVisible(ip.NonEBValue);	
			test.log(LogStatus.PASS, "NON-EBSelected");
			ip.selectNonEBProduct();
			WaitUntilElementVisible(ip.AddProduct);		
			ip.addProduct();
			WaitUntilElementVisible(ip.ConfirmAddProduct);
			String path =rc.ScreenshotPath("Add product");
			test.log(LogStatus.PASS,test.addScreenCapture(path)+ "Add Product scucessfull");
			Assert.assertEquals(true, ip.productAdded());
			WaitUntilElementVisible(ip.ClosePopupbtn);
			ip.closePopUP();
			endReport();

		}
		
		@Test(priority = 3)
		public void addProductWithInvalid() throws Exception {
			Reusablemethods rc = new Reusablemethods(driver);
			IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
			test = reports.startTest("AddProduct With InValid Data");
			WaitUntilElementVisible(ip.IntermediaryDropdown);
			ip.clickOnIntermediary();
			Thread.sleep(3000);
			WaitUntilElementVisible(ip.ProductsButton);
			ip.clickOnProducts();
			test.log(LogStatus.PASS, "Products Selected");
			ip.clickOnCreateProduct();
			WaitUntilElementVisible(ip.ProductnameFiled);
			ip.enterProductName("");
			WaitUntilElementVisible(ip.AddProduct);		
			ip.addProduct();
			WaitUntilElementVisible(ip.ClosePopupbtn);
			String path =rc.ScreenshotPath("Add product");
			try {
				Assert.assertEquals(true, ip.productAdded());
				test.log(LogStatus.PASS,test.addScreenCapture(path)+ "Add Product scucessfull");
			} catch (Exception e) {
				test.log(LogStatus.FAIL,test.addScreenCapture(path)+ "Add Product Not scucessfull");
			}
			
			WaitUntilElementVisible(ip.ClosePopupbtn);
			ip.closePopUP();
			endReport();
		}

		
	}
	
	


