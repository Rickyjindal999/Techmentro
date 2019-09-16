package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select sel = new Select(month_dropdown);
		
		// it will select march
		sel.selectByIndex(3);
		
		
		Thread.sleep(3000);
		
		// It will select oct
		sel.selectByValue("10");
		
		Thread.sleep(3000);
		
		// It will select jun
		sel.selectByVisibleText("Jun");
	}

}
