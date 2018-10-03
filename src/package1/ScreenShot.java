package package1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot {
	public class CaptureScreenshot {
		WebDriver driver;
		@BeforeMethod
		public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		}
		@AfterMethod
		public void tearDown() throws Exception {
		driver.quit();
		}

		@Test
		public void test() throws IOException {
		// Code to capture the screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("/home/tyss/Desktop/sourav/screenshot/google.png"));
		}
		}
}
