package testcases;

import org.testng.annotations.Test;

import pageobjects.Corporate;
import pageobjects.Reusablemethods;

public class Tc_Corporatedetails extends Tc_RfqPage {

	@Test(priority = 3)
	public void createrfq() throws InterruptedException {

		Reusablemethods reuse = new Reusablemethods(driver);
		Corporate CRFQ = new Corporate(driver);
		System.out.println("CorporateDetails");
		CRFQ.createNameofInsured("Sarweshwar");
		//Thread.sleep(2000);
		CRFQ.EnterIntermediaryName("Securisk");
		Thread.sleep(2000);
		CRFQ.EnterAddress("Hyderabad");
		Thread.sleep(2000);
		CRFQ.contactNameinintermediarydetails("Siri");
		Thread.sleep(2000);
		CRFQ.natureOfBusiness();
		Thread.sleep(2000);
		CRFQ.selectnatureOB();
		Thread.sleep(2000);
		CRFQ.emailidinIntermediarydetails("sarwesh@gmail.com");
		Thread.sleep(2000);
		CRFQ.contactNameindetails("Akhila");
		Thread.sleep(2000);
		CRFQ.phoneNumberinintermediary("9786563214");
		Thread.sleep(2000);
		CRFQ.emailidinInDetails("akhila12@gmail.com");
		Thread.sleep(2000);
		CRFQ.phoneNumberinDetails("8897654320");
		Thread.sleep(2000);
		CRFQ.clickonLocation();
		Thread.sleep(2000);
		CRFQ.selectingLocation();
		Thread.sleep(2000);
		CRFQ.clickonnextbutton();
		Thread.sleep(2000);
		reuse.Scrollup();
	}

}
