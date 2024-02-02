package pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Reusablemethods {
	 public WebDriver driver;
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
 
	public void MoveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

	}

	public void MoveToElementSendkeys(WebElement element, String text) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().sendKeys(text).build().perform();

	}

	public void ScrollToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.scrollToElement(element);
	}

	public void Downkey() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
	}

	public void EnterKey() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void Scroll(int value) throws AWTException {
		Robot robo = new Robot();
		robo.mouseWheel(value);
	}

	public void closeapp() {
		driver.close();
	}

	public String ScreenshotPath(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File loc = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(
				"./ScreenShots" + "/" + filename + System.currentTimeMillis() + ".png");
		Files.copy(loc, file);
		return file.getAbsolutePath();
	}

}
