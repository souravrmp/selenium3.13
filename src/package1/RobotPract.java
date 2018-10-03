package package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotPract {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shopclues.com/");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//button[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']")).click();
		Point ele = driver.findElement(By.xpath("//a[@class='srch_action btn orange']")).getLocation();
//		int x = ele.getX();
//		int y = ele.getY();
//		System.out.println(x + " " + y);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("mobile");
		Thread.sleep(3000);
		Robot rw = new Robot();
		rw.mouseMove(ele.getX(),ele.getY());
		Thread.sleep(2000);
		rw.mousePress(InputEvent.BUTTON1_MASK);
		rw.mouseRelease(InputEvent.BUTTON1_MASK);

	}
}