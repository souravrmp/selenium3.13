package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/vinaya/SeleniumLatest/exefiles/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int totalrow = rowcount.size();
		//System.out.println(totalrow);

		for (int i = 1; i <=totalrow; i++) 
		{
			List<WebElement> colcount = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
			int totalcol = colcount.size();
			//System.out.println(totalcol);

			for (int j = 1; j <=totalcol; j++) 
			{
				String xp = "//table[@id='customers']//tr["+i+"]/td["+j+"]";
				String text = driver.findElement(By.xpath(xp)).getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		    Thread.sleep(2000);
//	        WebElement xp2 = driver.findElement(By.xpath("//div[@class='w3-panel w3-note'][1]"));
		    WebElement sc = driver.findElement(By.xpath("//div[@id='leftmenuinner']//a[text()='Keyboard Shortcuts']"));
            JavascriptExecutor je= (JavascriptExecutor)driver;
//            je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//            je.executeScript("arguments[0].scrollIntoView(true)",xp2);
              je.executeScript("arguments[0].scrollIntoView(true)", sc);
              driver.findElement(By.xpath("//div[@id='leftmenuinner']//a[text()='Keyboard Shortcuts']")).click();
              List<WebElement> stabrow = driver.findElements(By.xpath("//table[@class='w3-table-all notranslate'][1]//tr"));
              int stotalrw = stabrow.size();
               System.out.println(stotalrw);
	}

}
