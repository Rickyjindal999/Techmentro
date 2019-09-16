package selenium_Holidays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select sel = new Select(month_dropdown);
		
		
		List<WebElement> list =sel.getOptions();
		System.out.println(list.size());
		
		
		for (int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
	}

}
