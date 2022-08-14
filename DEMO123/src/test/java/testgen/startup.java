package testgen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class startup {
	//generic method
	WebDriver driver;
	public WebDriver invoke_driver(String url)
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(url);
		 return driver;
	}
	public String  id(String id)
	{
		WebElement ele = driver.findElement(By.id(id));
		String str = ele.getText();
		return str;
	}
	

}
