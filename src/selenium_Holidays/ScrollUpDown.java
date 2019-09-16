package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement web = driver.findElement(By.xpath("//a[@class='fusion-link-wrapper']"));
		
		js.executeScript("argument[0].scrollIntoview(true)", web);

	}

}
