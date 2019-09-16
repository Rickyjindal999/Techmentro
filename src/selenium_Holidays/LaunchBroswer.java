package selenium_Holidays;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBroswer {

	public static void main(String[] args) {
		
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");

	}

}
