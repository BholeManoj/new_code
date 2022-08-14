package Automation_Class;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.StartUp1;
public class FileUpload {
	public static void main(String[] args) throws IOException, InterruptedException {
		StartUp1 obj=new StartUp1();
		String url="https://demoqa.com/automation-practice-form";
		WebDriver driver=obj.startup("ch",url);
		WebElement upload=driver.findElement(By.cssSelector("#uploadPicture"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", upload);
		upload.sendKeys("D:/March_Batch/MavenSuit/UploadFiles/Test1.txt");
	}
}