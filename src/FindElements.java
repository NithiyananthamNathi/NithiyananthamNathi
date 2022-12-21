import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		int tatal = labels.size();
		
		System.out.println(tatal);
		
		for (WebElement webElement : labels) {
			System.out.println( webElement.getText());

		}
		
		if (labels.get(tatal) != null) {
			System.out.println("success");
		}
		else
			System.out.println("Fail");
		driver.quit();
	}

	

}
