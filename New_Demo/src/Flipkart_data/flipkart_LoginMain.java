package Flipkart_data;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class flipkart_LoginMain {
	WebDriver driver;	
	public flipkart_LoginMain(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement cross()
	{
		WebElement cross = driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']"));
		return cross;
	}
	public WebElement search()
	{
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		return search;
	}
	public List<WebElement> product_name()
	{
		List<WebElement> search = driver.findElements(By.xpath("//*[@class='_4rR01T']"));
		return search;
	}
	public List<WebElement> product_price()
	{
		List<WebElement> search = driver.findElements(By.xpath("//*[@class='_30jeq3 _1_WHN1']"));
		return search;
	}
	public WebElement s_size()
	{
		WebElement search = driver.findElement(By.xpath("//*[@class='ge-49M _2Kfbh8']"));
		return search;
	}
	//*[contains(@class,'ge-49M ')]
	
	public WebElement next()
	{ 	
		driver.navigate().refresh();
		WebElement cross = driver.findElement(By.xpath("//span[text()='Next']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(cross));
		return cross;
	}
}
