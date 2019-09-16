package selenium_Holidays;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CelenderSelectTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("sahilg");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Kunal@16");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		
		String date = "23-November-2018";
		String dateArr[]= date.split("-"); //(23,Novmber,2018)
		
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select.selectByVisibleText(year);
		
		//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		
		String before = "//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String After ="]/td[";
		
		final int totalweekdays = 7;
		
		
		boolean flag = false; 
		String dayval = null;
		for(int rowNum=2;rowNum<=7;rowNum++)
		{
			for(int colNum=1;colNum<=totalweekdays;colNum++)
			{
				try
				{
				 dayval = driver.findElement(By.xpath(before+rowNum+After+colNum+"]")).getText();
				}catch(NoSuchElementException e)
				{
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayval);
				if(dayval.equals(day))
				{
					driver.findElement(By.xpath(before+rowNum+After+colNum+"]")).click();
					flag=true;
					break;
				}
			
			}
		if (flag)
		{
			break;
		}
		
		
		}
}

}
