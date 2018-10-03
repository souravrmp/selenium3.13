package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("/home/tyss/Desktop/javabasic.odt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();


	}

}
