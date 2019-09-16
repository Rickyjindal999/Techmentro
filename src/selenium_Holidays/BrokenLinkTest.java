package selenium_Holidays;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sahilg");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Kunal@16");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//.switchTo().frame("mainpnel");
		
		
		//1. To get list of all the links & images
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		ele.addAll(driver.findElements(By.tagName("img")));
		
		
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2.iterate link list : Exclude all the links/image-doesn't have any href attribute
		
		for(int i=0;i<ele.size();i++)
		{
			if(ele.get(i).getAttribute("href")!= null)
			{
				activeLinks.add(ele.get(i));
			}
		}

		System.out.println("Size of active links and images"  +activeLinks.size());
	}

}
