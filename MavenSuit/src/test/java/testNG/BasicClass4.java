package testNG;
import static Utility.StartUp1.init_prop;
import static Utility.StartUp1.startup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class BasicClass4 {
	//@Test(priority = 1)
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
	@Test (dataProvider ="om"  )
	public void Login(String uname , String pname) throws Exception
	{
		WebDriver driver = startup(init_prop().getProperty("bname"),init_prop().getProperty("url"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys(pname);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
@DataProvider(name = "om")
	public Object [] [] logindata() throws Exception
	{
		
		FileInputStream fis = new FileInputStream("D:\\March_Batch\\MavenSuit\\Excel\\assign.xlsx");
		//Create workbook object by using workbookfacory
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("EMDATA");
		Object [] [] ar = new Object [s1.getLastRowNum()+1] [2] ;
		System.out.println(s1.getRow(0).getLastCellNum());
		for(int i= 0;i<=s1.getLastRowNum();i++)
		{
			for(int j = 0 ; j<s1.getRow(i).getLastCellNum();j++)
			{
				ar [i][j] = s1.getRow(i).getCell(j).getStringCellValue();
			}
		}
return ar;
	}
}