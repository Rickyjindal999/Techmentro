package selenium_Holidays;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		
		// How many type of pop ups we have
		//1. Alerts = java scripts pop up are there -- Alerts API (accept ,dismiss)
		//2. File upload pop up -- Broswer Button (type = file, sendkeys(path))
		//3. Browser window  pop up - Advertisement method (Window Hanlder API- getwindowHandler())
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		Thread.sleep(3000);
		
		Set<String> handlers = driver.getWindowHandles();
		
		Iterator<String> it = handlers.iterator(); // this set reference  (handlers) will give us one iterator methods
		String parent =it.next();
		
		//System.out.println("Parent windows id "+parent);
		
		String child= it.next();
		//System.out.println("Child window id"+child);
		
		driver.switchTo().window(child);
		
		Thread.sleep(3000);
		System.out.println("child window popup titl"+ driver.getTitle());
		
		driver.close();// it close the child window
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		System.out.println("Parent window title"+driver.getTitle());
		
		
		driver.close();
	}

}
