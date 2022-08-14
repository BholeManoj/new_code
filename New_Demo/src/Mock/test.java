package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class test {

	public Actions Actionsdouble(WebElement ele,WebDriver driver) {
		Actions a = new Actions(driver);
		return a.doubleClick(ele);
	}
	public Actions rightClickBtn(WebElement ele,WebDriver driver) {
		Actions a = new Actions(driver);
		return a.contextClick(ele);
	}
	public Actions click(WebElement ele,WebDriver driver) {
		Actions a = new Actions(driver);
		return a.click();
	}
	public Actions drag(WebElement ele,WebElement ele1,WebDriver driver) {
		Actions a = new Actions(driver);
		return a.dragAndDrop(ele, ele1);
		//return a.dr
	}
}