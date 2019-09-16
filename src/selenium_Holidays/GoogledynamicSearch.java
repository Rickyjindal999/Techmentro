package selenium_Holidays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogledynamicSearch {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		
		System.out.println(list.size());
		
		for (int i = 0;i<list.size();i++)
		{
			String s=list.get(i).getText();
			System.out.println(s);
			
			if (list.get(i).getText().contains("testing life cycle"));
			{
				list.get(i).click();// if get
				break;
			}
		}

	}

}
