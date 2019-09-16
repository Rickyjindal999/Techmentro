package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		String before = "//*[@id='customers']/tbody/tr[";
		String after ="]/td[1]";
		
		for (int i=2;i<=7;i++)
		{
			String actualXpath = before+i+after;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Ernst Handel"))
			{
				System.out.println(element.getText());
				break;
			}
		}
		System.out.println("****************************");
		
		String afterContact ="]/td[2]";
		
		for (int i=2;i<=7;i++)
		{
			String actualXpath = before+i+after;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		
		System.out.println("****************************");
		String Country ="]/td[3]";
		
		for (int i=2;i<=7;i++)
		{
			String actualXpath = before+i+after;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		
		
	}

}
