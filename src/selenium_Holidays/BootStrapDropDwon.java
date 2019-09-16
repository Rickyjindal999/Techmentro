package selenium_Holidays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDwon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://v4-alpha.getbootstrap.com/components/dropdowns/");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));

		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String data =list.get(i).getText();
			System.out.println(data);
			
			if(list.get(i).equals("Another action"))
			{
				list.get(i).click();
				break;
				
			}
			
		
		}
	}

}
