package selenium_Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdispaly {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1. isDisplayed() method applicable fot all the elements 
		
		boolean b = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();// for submit button
		System.out.println(b); // true 
		
		//2. isEnable() Method
		
		
		boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b1);
	
		//3. isSelected () is applicable for checkbox, dropdown , radiobutton
		// if there is check box i accept terms and conditions then submit button is enable.These kind of
		// example we can give at the time of interview.
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		boolean b2 = driver.findElement(By.xpath("//input[@name='sex']")).isSelected();
		System.out.println(b2);
		
	}

}
