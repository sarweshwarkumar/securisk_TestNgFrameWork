package testcases;

import org.testng.annotations.Test;

import pageobjects.Corporate;
import pageobjects.RfqPage;

public class Tc_RfqPage extends Tc_LoginPage{
	@Test(priority = 2)
	public void rfqTestcase() throws InterruptedException {
	RfqPage RP =new RfqPage(driver);
	Thread.sleep(2000);
	RP.Rfq();
	System.out.println("Clicked");
	RP.Create();
	Thread.sleep(2000);
	RP.selectProduct();
	System.out.println("Product");
	Thread.sleep(2000);
	RP.SelectEB();
	Thread.sleep(2000);
	RP.SelectProdType();
	Thread.sleep(2000);
	RP.ghi();
	Thread.sleep(2000);
	RP.SelectPolicyType();
	Thread.sleep(2000);
	RP.SelectFresh();
	Thread.sleep(2000);
	RP.Submit();
	Thread.sleep(2000);
}

}
