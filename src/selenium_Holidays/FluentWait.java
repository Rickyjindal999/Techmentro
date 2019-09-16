package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		
		boolean status =driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();
		
		
		
		
		/*if (status)
		{
			System.out.println("Element is present");
		}
		else 
		{
			System.out.println("Element is not there");
		}*/
	}

}
