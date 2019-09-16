package selenium_Holidays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rickyjindal999@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kunal@16");
	//	driver.findElement(By.id("u_0_3")).click();
		
	
	
	// ExecuteSript -- to execute JavaScirpt code method is available 
	
	WebElement ele = driver.findElement(By.xpath("//input[@value='Log In']"));
	flash(ele, driver);
	drawborder(ele, driver);
	generateAlert(driver, "There is an issue with login button on login page");
	clickElementBy(ele, driver);
	driver.navigate().refresh();// To refresh the page
	
	}	
	public static void flash(WebElement element,WebDriver driver)throws InterruptedException
	{
		JavascriptExecutor js	=((JavascriptExecutor)driver);
		String bgcolor =element.getCssValue("backgroundColor");
		for(int i = 0;i<10;i++)
		{
			changecolor("rgb(0,200,0)", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}

	public static void changecolor(String color,WebElement element,WebDriver driver) throws InterruptedException {
		JavascriptExecutor js	=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundColor =' "+ color +"'", element);
	
		Thread.sleep(5000);
		
	}
	
	
	public static void drawborder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js	=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.border='3px sloid red'", element);
	}
	
	
	public static void generateAlert(WebDriver driver,String msg)
	{
		JavascriptExecutor js	=((JavascriptExecutor)driver);
		js.executeScript("alert('"+msg+"')");
	}
	public static void clickElementBy(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js	=((JavascriptExecutor)driver);
		js.executeScript("argument[0].click();",element);
	}
	
	
	
}
