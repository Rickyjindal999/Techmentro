package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		
		
		// 1 . id : is a unique locator
		//WebElement username = driver.findElement(By.id("login-username"));
		// username.sendKeys("gupta.sahil1990");
		// WebElement nextbtn = driver.findElement(By.id("login-signin"));
		// nextbtn.click();
		
		
		
		//driver.findElement(By.id("login-username")).sendKeys("gupta.sahil1990");
		//driver.findElement(By.id("login-signin")).click();
		
		
		// 2. Name : is a unique name lcator 
		
		//driver.findElement(By.name("username")).sendKeys("gupta.sahil1990");
		//driver.findElement(By.name("signin")).click();
		
		// 3. X-Path

		
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("gupta.sahil1990");
		//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		//4. cssselector
		
		//driver.findElement(By.cssSelector("#login-username")).sendKeys("gupta.sahil1990");
		//driver.findElement(By.cssSelector("#login-signin")).click();
		
		
		// 5. Linktext : only for links
		
		//driver.findElement(By.linkText("Trouble signing in?")).click();
		
		// 6. partialLinkTest : only for links but not recommended 
		// In that we can only pass partial text 
		
		// 7. Class name : can  be duplicate 
		
		
		driver.findElement(By.className("phone-no")).sendKeys("gupta.sahil1990");
	
		
		
	}

}
