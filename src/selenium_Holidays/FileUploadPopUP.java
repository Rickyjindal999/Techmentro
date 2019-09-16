package selenium_Holidays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		
		// Type "file " should be present for browser /attached file / upload file buttons
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\i B M\\Desktop\\dajhk.txt");
		
		
	
	}

}
