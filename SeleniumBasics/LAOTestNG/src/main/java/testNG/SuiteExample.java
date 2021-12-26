package testNG;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExample {
	
	public ChromeDriver driver;
	public long startTime,endTime,totalTime;

	@BeforeSuite
	public void launchBrowser()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	startTime=System.currentTimeMillis();
	}
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void openFacebook()
	{
		driver.get("https://www.Facebook.com/");
		
	}
	
	@Test
	public void openTwitter()
	{
		driver.get("https://www.twitter.com/");
		
	}
	
	@AfterSuite
	public void quitBrowser()
	{
		driver.quit();
		endTime=System.currentTimeMillis();
		totalTime=endTime-startTime;
		System.out.println("Total Time:"+totalTime);
	}
	
	
	
	
}
