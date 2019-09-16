package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		// When there is multiple frames we have to pass 0. (Naveen Automations)
		// If no farmes are available no need to write (driver.switchTo().frame(0);)
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
	}

}
