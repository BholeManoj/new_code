package actiTime_Test;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import actiTimeUtility.actUtility;
import actiTime_main.actiTimeMain;
public class actiTimeTest {
	private Properties prop;
	public WebDriver driver ;
	@BeforeSuite
	public void getProperties() throws Exception
	{
		actUtility obj = new actUtility();
		prop = obj.init_prop();
	}
	@BeforeSuite
	public void initBrowser() throws Exception
	{
		actUtility obj = new actUtility();
		String bName = prop.getProperty("bName");
		String url = prop.getProperty("url");
		WebDriver driver =obj.startup(bName, url);
		this.driver =driver;
	}
	@Test
	public void loginTC() throws Exception
	{
		actiTimeMain ob = new actiTimeMain(driver);
		actUtility obj = new actUtility();
		ob.username(obj.get_config_reader("uName"));
		System.out.println("one");
		System.out.println(obj.get_config_reader("uName"));
	}
}
