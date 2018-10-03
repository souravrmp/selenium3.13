package package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		WebElement redio1 = driver.findElement(By.xpath("//input[@id='gi_oneway_label']"));

		boolean rb = redio1.isSelected();
		if (rb)// true
		{
			System.out.println("redio button is allready selected");
		}

		else {// false
			System.out.println("click on redio button");
			redio1.click();
		}
		 WebElement src = driver.findElement(By.id("gosuggest_inputSrc"));
		 src.sendKeys("Bangalore");
		 Thread.sleep(2000);
		 src.sendKeys(Keys.ARROW_DOWN);
		 src.sendKeys(Keys.ENTER);
		 
		WebElement des = driver.findElement(By.id("gosuggest_inputDest"));
		des.sendKeys("Delhi");
		Thread.sleep(2000);
		des.sendKeys(Keys.ARROW_DOWN);
		des.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[starts-with(text(),'October')]/..//div[text()='20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pax_label")).click();
		Thread.sleep(2000);
		WebElement addmember = driver
				.findElement(By.xpath("//span[text()='Adults']/../..//button[@id='adultPaxPlus']"));
		for (int i = 1; i < 4; i++) {
			addmember.click();
		}
		driver.findElement(By.xpath("//a[@id='pax_close']")).click();
		driver.findElement(By.xpath("//button[text()='Get Set Go']")).click();
		Thread.sleep(5000);
		WebElement pri = driver.findElement(By.xpath("//span[text()='Price']"));
//		WebElement time = driver.findElement(By.xpath("//span[text()='Time']"));
//		WebElement air = driver.findElement(By.xpath("//span[text()='Airlines']"));
    	
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		System.out.println("action");
		act.moveToElement(pri).perform();

	}
}
