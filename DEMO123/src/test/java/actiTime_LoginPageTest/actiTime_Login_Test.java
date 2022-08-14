package actiTime_LoginPageTest;
import static Utility.StartUp1.init_prop;
import static Utility.StartUp1.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actiTime_Main.ActiTime_Task;
public class actiTime_Login_Test {


	public void Verify(WebDriver driver)
	{
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passName =driver.findElement(By.xpath("//*[@name='pwd']"));
		WebElement click = driver.findElement(By.id("loginButton"));
		System.out.println("userName = " + userName.isDisplayed());
		System.out.println("passName = " + passName.isDisplayed());
		System.out.println("click button  = " +click.isDisplayed());
	}
	public void Login(WebDriver driver) throws Exception
	{
		/*launch url
		enter user name
		enter password
		click on Login Button*/
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(init_prop().getProperty("name"));
		driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys(init_prop().getProperty("pass"));
		driver.findElement(By.id("loginButton")).click();
	}
	public void tab(WebDriver driver) throws Exception
	{
		List<WebElement> tab = driver.findElements(By.xpath("//*[contains(@class,'navItem navCell relative ')]"));
		if(tab.get(0).isEnabled())
		{
			System.out.println("Selected tab = " + tab.get(0).getText());
		}
		for(int i = 0;i<tab.size();i++)
		{
			System.out.println("Tab =" +i+"   " +tab.get(i).getText());
		}
	}
	public void  task(WebDriver driver) throws Exception
	{
		ActiTime_Task task = new ActiTime_Task(driver);
		 task.taskclick().click();
	
		 for(int i = 0;i<=2;i++)
		 {
				 task.newUser().click();
				 task.newCustomer().click();
				 task.nameField().sendKeys(excel(i,0));
				 task.descriptionField().sendKeys(excel(i,1));
				 task.Create().click();
				 Thread.sleep(3000);
				System.out.println(task.getText().getText());
				
		 }
		 
		 System.out.println("done ");
		
		
	}
	public static void main(String[] args) throws Exception {
	
		WebDriver driver = startup(init_prop().getProperty("bname"),init_prop().getProperty("url"));
		actiTime_Login_Test obj = new actiTime_Login_Test();
		obj.Verify(driver);
		obj.Login(driver);
		Thread.sleep(3000);
		obj.tab(driver);
		Thread.sleep(3000);
		obj.task(driver);
		//driver.close();
	}
}