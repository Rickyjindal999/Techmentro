package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestLogin {

	public static String browser = "chrome";
	public static WebDriver driver; 
	
	public static void main(String[] args) {
		
		if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		System.setProperty("webdriver.gecko.driver","L:\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.co.in");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
	}

}
