package testcases;

import org.testng.annotations.Test;

import pageobjects.policytermsPage;

public class Tc_PolicytermsPage extends Tc_Coveragedetails{
	@Test(priority = 5)
	public void PolicytermsPage() throws InterruptedException
	{
		policytermsPage pt = new policytermsPage(driver);
		pt.clickonedit();
		Thread.sleep(2000);
		pt.clickonaddPolicy();
		Thread.sleep(2000);
		pt.clickonnext();
	

}
}