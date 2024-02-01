package testcases;

import org.testng.annotations.Test;

import pageobjects.IntermediaryProductsPage;

public class IntemediaryAddCoverageTest extends Baseclass {

	public IntemediaryAddCoverageTest() {
		super(driver, wait);
	}

	@Test
	public void addCoverage() throws Exception {
		IntermediaryAddProductTest ia = new IntermediaryAddProductTest();
		ia.addProduct();
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		WaitUntilElementVisible(ip.AddCoverageBtn);
		ip.clickOnAddCoverage();
		WaitUntilElementVisible(ip.EnterCoverageField);
		ip.enterCoverageName("Test");
		WaitUntilElementVisible(ip.AddBtn);
		ip.clickOnAddBtn();
		WaitUntilElementVisible(ip.OkBtn);
		ip.clickonOkBtn();
	}

}
