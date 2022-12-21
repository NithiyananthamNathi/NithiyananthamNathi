import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button_handling {
	
	@Test
	public  void btnhandle() {
		System.setProperty("webdriver.chrome.driver",
				"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		
		//Goto Home and come back here using driver command
		driver.findElement
		(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		
		String buttonpage = driver.getCurrentUrl();
		driver.findElement(By.id("home")).click();;
		driver.navigate().back();
		
		//Get the X & Y co-ordinates
		WebElement posi = driver.findElement(By.id("position"));
		Point point = posi.getLocation();
		System.out.println(point);
		int x = posi.getLocation().x;
		
		int y = posi.getLocation().y;
		System.out.println( x + y);   //("x :" + x) + (" Y  :" + y)
		System.out.println(y); 

		

		//Find the color of the button
		
		//Find the height & width of the button
		WebElement size = driver.findElement(By.id("property"));
//		org.openqa.selenium.Rectangle siz = size.getRect();
		Rectangle siz = size.getRect(); 
		int a = siz.getHeight();
		int b = siz.getWidth();
		System.out.println("height >"+ a +" Width >" + b);
		
		
		//Confirm button is disabled

		//Click and Hold Button
		WebElement hold =driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
		Actions hold1 = new Actions(driver);
		hold1.clickAndHold(hold).build().perform();
		driver.quit();
			
		
	}
}
