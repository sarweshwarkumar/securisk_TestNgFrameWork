package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageobjects.IntermediaryProductsPage;
import pageobjects.Reusablemethods;

public class IntemediaryAddCoverageTest extends IntermediaryAddProductTest {

	@Test(priority = 4)
	public void addCoverage() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		test = reports.startTest("AddCoverage With Valid Data");
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		WaitUntilElementVisible(ip.AddCoverageBtn);
		ip.clickOnAddCoverage();
		test.log(LogStatus.PASS, "Clicked on Add coverage");
		WaitUntilElementVisible(ip.EnterCoverageField);
		ip.enterCoverageName("Test");
		test.log(LogStatus.PASS, "Coverage name Entered");
		WaitUntilElementVisible(ip.AddBtn);
		ip.clickOnAddBtn();
		WaitUntilElementVisible(ip.OkBtn);
		Assert.assertEquals(true, ip.coverageAdded());
		String path =rc.ScreenshotPath("Add coverage");
		test.log(LogStatus.PASS,test.addScreenCapture(path) +"Coverage Added Scucessfully");
		ip.clickonOkBtn();
		endReport();
	}
	
	@Test(priority = 5)
	public void addCoverageWithInvalidata() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		test = reports.startTest("AddCoverage With InValid Data");
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		WaitUntilElementVisible(ip.AddCoverageBtn);
		ip.clickOnAddCoverage();
		test.log(LogStatus.PASS, "Clicked on Add coverage");
		WaitUntilElementVisible(ip.AddBtn);
		ip.clickOnAddBtn();
		WaitUntilElementVisible(ip.OkBtn);
		try {
			Assert.assertEquals(true, ip.coverageAdded());
			String path =rc.ScreenshotPath("Add coverage");
			test.log(LogStatus.PASS,test.addScreenCapture(path) +"Coverage Added Scucessfully");
			ip.clickonOkBtn();
		} catch (Exception e) {
			String path =rc.ScreenshotPath("Add coverage");
			test.log(LogStatus.FAIL,test.addScreenCapture(path) +"Coverage Added Scucessfully");
			ip.clickonOkBtn();
		}
		ip.clickonOkBtn();
		endReport();
	
	}
}
