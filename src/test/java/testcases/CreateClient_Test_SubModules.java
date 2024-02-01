package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.PageElements.ActiveOption;
import com.PageElements.Active_CreateClient;
import com.PageElements.ClientList;
import com.PageElements.LoginPage;
import com.Utilities.genericMethods;
import com.relevantcodes.extentreports.LogStatus;

public class CreateClient_Test_SubModules extends BaseClass {
	@Test
	public void CreateClient_Active() throws Exception {
		genericMethods gm = new genericMethods();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(4000);
		gm.startReport("Securisk", "ClientList Module Report started Successfully");
		lp.fillEmailData(username);
		test.log(LogStatus.PASS, "Username Entered Successfully");
		Thread.sleep(7000);

		lp.fillPasswordData(password);

		test.log(LogStatus.PASS, "Password Entered Successfully");
		Thread.sleep(2000);
		lp.clickSignInButton();
		test.log(LogStatus.PASS, "Login to the Application Successfully");
		Thread.sleep(4000);
		ClientList cl = new ClientList(driver);

		cl.dropdownClient();
		test.log(LogStatus.PASS, " Client List button Cliecked Successfully");
		Thread.sleep(4000);
		cl.ActuveOp();
		test.log(LogStatus.PASS, "Under Client List Active Sub-Module Clicked Successfully");
		Thread.sleep(4000);
		Active_CreateClient aa = new Active_CreateClient(driver);

//		aa.Create_Client();
//
//		test.log(LogStatus.PASS, "Create Client Button Clicked Successfully");
//		Thread.sleep(2000);
//		aa.client_Name();
//		test.log(LogStatus.PASS, "Client Name Entered Successfully");
//		Thread.sleep(2000);
//		aa.client_Location();
//		test.log(LogStatus.PASS, "Client Location Entered Successfully");
//		Thread.sleep(2000);
//		aa.location_Drop_Name();
//		test.log(LogStatus.PASS, "Under Location DropDown Location Selected Successfully");
//		Thread.sleep(2000);
//
//		aa.product_Type();
//		test.log(LogStatus.PASS, " Under Create Client Product Type clicked Successfully");
//		Thread.sleep(2000);
//		aa.product_Drop_Type();
//		test.log(LogStatus.PASS, " Under Create Client Product Type Selected Successfully");
//		Thread.sleep(2000);
//		aa.isurance_Company();
//		test.log(LogStatus.PASS, " Under Create Insurance Company clicked Successfully");
//		Thread.sleep(2000);
//
//		aa.insurance_Drop_CompanyName();
//		test.log(LogStatus.PASS, " Under Create Insurance Company Selected Successfully");
//		Thread.sleep(2000);
//
//		aa.create_Client_Button();
//		test.log(LogStatus.PASS, " Under Create Client Created Successfully");
//		Thread.sleep(2000);

		aa.filterOpp();
		test.log(LogStatus.PASS, " UnderClient List Filter Option clicked Successfully");
		Thread.sleep(2000);

		aa.filter_Click();
		test.log(LogStatus.PASS, " UnderClient List Filter Option Selected Successfully");
		Thread.sleep(2000);

		aa.searchop();
		test.log(LogStatus.PASS, " UnderClient Search Option clicked Successfully");
		Thread.sleep(2000);

//		aa.previous_Button();
//		test.log(LogStatus.PASS, " UnderClient List Previous Button  clicked Successfully");
//		Thread.sleep(2000);
//
//		aa.next_Button();
//		test.log(LogStatus.PASS, " UnderClient List Next Button  clicked Successfully");
//		Thread.sleep(2000);
//
//		aa.showMenu_Dots();
//
//		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
//
//		Thread.sleep(6000);
//		aa.showproducts_Option();
//
//		test.log(LogStatus.PASS, " UnderClient after creating client Show products option clicked Successfully");
//		Thread.sleep(6000);
//		aa.close_Button();
//
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client After displaying Show products option it is closed Successfully");
//		Thread.sleep(4000);
//
//		aa.showMenu_Dots();
//
//		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
//		Thread.sleep(6000);
//		aa.addProduct_Option();
//
//		test.log(LogStatus.PASS, " UnderClient after creating client add products option clicked Successfully");
//		Thread.sleep(2000);
//		aa.product_Type1();
//
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client add products option Product type clicked Successfully");
//		Thread.sleep(2000);
//		aa.covid_Policy();
//
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client add products option Product type Selected Successfully");
//		Thread.sleep(2000);
//		aa.insurance_Company1();
//
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client add products option  Insurance Company clicked Successfully");
//		Thread.sleep(2000);
//		aa.insurance_Drop_CompanyName();
//
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client add products option  Insurance Company Name Selected Successfully");
//		Thread.sleep(2000);
//		aa.Product_Add1();
//
//		test.log(LogStatus.PASS, " UnderClient after creating client add products option  Product Added Successfully");
//		Thread.sleep(2000);
//		aa.product_Close();
//
//		test.log(LogStatus.PASS,
//				" UnderClient after creating After Adding the products close pop-up closed Successfully");
//		Thread.sleep(2000);
//		aa.showMenu_Dots();
//
//		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
//		Thread.sleep(5000);
//
//		aa.client_AddUser();
//		test.log(LogStatus.PASS, " UnderClient after creating client under Actions Add User clicked Successfully");
//		Thread.sleep(5000);
//
//		aa.employee_Id();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User EmployeeId Entered Successfully");
//		Thread.sleep(5000);
//
//		aa.employeeName();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User Employee Name Entered Successfully");
//		Thread.sleep(5000);
//
//		aa.designation();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions Add User Designation clicked Successfully");
//		Thread.sleep(5000);
//
//		aa.regionalHead();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User Designation Entered Successfully");
//		Thread.sleep(5000);
//
//		aa.emailId();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User email Entered Successfully");
//		Thread.sleep(5000);
//
//		aa.phone_Number();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User Phone Number Entered Successfully");
//		Thread.sleep(5000);
//
//		aa.create_User();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User,After entering all the details User button clicked Successfully");
//		Thread.sleep(5000);
//
//		aa.close_User();
//		test.log(LogStatus.PASS,
//				" UnderClient after creating client under Actions after clicking on Add User,After entering all the details User will create then Close pop-up clicked Successfully");
//		Thread.sleep(5000);

//		aa.product_No();
//		test.log(LogStatus.PASS,
//				" UnderClient in Actions after creation of product and user clicking on product is successfully");
//
//		Thread.sleep(5000);
//
//		aa.product_Dots();
//		test.log(LogStatus.PASS,
//				" UnderClient in Actions after creation of product and user click on productno then in that dots are selecting is successfully");
//		Thread.sleep(5000);
//
//		aa.delete_Product();
//		test.log(LogStatus.PASS,
//				" UnderClient in Actions after creation of product and user product deleting is successfully");
//		Thread.sleep(5000);
//		aa.delete_Yes();
//		test.log(LogStatus.PASS,
//				" UnderClient in Actions after creation of product and user product deleted pop-up clicked  successfully");
//		Thread.sleep(5000);
		aa.addedUserNo();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then user numbers clicked is successfully");
		Thread.sleep(5000);
		aa.addedUserNo_Dots();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then  after clicking on user numbers  dots clicked is successfully");

		Thread.sleep(5000);
		aa.deleteUser();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then  after clicking on user numbers  dots delete option  clicked is successfully");

		Thread.sleep(5000);
		aa.deletete_User_Yes();
		test.log(LogStatus.PASS, "user deleted successfully");
		aa.deletete_User_Yes_Click();
		test.log(LogStatus.PASS, "user delete pop-up clicked successfully");


	}

}
