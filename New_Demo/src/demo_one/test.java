package demo_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Flipkart_data.Utility;
import Flipkart_data.flipkart_LoginMain;

public class test {
	public static void main(String[] args) {
		System.out.println("start the code............");
		Utility base = new Utility();
		String url = "https://www.flipkart.com/";
		WebDriver driver = base.startup("ch", url);
		flipkart_LoginMain te = new flipkart_LoginMain(driver);
		te.cross().click();
		te.search().sendKeys("iphone");
		te.search().sendKeys(Keys.ENTER);
		List<WebElement> search1 = driver.findElements(By.xpath("//*[@class='_4rR01T']"));
		int a = search1.size();
		System.out.println(a);
		driver.close();
	}
	
	
}
