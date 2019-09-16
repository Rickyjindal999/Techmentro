package selenium_Holidays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int count =list.size();
		System.out.println(count);

		
		for (int i=0;i<count;i++)
		{
			WebElement ele1=list.get(i);
			String text=ele1.getText();
			System.out.println(text);
			
			if (text.equalsIgnoreCase("Appium"))
			{
				ele1.click();
				break;
			}
		}

	}

}
