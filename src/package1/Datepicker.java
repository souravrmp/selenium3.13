package package1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebElement xp = driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		xp.clear();
		xp.sendKeys("NEWDELHI");

		WebElement xp1 = driver.findElement(By.xpath("//input[@id='hp-widget__sTo']"));
		Thread.sleep(2000);
		xp1.sendKeys("Bangalore");

		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();

		Thread.sleep(2000);

		String next = "//div[@class='dateFilter hasDatepicker']//span[text()='Next']";
		driver.findElement(By.xpath(next)).click();
		Thread.sleep(2000);
		String xp3 = "//div[@class='dateFilter hasDatepicker']//span[text()='December']/../../..//a[text()='16']";
         Thread.sleep(2000);
		while (true) {
			try {
				driver.findElement(By.xpath(xp3)).click();
                     break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath(next)).click();
			}
		}
	}
}
