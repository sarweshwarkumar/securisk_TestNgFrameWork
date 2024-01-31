package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class policytermsPage {
	WebDriver driver;
	public policytermsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#flt-semantic-node-1363")
	WebElement clickon_edit;

	public void clickonedit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "clickon_edit");
	       
		Thread.sleep(2000);

		clickon_edit.click();
	}
	@FindBy(css = "#flt-semantic-node-1363")
	WebElement clickon_addPolicyterms;

	public void clickonaddPolicy() throws InterruptedException {

		clickon_addPolicyterms.click();
	}

	@FindBy(xpath="//*[@aria-label='NEXT']")
	WebElement clickon_Next;
	public void clickonnext() throws InterruptedException {

		clickon_Next.click();
	}
}
