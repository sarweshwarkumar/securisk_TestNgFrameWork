package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corporate {
	WebDriver driver;
	//JavascriptExecutor js;

	public Corporate(WebDriver driver) {
		//this.js = (JavascriptExecutor) this.driver;
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@aria-label='Name of the Insured/Proposer']")
	WebElement NameOfInsured;

	public void createNameofInsured(String name) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", NameOfInsured);
		Thread.sleep(3000);
		NameOfInsured.sendKeys(name);
		
     //Actions ac = new Actions(driver);
     //ac.moveToElement(NameOfInsured).click().sendKeys("Akhila").build().perform();
     // NameOfInsured.sendKeys("Akhila");
	}

	@FindBy(xpath ="//*[@aria-label='Name of the Intermediary']")
	WebElement NameOfIntermediary;

	public void EnterIntermediaryName(String intername) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", NameOfIntermediary);
		Thread.sleep(3000);
		NameOfIntermediary.sendKeys(intername);
	}

	@FindBy(xpath = "//*[@aria-label='Address']")
	WebElement Address;

	public void EnterAddress(String add) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Address);
		Thread.sleep(3000);
		Address.sendKeys(add);
	}

	@FindBy(xpath = "//*[@aria-label='Contact Name']")
	WebElement Contactnameintermediary;

	public void contactNameinintermediarydetails(String cname) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Contactnameintermediary);
		Thread.sleep(3000);
		Contactnameintermediary.sendKeys(cname);
	}
	@FindBy(xpath = "//*[@aria-label='Nature of the Business']")
	WebElement Natureofbusines;

	public void natureOfBusiness() throws InterruptedException {
		
		Natureofbusines.click();
	}
		
	@FindBy(xpath = "//*[@aria-label='Pharma']")
	WebElement SelectNOB;

	public void selectnatureOB() throws InterruptedException {
		
		SelectNOB.click();
	}

	@FindBy(xpath = "//*[@aria-label='Email Id']")
	WebElement EmailidIn;

	public void emailidinIntermediarydetails(String Inemailid) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", EmailidIn);
		Thread.sleep(3000);
		EmailidIn.sendKeys(Inemailid);
	}
	
	@FindBy(xpath = "//*[@aria-label='Contact Name']")
	WebElement Contactnamedetails;

	public void contactNameindetails(String contactN) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Contactnamedetails);
		Thread.sleep(3000);
		Contactnamedetails.sendKeys(contactN);
	}

	@FindBy(xpath = "//*[@aria-label='Phone Number']")
	WebElement PhonenumberI;

	public void phoneNumberinintermediary(String InPno) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", PhonenumberI);
		Thread.sleep(3000);
		PhonenumberI.sendKeys(InPno);
	}
	
	@FindBy(xpath = "//*[@aria-label='Email Id']")
	WebElement EmailidD;

	public void emailidinInDetails(String Demailid) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", EmailidD);
		Thread.sleep(3000);
		EmailidD.sendKeys(Demailid);
	}
	
	@FindBy(xpath = "//*[@aria-label='Phone Number']")
	WebElement PhonenumberD;


	public void phoneNumberinDetails(String dPno)  throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", PhonenumberD);
		Thread.sleep(3000);
		PhonenumberD.sendKeys(dPno);
	}
	
	@FindBy(xpath = "//*[@aria-label='Select location']")
	WebElement Location;

	public void clickonLocation() throws InterruptedException {
		
		Location.click();
	}
	@FindBy(xpath = "//*[@aria-label='Hyderabad']")
	WebElement SelectLocation;

	public void selectingLocation() throws InterruptedException {
		
		SelectLocation.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='NEXT']")
	WebElement Nextbutton;

	public void clickonnextbutton() throws InterruptedException {
		
		Nextbutton.click();
	}
	
}
