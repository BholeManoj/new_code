package Automation_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.StartUp1;
public class iframe_Test {
	public iframe_main obj = new iframe_main();
	public void Iframe(WebDriver driver)
	{
		WebElement  id2 = obj.iframe(driver);
		driver.switchTo().frame(id2);
	}
	public void getText1(WebDriver driver)
	{
		String getText = obj.getText1(driver).getText();
		System.out.println(getText);
		driver.switchTo().defaultContent();
	}
	public void getText2(WebDriver driver)
	{
		WebElement  id2 = obj.iframe2(driver);
		driver.switchTo().frame(id2);
		String getText = obj.getText2(driver).getText();
		System.out.println(getText);
		driver.switchTo().defaultContent();
	}
	public static void main(String[] args) {
		StartUp1 obj = new StartUp1();
		String url  = 	"https://demoqa.com/frames";
		WebDriver driver  = obj.startup("ch", url);
		iframe_Test test = new iframe_Test();
		test.Iframe(driver);
		test.getText1(driver);
		test.getText2(driver);
	}

	
}
