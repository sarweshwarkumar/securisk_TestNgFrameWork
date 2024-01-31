package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RfqPage {
	WebDriver driver;
	public RfqPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@aria-label='RFQ']")

	WebElement RFQLink;

	public void Rfq() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", RFQLink);
	}

	@FindBy(xpath = "//*[@aria-label='Create RFQ']")
	WebElement CreateRFQ;

	public void Create() {
		CreateRFQ.click();

	}

	@FindBy(xpath = "//*[@aria-label='------Select Product Category------']")

	WebElement ProdCategory;

	public void selectProduct() {

		ProdCategory.click();

	}

//	@FindBy(css = "flt-semantics[aria-label='NON-EB']")
//	WebElement NonEb;
//
//	public void SelectNonEb() {
//		NonEb.click();
//	}

	@FindBy(css = "flt-semantics[aria-label='EB']")
	WebElement EB;

	public void SelectEB() {
		EB.click();
	}

	@FindBy(css = "flt-semantics[aria-label='------Select Product type------']")
	WebElement ProdType;

	public void SelectProdType() {
		ProdType.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Group Health Insurance (GHI)']")
	WebElement GHI;

	public void ghi() {
		GHI.click();
	}

	@FindBy(css = "flt-semantics[aria-label='------Select Policy Type------']")
	WebElement Policytype;

	public void SelectPolicyType() {
		Policytype.click();
	}
	@FindBy(css = "flt-semantics[aria-label='Fresh']")
	WebElement Fresh;
	public void SelectFresh() {
		Fresh.click();
	}
	@FindBy(css = "flt-semantics[aria-label='Submit']")
	WebElement ClickButton;
	public void Submit() throws InterruptedException {
		ClickButton.click();
		//Thread.sleep(2000);
	}
	

}
