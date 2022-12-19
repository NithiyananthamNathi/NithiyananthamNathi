import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();

		//Enter your full Name
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.id("fullName")).sendKeys("Nithiyanantham");
		//Append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" Guy");
		//What is inside the text box
		String values = driver.findElement(By.id("getMe")).getAttribute("Value");
		System.out.println(values);
		//Clear the text
		driver.findElement(By.id("clearMe")).clear(); 
		//Confirm edit field is disabled
		Boolean text = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(text);

		//Confirm text is read only
		String read = driver.findElement(By.id("dontwrite")).getAttribute("Readonly");
		System.out.println(read);

		//quit browser
		driver.quit();



	}

}
