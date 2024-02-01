package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntermediaryProductsPage {
	WebDriver driver;

	public IntermediaryProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Intermediary Details')]")
	public WebElement IntermediaryDropdown;
	@FindBy(css = "flt-semantics[aria-label='Products']")
	public WebElement ProductsButton;
	@FindBy(css = "flt-semantics[aria-label='TPA List']")
	public WebElement TPAButton;
	@FindBy(css = "flt-semantics[aria-label='Insurer List']")
	public WebElement InsurerlistButton;
	@FindBy(css = "flt-semantics[aria-label='Create Product']")
	public WebElement CreateProductButton;
	@FindBy(css = "input[aria-label='Prouct Name']")
	public WebElement ProductnameFiled;
	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Select Product Type')]")
	public WebElement ProductTypeDropdown;
	@FindBy(css = "flt-semantics[aria-label='EB']")
	public WebElement EBValue;
	@FindBy(css = "flt-semantics[aria-label='NON-EB']")
	public WebElement NonEBValue;
	@FindBy(css = "flt-semantics[aria-label='Add Product']")
	public WebElement AddProduct;
	@FindBy(css = "flt-semantics[aria-label='Product added successfully!']")
	public WebElement ConfirmAddProduct;
	@FindBy(css = "flt-semantics[aria-label='Close']")
	public WebElement ClosePopupbtn;
	@FindBy(css = "input[aria-label='Search']")
	public WebElement SearchField;
	@FindBy(xpath = "(//flt-semantics[@aria-label='Show menu'])[2]")
	public WebElement ShowmenuBtn;
	@FindBy(css = "flt-semantics[aria-label='Add Coverage']")
	public WebElement AddCoverageBtn;
	@FindBy(css = "input[aria-label='Enter coverage name']")
	public WebElement EnterCoverageField;
	@FindBy(css = "flt-semantics[aria-label='Add']")
	public WebElement AddBtn;
	@FindBy(css = "flt-semantics[aria-label='Delete']")
	public WebElement DeleteProductBtn;
	@FindBy(css = "flt-semantics[aria-label='Yes']")
	public WebElement ConfimDeleteYesBtn;
	@FindBy(css = "flt-semantics[aria-label='No']")
	public WebElement ConfimDeleteNoBtn;
	@FindBy(css = "flt-semantics[aria-label='Edit']")
	public WebElement EditProductBtn;
	@FindBy(css = "flt-semantics[aria-label='OK']")
	public WebElement OkBtn;
	@FindBy(css = "flt-semantics[aria-label='Show Coverages']")
	public WebElement ShowCoverageBtn;
	@FindBy(css = "input[aria-label='Product Name']")
	public WebElement EditProductnameField;
	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'ProductType')]")
	public WebElement EditProductTypedropdown;
	@FindBy(css = "flt-semantics[aria-label='Update Product']")
	public WebElement UpdateProductBtn;

	public void clickOnIntermediary() {
		IntermediaryDropdown.isEnabled();
		IntermediaryDropdown.click();
	}

	public void clickOnProducts() {
		ProductsButton.isEnabled();
		ProductsButton.click();
	}

	public void clickOnCreateProduct() {
		CreateProductButton.isEnabled();
		CreateProductButton.click();
	}

	public void enterProductName(String name) throws InterruptedException {
		ProductnameFiled.isEnabled();
		ProductnameFiled.click();
		Thread.sleep(2000);
		ProductnameFiled.sendKeys(name);
	}

	public void selectProductType() {
		ProductTypeDropdown.isEnabled();
		ProductTypeDropdown.click();
	}

	public void selectEBProduct() {
		EBValue.isEnabled();
		EBValue.click();
	}

	public void selectNonEBProduct() {
		NonEBValue.isEnabled();
		NonEBValue.click();
	}

	public void addProduct() {
		AddProduct.isEnabled();
		AddProduct.click();
	}

	public boolean productAdded() {
		return (ConfirmAddProduct.isDisplayed());

	}

	public void closePopUP() {
		ClosePopupbtn.isEnabled();
		ClosePopupbtn.click();
	}

	public void searchProduct(String productname) {
		SearchField.isEnabled();
//		SearchField.clear();
		SearchField.sendKeys(productname);
	}

	public void clickonShowMenu() {
		ShowmenuBtn.isEnabled();
		ShowmenuBtn.click();
	}

	public void clickOnAddCoverage() {
		AddCoverageBtn.isEnabled();
		AddCoverageBtn.click();
	}

	public void enterCoverageName(String Coveragename) throws InterruptedException {
		EnterCoverageField.isEnabled();
//		JavascriptExecutor js = (JavascriptExecutor) this.driver;
//		js.executeScript("arguments[0].click()", EnterCoverageField);
//		EnterCoverageField.click();
		EnterCoverageField.sendKeys(Coveragename);
		Thread.sleep(3000);
	}

	public void clickOnAddBtn() {
		AddBtn.isEnabled();
		AddBtn.click();
	}

	public void clickOnProductDelete() {
		DeleteProductBtn.isEnabled();
		DeleteProductBtn.click();
	}

	public void acceptDeleteProduct() {
		ConfimDeleteYesBtn.isEnabled();
		ConfimDeleteYesBtn.click();

	}

	public void clickonOkBtn() {
		OkBtn.isEnabled();
		OkBtn.click();
	}

	public void rejectDeleteProduct() {
		ConfimDeleteNoBtn.isEnabled();
		ConfimDeleteNoBtn.click();
	}

	public void clickOnShowCoverage() {
		ShowCoverageBtn.isEnabled();
		ShowCoverageBtn.click();
	}
	public void clickOnEditProduct() {
		EditProductBtn.isEnabled();
		EditProductBtn.click();	
	}
	public void updateProductName(String name) {
		EditProductnameField.isEnabled();
		EditProductnameField.sendKeys(name);
	}
	
	public void updateProductType() {
		EditProductTypedropdown.isEnabled();
		EditProductTypedropdown.click();
	}
	
	public void clickOnUpdateProduct() {
		UpdateProductBtn.isEnabled();
		UpdateProductBtn.click();
	}


}
