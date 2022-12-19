import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class icliniq {
	public static void main(String[] args) {
		
		//Driver Setup
		System.setProperty("WebDriver.driver.Chromedriver",
				"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://devtest.icliniq.com/");
		
		//Click the Login
		driver.findElement(By.xpath("//*[@id=\"idBody\"]/header/div[4]/a[1]")).click();
		
		//Credentials
		driver.findElement(By.id("username")).sendKeys("3995");
	
		
		
		
		
		
	}

}
