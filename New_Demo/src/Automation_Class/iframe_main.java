package Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe_main {
	 WebDriver  driver = null;
	public  WebElement iframe(WebDriver  driver)
	{
		WebElement ifm = driver.findElement(By.id("frame1"));
		return ifm;
	}
	public WebElement getText1(WebDriver  driver)
	{
		WebElement gettext1 = driver.findElement(By.id("sampleHeading"));
		return gettext1;
	}
	public   WebElement iframe2(WebDriver  driver)
	{
		WebElement ifm = driver.findElement(By.id("frame2"));
		return ifm;
	}
	public WebElement getText2(WebDriver  driver)
	{
		
		WebElement gettext2 = driver.findElement(By.id("sampleHeading"));
		return gettext2;
	}

}
