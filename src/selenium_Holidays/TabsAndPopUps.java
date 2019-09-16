package selenium_Holidays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndPopUps {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//img[@align='center']")).click();
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/p[3]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click here')]"));
		System.out.println(driver.getTitle());
		
		
		
	}

}
