

import org.openqa.selenium.chrome.ChromeDriver;

public class input_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver",
			"//home/icliniq-n7/Documents/selenium/chromedriver_linux64/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/edit");
	}

}
