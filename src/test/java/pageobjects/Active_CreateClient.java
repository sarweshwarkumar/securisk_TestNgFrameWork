package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.genericMethods;

public class Active_CreateClient {
	WebDriver driver;

	public Active_CreateClient(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	genericMethods gs = new genericMethods();

	@FindBy(css = "flt-semantics[aria-label='Create Client']")
	WebElement CreateClient;

	public void Create_Client() {
		CreateClient.click();
	}

	@FindBy(css = "input[aria-label='Client Name']")
	WebElement ClientName;

	public void client_Name() {
		gs.textField(ClientName, "KfinTech");

	}

	@FindBy(css = "flt-semantics[aria-label='Location']")
	WebElement Location;

	public void client_Location() {
		Location.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Chennai']")
	WebElement LoctationDrop;

	public void location_Drop_Name() {
		LoctationDrop.click();
	}

	@FindBy(css = "flt-semantics[aria-label='ProductType']")
	WebElement Product;

	public void product_Type() {
		Product.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Motor Insurance \"]")
	WebElement ProductDrop;

	public void product_Drop_Type() {
		ProductDrop.click();
	}

	@FindBy(css = "flt-semantics[aria-label='InsuranceCompany']")
	WebElement Insurance;

	public void isurance_Company() {
		Insurance.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Oriental Insurance Co.Ltd']")
	WebElement InsuraneDrop;

	public void insurance_Drop_CompanyName() {
		InsuraneDrop.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Create']")
	WebElement Create;

	public void create_Client_Button() {
		Create.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Chennai\"]")
	WebElement FilterClick;

	public void filter_Click() {
		FilterClick.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Filter By']")
	public WebElement Filter;

	public void filterOpp() {
		Filter.click();

	}

	@FindBy(css = "input[aria-label='Search']")
	WebElement Search;

	public void searchop() {
		Search.sendKeys("KfinTech");

	}

	@FindBy(css = "flt-semantics[aria-label='Previous']")
	WebElement Previous;

	public void previous_Button() {
		Previous.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Next']")
	WebElement Next;

	public void next_Button() {
		Next.click();
	}

	@FindBy(xpath = "(//flt-semantics[@aria-label='Show menu'])[2]")
	WebElement ShowMenuDots;

	public void showMenu_Dots() {
		ShowMenuDots.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Show Products\"]")
	WebElement Showproducts;

	public void showproducts_Option() {
		Showproducts.click();
	}

	@FindBy(xpath = "//*[@aria-label='Products']/descendant::flt-semantics[@role='button']")
	WebElement CloseButton;

	public void close_Button() {
		CloseButton.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Add Product\"]")
	WebElement AddProduct;

	public void addProduct_Option() {
		AddProduct.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"ProductType\"]")
	WebElement ProductType;

	public void product_Type1() {
		ProductType.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Aviation\"]")
	WebElement CovidPolicy;

	public void covid_Policy() {
		CovidPolicy.click();
	}

	@FindBy(xpath = "//*[@aria-label='InsuranceCompany']")
	WebElement InsuranceCompany;

	public void insurance_Company1() {
		InsuranceCompany.click();
	}

	@FindBy(css = " flt-semantics[aria-label='Kotak Mahindra Life Insurance Co.Ltd']")
	WebElement InsuranceCompanyName;

	public void insuranceCompany_Name() {
		InsuranceCompanyName.click();
	}

	@FindBy(xpath = "//*[@aria-label='Product Add']")
	WebElement ProductAdd1;

	public void Product_Add1() {
		ProductAdd1.click();
	}

	@FindBy(xpath = "//*[@aria-label='Close']")
	WebElement ProductClose;

	public void product_Close() {
		ProductClose.click();
	}

	@FindBy(xpath = "//*[@aria-label='Add User']")
	WebElement AddUser;

	public void client_AddUser() {
		AddUser.click();
	}

	@FindBy(xpath = "//*[@aria-label='Employee Id']")
	WebElement EmployeeId;

	public void employee_Id() {
		gs.textField(EmployeeId, "147589");

	}

	@FindBy(css = "input[aria-label='Name']")
	WebElement EmployeeName;

	public void employeeName() {
		gs.textField(EmployeeName, "Honey");

	}

	@FindBy(css = "flt-semantics[aria-label='Designation']")
	WebElement Designation;

	public void designation() {
		Designation.click();
	}

	@FindBy(xpath = "//*[@aria-label='Regional Head']")
	WebElement RegionalHead;

	public void regionalHead() {
		RegionalHead.click();
	}

	@FindBy(xpath = "//*[@aria-label='Email Id']")
	WebElement EmailId;

	public void emailId() {
		gs.textField(EmailId, "honey@gmail.com");

	}

	@FindBy(xpath = "//*[@aria-label='Phone Number']")
	WebElement PhoneNumber;

	public void phone_Number() {
		gs.textField(PhoneNumber, "9759154698");

	}

	@FindBy(css = "flt-semantics[aria-label='Create']")
	WebElement CreateUser;

	public void create_User() {
		CreateUser.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Close']")
	WebElement CloseUser;

	public void close_User() {
		CloseUser.click();
	}
	@FindBy(xpath="//*[@aria-label='7']")
	WebElement ProductNo;
	public void product_No() {
		ProductNo.click();
	}
	
	@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[6]")
	WebElement ProductDots;
	public void product_Dots() {
		ProductDots.click();
	}
	@FindBy(xpath="//*[@aria-label=\"Delete\"]")
	WebElement Delete_Product;
	public void delete_Product() {
		Delete_Product.click();
	}
	@FindBy(xpath="//*[@aria-label='Yes']")
	WebElement Delete_Yes;
	public void  delete_Yes() {
		 Delete_Yes.click();
	}
	@FindBy(xpath="//*[@aria-label=\"4\"]")
	WebElement AddedUserNo;
	public void addedUserNo() {
		AddedUserNo.click();
	}
	@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[4]")
	WebElement AddedUserNo_Dots;
	public void addedUserNo_Dots() {
		AddedUserNo_Dots.click();
	}
	@FindBy(xpath="//*[@aria-label=\"Delete\"]")
	WebElement DeleteUser;
	public void  deleteUser() {
		 DeleteUser.click();
	}
	@FindBy(xpath="//*[@aria-label='Yes']")
	WebElement Deletete_User_Yes;
	public void deletete_User_Yes() {
		Deletete_User_Yes.click();
	}
	@FindBy(xpath="//*[@aria-label='OK']")
	WebElement Deletete_User_Yes_Click;
	public void deletete_User_Yes_Click() {
		Deletete_User_Yes_Click.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
