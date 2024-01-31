package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readconfig;

public class Baseclass {
	Readconfig Rc = new Readconfig();
	public String url = Rc.AppURL();
	public String username = Rc.EnterUser();
	public String pwd = Rc.EnterPwd();

	public static ExtentReports reports;
	public static ExtentTest test;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public Baseclass(WebDriver driver, WebDriverWait wait) {
		Baseclass.driver = driver;
		Baseclass.wait = wait;
	}

//	protected void WaitUntilElementVisible(WebElement element) {
//		wait.until(ExpectedConditions.visibilityOf(element));
//	}

	@BeforeSuite

	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver( ).setup();
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--remote-allow-origin=*");
		driver = new ChromeDriver(op);
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector('flt-glass-pane').shadowRoot.querySelector('flt-semantics-placeholder').click({force: true});");
	}

	@AfterSuite
	public void teardown() {
		//driver.close();;
		// reports.endTest(test);
		//reports.flush();
	}

}
