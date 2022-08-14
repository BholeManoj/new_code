package Mock;

import static Utility.StartUp1.init_prop;
import static Utility.StartUp1.startup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practice {

	public static void main(String[] args) throws Exception {
		WebDriver driver = startup(init_prop().getProperty("bname"),init_prop().getProperty("url"));
	List<WebElement> li = (List<WebElement>) driver.findElement(By.xpath("//input[@id='username']")).findElement(By.xpath("//*[@name='pwd']")).findElement(By.id("loginButton"));
								System.out.println(li.size());
								

	}

}
