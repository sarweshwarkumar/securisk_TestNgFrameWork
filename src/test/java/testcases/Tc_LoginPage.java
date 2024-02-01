package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginpage;
import pageobjects.Reusablemethods;

public class Tc_LoginPage extends Baseclass {

	public Tc_LoginPage() {
		super(driver, wait);

	}

	@Test(priority = 1)

	public void launch() throws InterruptedException {
		Reusablemethods Rm = new Reusablemethods(driver);
		Loginpage Lp = new Loginpage(driver);
		Rm.maximize();
		Lp.login1();
		Thread.sleep(2000);
		Lp.Username(username);
		Thread.sleep(2000);
		Lp.Password(pwd);
		Thread.sleep(2000);
		Lp.FinalLogin();
		System.out.println("Login Sucessfull");
		
		
	}

}
