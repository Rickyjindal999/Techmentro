package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","L:\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		 String tilte = driver.getTitle();
		 
		 System.out.println(tilte);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.close();
		

	}

}
