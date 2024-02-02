package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageobjects.IntermediaryProductsPage;
import pageobjects.Reusablemethods;

public class IntermediaryDeleteProduct extends IntemediaryAddCoverageTest  {

	
	@Test(priority = 6)

	public void deleteProduct() throws IOException {
		Reusablemethods rc = new Reusablemethods(driver);	
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		test = reports.startTest("Delete Product");
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		test.log(LogStatus.PASS, "Product Searched");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		test.log(LogStatus.PASS, "ShowMenu Clicked");
		WaitUntilElementVisible(ip.DeleteProductBtn);
		ip.clickOnProductDelete();
		test.log(LogStatus.PASS, "Clicked on Delete");
		WaitUntilElementVisible(ip.ConfimDeleteYesBtn);
		String path=rc.ScreenshotPath("Delete");
		ip.acceptDeleteProduct();
		test.log(LogStatus.PASS,test.addScreenCapture(path)+ "Product Deleted scucessfully");
		WaitUntilElementVisible(ip.OkBtn);
		ip.clickonOkBtn();
		endReport();
	}

}
