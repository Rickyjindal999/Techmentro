package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fire {

	public static void main(String[] args)   {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.co.in/");
		String title = driver.getTitle();
		title.length();
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("gupta.sahil161190@gmail.com");
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		button.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.)
		WebElement password = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		password.sendKeys("mncx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Wrong password. Try again or click Forgot password')]")).getText());
	}

}
