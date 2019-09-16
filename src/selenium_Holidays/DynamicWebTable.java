package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("sahilg");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
		


	}

}
