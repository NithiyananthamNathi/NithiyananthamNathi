import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		//full window screenshot
//		File srn1 = driver.getScreenshotAs(OutputType.FILE);
//		File src1 = new File("//home/icliniq-n7/Downloads/image3.png");
//		FileHandler.copy(srn1, src1);
		
		File srn3 =  driver.getScreenshotAs(OutputType.FILE);
		File srn4 = new File("//home/icliniq-n7/Downloads/image3.png");
		FileHandler.copy(srn3, srn4);
		
		WebElement new1 = driver.findElement(By.xpath("//div[@class='card-content']"));
		File srn2 = new1.getScreenshotAs(OutputType.FILE);
		File src2 = new File("//home/icliniq-n7/Downloads/image4.png");
		FileHandler.copy(srn2, src2);
		Actions act = new Actions(driver);
		
	
		
		
		
		
//		WebElement name1 = driver.findElement(By.id("fullName"));
//		name1.getScreenshotAs(OutputType.FILE)

		
	}

}
