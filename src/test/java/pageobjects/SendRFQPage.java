package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendRFQPage {
	@FindBy(xpath="//*[@aria-label='Employee Dependent Details']")
	WebElement clickon_EmployeeDepedent;
	public void clickonEmployeeDepedent() throws InterruptedException {

		clickon_EmployeeDepedent.click();
	}
	
	
	@FindBy(xpath="//*[@aria-label='Send Email']")
	WebElement clickon_SendEmail;
	public void clickonSendEmail() throws InterruptedException {

		clickon_SendEmail.click();
	}
	

}
