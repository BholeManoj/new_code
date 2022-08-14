package actiTime_main;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeMain {
	WebDriver driver;
	public actiTimeMain(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	
	public void username(String uname ) throws Exception
	{
		username.sendKeys(uname);
	}
}
