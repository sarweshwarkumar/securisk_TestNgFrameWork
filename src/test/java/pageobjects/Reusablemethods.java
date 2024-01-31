package pageobjects;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class Reusablemethods {
	WebDriver driver;
	public Reusablemethods(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void back1()
	{
		driver.navigate().back();
	}
	public void forward1()
	{
		driver.navigate().forward();
	}
	public void minimize1()
	{
		driver.manage().window().maximize();
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void Scrollup()
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_UP);
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-1000)");
		System.out.println("Scroll");
	}
	
	public void Screenshot(WebDriver driver,String Screenname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot"+Screenname+".png");
		Files.copy(src, trg);
		System.out.println("Screenshot captured successfully");
	}
 
	

}
