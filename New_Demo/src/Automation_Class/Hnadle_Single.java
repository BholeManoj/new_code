package Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.StartUp1;

public class Hnadle_Single {
	public void newtab(WebDriver driver)
	{
		driver.findElement(By.id("messageWindowButton")).click();
	}
	public static void main(String[] args) {
		StartUp1 obj = new StartUp1();
		String url  = 	"https://demoqa.com/browser-windows";
		WebDriver driver  = obj.startup("ch", url);
		Hnadle_Single test =  new Hnadle_Single();
		test.newtab(driver);
		obj.singlewindows(driver);//generic for windpw handle
		WebElement s1 = driver.findElement(By.xpath("/html/body"));
		System.out.println(s1.getText());
	}
}
