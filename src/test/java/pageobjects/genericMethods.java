package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class genericMethods {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	public void startReport(String filename, String testName) {
		report = new ExtentReports("./Reports/"+filename+".html");
		test=report.startTest(testName);
	}
	
	public void endReport() {
		report.endTest(test);
		report.flush();
	}

	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		test.log(LogStatus.PASS,"Browser launched successfully");
	}

	public void openApplication(String url) {
		driver.get(url);
	}

	public void textField(WebElement element, String Text) {
		element.sendKeys(Text);
	}

	public void button(WebElement element) {
		element.click();
	}
	public void ClientListButton(WebElement element) {
		element.click();
	}
	public String screenshot(String filename) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./ScreenShots"+filename+".png");
		Files.copy(src, trg);
		String path=trg.getAbsolutePath();
		return path;
	}
	public void selectDropDown(WebElement element, String Value) {
		Select se=new Select(element);
		se.selectByValue(Value);
		
	}
//	public void search(WebElement ele,int index) {
//		Select s=new Select(ele);
//		s.selectByIndex(0);
//	
//		
//	}
}
