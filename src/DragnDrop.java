import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class DragnDrop {

	@Test
	public  void draganddrop() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		
		
		
		// drag and drop
//		driver.switchTo().frame(0);
//	
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		
		Actions builder = new Actions(driver);
//		builder.dragAndDrop(source, target).build().perform();
//		
//		Thread.sleep(2000);
		driver.get("https://letcode.in/draggable");
		
		WebElement source1 = driver.findElement(By.xpath("//div[@cdkdragboundary='.example-boundary']"));
		int X = source1.getLocation().getX();
		int Y = source1.getLocation().getY();
		System.out.println(X);
		System.out.println(Y);
//		Thread.sleep(2000);
		builder.dragAndDropBy(source1, 200, 200).build().perform();
		//builder.clickAndHold(source1).dragAndDropBy(source1, 200, 300).build().perform();
		//builder.release().perform();
				
		driver.quit();
	}

}
