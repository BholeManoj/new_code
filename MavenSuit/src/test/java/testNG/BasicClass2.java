package testNG;
import static Utility.StartUp1.init_prop;
import static Utility.StartUp1.startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class BasicClass2 {
	@Test(priority = 1)
	public void Verify() throws Exception
	{
		WebDriver driver = startup(init_prop().getProperty("bname"),init_prop().getProperty("url"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passName =driver.findElement(By.xpath("//*[@name='pwd']"));
		WebElement click = driver.findElement(By.id("loginButton"));
		System.out.println("userName = " + userName.isDisplayed());
		System.out.println("passName = " + passName.isDisplayed());
		System.out.println("click button  = " +click.isDisplayed());
		driver.close();	
	}
	
	@Test (invocationCount =2 , dataProvider ="logindata"  ,threadPoolSize = 2 )
	public void Login(String uname , String pname) throws Exception
	{
		WebDriver driver = startup(init_prop().getProperty("bname"),init_prop().getProperty("url"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys(pname);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
@DataProvider
	public Object [] [] logindata()
	{
		Object [] [] ar = new Object [3] [2] ;
		ar[0] [0] = "admin";
		ar[0] [1] ="manager";
		ar[1] [0] = "admin1";
		ar[1] [1]  ="manager1";
		ar[2] [0] = "admin2";
        ar[2] [1]  ="manager2";
        return ar;
	}

}
