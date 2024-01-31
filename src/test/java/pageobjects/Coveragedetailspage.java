package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coveragedetailspage {
	WebDriver driver;
	public Coveragedetailspage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="flt-semantics[aria-label=\"-----Policy Type-----\"]")
	WebElement clickonPloicyType;
	
	
	public void clickOnPolicyType() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].scrollIntoView();", clickonPloicyType);
	       
		Thread.sleep(2000);
		clickonPloicyType.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='Floater']")
	WebElement floater;

	public void select_Floater() throws InterruptedException {
		
		 floater.click();
	}
	
	@FindBy(xpath ="//*[@aria-label='------Family Defination------']")
	WebElement clickonfamilydefination;

	public void familyDefination_click() throws InterruptedException {
		
				clickonfamilydefination.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='Varied']")
	WebElement selectvariedinFD;

	public void familyDefination_Varied() throws InterruptedException {
		
		selectvariedinFD.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='------Sum Insured-------']")
	WebElement Clickonsuminsured;

	public void sumInsured_Click() throws InterruptedException {
		
		Clickonsuminsured.click();
	}
	@FindBy(xpath = "(//*[@aria-label='Varied'])[1]")
	WebElement selectvariedinSI;

	public void sumInsured_Varied() throws InterruptedException {
		
		selectvariedinSI.click();
	}
	
	@FindBy(css="#flt-semantic-node-453")
	WebElement Ihave_employeedata;

	public void clickonihave_employeedata() throws InterruptedException {
		
		Ihave_employeedata.click();
	}

	@FindBy(css="#flt-semantic-node-497")
	WebElement employeedependentdata;

	public void clickon_employeedependentdata() throws InterruptedException {
		
		employeedependentdata.click();
	}
	
	@FindBy(css="#flt-semantic-node-539")
	WebElement selectFamilyDefination;
	
public void select_selectFamilyDefination() throws InterruptedException {
		
	selectFamilyDefination.click();
	}
	
@FindBy(xpath="(//*[@aria-label='Sum Insured'])[2]")
WebElement enterFamilyDefination;

public void enter_enterFamilyDefination() throws InterruptedException {
	
	enterFamilyDefination.sendKeys("50000");
}
	

}
