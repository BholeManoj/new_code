package actiTime_Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class ActiTime_Task {
	/*Step 1 click on Task Button
	 * Step 2 click on Add new User
	 * 
	 */
	WebDriver driver;
	public ActiTime_Task(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//method 1 for executation 
	By click = By.xpath("//div[text()='TASKS']");
	public WebElement taskclick()
	{
		return driver.findElement(click);
	}
	//step 2
	By newUser = By.xpath("//*[@class='addNewContainer']");
	public WebElement newUser()
	{
		return driver.findElement(newUser);
	}
	//step 3
	By newCustomer = By.xpath("//*[contains(@class,'createNewCustomer')]");
	public WebElement newCustomer()
	{
		return driver.findElement(newCustomer);
	}
	//step 4
	By nameField = By.xpath("//*[@id='customerLightBox_nameField']");
	public WebElement nameField()
	{
		return driver.findElement(nameField);
	}
	//step 5
	By descriptionField = By.xpath("//*[@id='customerLightBox_descriptionField']");
	public WebElement descriptionField()
	{
		return driver.findElement(descriptionField);
	}
	//step 6
	By Create = By.xpath("//span[text()='Create Customer']");
	public WebElement Create()
	{
		return driver.findElement(Create);
	}
	//step 7
		By getText = By.xpath("//*[@class='innerHtml']");
		public WebElement getText()
		{
			return driver.findElement(getText);
		}
		//div[@class='filteredContainer']//div[@class='editButton available']
		//step 8
				By sendDelete = By.xpath("(//input[@placeholder='Start typing name ...'])[1]");
				public WebElement sendDelete()
				{
					return driver.findElement(sendDelete);
				}


}