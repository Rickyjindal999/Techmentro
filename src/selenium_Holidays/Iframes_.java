package selenium_Holidays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_ {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_boolean_expression1");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());

		for (int i =0;i<frames.size();i++)
		{
			System.out.println(frames.get(i).getAttribute("id"));
		}
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		// if we have to find how many iframs are there in web page
		
	
		driver.switchTo().window("");
		
	}

}
