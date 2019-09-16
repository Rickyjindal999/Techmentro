package selenium_Holidays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synctime {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Implicitly wait -- is always applied globally -- is available for all the webElements
		
		driver.get("https://www.facebook.com");
		WebElement firstName =driver.findElement(By.name("firstname"));
		WebElement lastName =driver.findElement(By.name("lastname"));
		WebElement MobileNumber =driver.findElement(By.name("reg_email__"));
		WebElement password =driver.findElement(By.name("reg_passwd__"));
		
		sendKeys(driver, firstName, 10, "Sahil");
		sendKeys(driver, lastName, 5, "Gupata");
		sendKeys(driver, MobileNumber, 4, "1234567");
		sendKeys(driver, password, 4, "123455");
		
		WebElement forgot = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgot, 5);
	
		// Here implicityly wait is overriding below
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

	
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
		
	}
	
}
