package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.xpath("//input[@id='u_0_p']"));
		username.sendKeys("sahil");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='u_0_r']"));
		lastname.sendKeys("Gupta");
		WebElement ph = driver.findElement(By.xpath("//input[@id='u_0_u']"));
		ph.sendKeys("123456789");
	
		

	}

}
