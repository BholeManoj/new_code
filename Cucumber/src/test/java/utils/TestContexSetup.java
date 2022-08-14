package utils;

import org.openqa.selenium.WebDriver;

import PageObject.LogIn;
import PageObject.PageObjectManger;

public class TestContexSetup {

	public WebDriver driver;
	public LogIn login;
	public PageObjectManger pageobj;
	public TestBase testbase;
	
	public TestContexSetup() throws Exception {
		
		testbase = new TestBase();
		pageobj = new PageObjectManger(testbase.startUp());
		
	}
	
}
