package selenium_Holidays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=radio+button");
		List<WebElement> radio	=	driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		System.out.println(radio.size());
		
		for (int i=0;i<radio.size();i++)
		{
			WebElement radio1=radio.get(i);
			
			
		String value= radio1.getAttribute("value");
		System.out.println(value);
		
		if (value.equalsIgnoreCase("Ruby"))
		{
			radio1.click();
			break;
		}
		}
		List<WebElement> checkbox	=	driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		for (int i=0;i<checkbox.size();i++)
		{
			WebElement check1 = checkbox.get(i);
			String id = check1.getAttribute("id");
			if (id.equalsIgnoreCase("code"))
			{
				check1.click();
				break;
			}
		}
	}

}
