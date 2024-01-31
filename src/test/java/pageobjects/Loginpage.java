package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	

	Reusablemethods Reuse = new Reusablemethods(driver);

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@aria-label='LOGIN']")
	WebElement Loginbutton;

	public void login1() {
		Loginbutton.click();
	}

	@FindBy(xpath="//*[@aria-label='Enter Email Id']")
	WebElement EmailIdTextBox;

	public void Username(String name) throws InterruptedException {
		EmailIdTextBox.sendKeys(name);

		Thread.sleep(2000);
	}
	

	@FindBy(css = "input[aria-label='Enter Password']")
	WebElement PasswordTextBox;

	public void Password(String PWD) {
		PasswordTextBox.sendKeys(PWD);
	}

	@FindBy(css = "flt-semantics[aria-label=\"Login\"]")
	WebElement FinalLoginbutton;

	public void FinalLogin() {
		FinalLoginbutton.click();
	}

	// private static final String urlLocator = "flt-semantics[aria-label='LOGIN']";

	
	

//	public void RFQLink1() {
//		Actions ac = new Actions(driver);
//		ac.moveToElement(RFQLink);
//		ac.click().build().perform(); // RFQLink.click();
//
//	}
	
}
