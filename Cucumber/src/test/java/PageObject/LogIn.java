package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public WebDriver driver;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	   By username = By.xpath("//*[@id='txtUsername']");	
	   By password = By.xpath("//*[@id='txtPassword']");
	   By login = By.xpath("//*[@id='btnLogin']");
	   By spamMsg = By.xpath("//*[@id=\"spanMessage\"]");
	
	   public void username(String un)
	   {
		   driver.findElement(username).sendKeys(un);
	   }
	   public void password(String pass)
	   {
		   driver.findElement(password).sendKeys(pass);
	   }
	   public void login()
	   {
		   driver.findElement(login).click();
	   }
	   
	   public WebElement spamMsg()
	   {
		  return driver.findElement(spamMsg);
	   }
	
	   public String Title()
	   {
		   return driver.getTitle();
	   }
}
