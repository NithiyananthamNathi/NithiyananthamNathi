import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", 
				"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		//switch to frames
		WebElement ifram = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(ifram);
		Timeouts out =driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
		long tim = out.getPageLoadTimeout().toNanos();
		System.out.println(tim);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nathi");
		driver.findElement(By.xpath("//input[@name='lname']\n")).sendKeys("Nathi");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='lname']\n")).sendKeys(" Anand");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
		
		


		
	}

}
