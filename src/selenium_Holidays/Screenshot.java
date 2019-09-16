package selenium_Holidays;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		
		 driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		takeScreenShot("google");
	}

	public static void takeScreenShot(String fileName) throws IOException
	{
		// 1. Take screenshot and share it as a file format
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// 2. now copy the screenshot to desired loaction using copy file mehtod:
		FileUtils.copyFile(file, new File("C:\\Users\\i B M\\Desktop\\Selenium"+fileName+".jpg"));
		
		
	}
	
	
}
