package Mock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.StartUp1;
public class rightClickAction {
	 public  void onRightClick(WebDriver driver)
	 {
		 WebElement src1=driver.findElement(By.id("draggable"));
		 Actions act=new Actions(driver);
		 act.contextClick().perform();
		System.out.println(".............program ends........");
	 }
	public static void main(String[] args) {
		System.out.println(".............program starts........");
		StartUp1 obj = new StartUp1();
		String url="https://demoqa.com/droppable";
		 WebDriver driver = obj.startup("ch",url);
		 rightClickAction ob = new rightClickAction();
		 ob.onRightClick(driver);	
	}
		
		
	

}
