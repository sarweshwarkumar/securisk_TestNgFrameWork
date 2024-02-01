package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class GenericMethods {
	
	WebDriverWait wait;
	WebDriver driver;
	
	public String Screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File loc = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(
				"./Screenshorts" + "/" + filename + System.currentTimeMillis() + ".png");
		Files.copy(loc, file);
		return file.getAbsolutePath();
	}
	
	public static void output(String filename) throws IOException {
		Desktop.getDesktop().browse(new File("./TestReports/" + filename).toURI());
	}
}
