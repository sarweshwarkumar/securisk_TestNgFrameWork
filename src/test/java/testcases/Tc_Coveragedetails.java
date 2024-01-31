package testcases;

import org.testng.annotations.Test;

import pageobjects.Coveragedetailspage;

public class Tc_Coveragedetails extends Tc_Corporatedetails{
	
	@Test(priority = 4)
	public void coveragedetailspage() throws InterruptedException
	{
		Coveragedetailspage cd = new Coveragedetailspage(driver);
		cd.clickOnPolicyType();
		Thread.sleep(2000);
		cd.select_Floater();
		Thread.sleep(5000);
		cd.familyDefination_click();
		Thread.sleep(2000);
		cd.familyDefination_Varied();
		Thread.sleep(2000);
		cd.sumInsured_Click();
		Thread.sleep(2000);
		cd.sumInsured_Varied();
		Thread.sleep(2000);
		//cd.clickonihave_employeedata();
		//Thread.sleep(2000);
		//cd.clickon_employeedependentdata();
		cd.select_selectFamilyDefination();
		Thread.sleep(2000);
		cd.enter_enterFamilyDefination();
	}

}
