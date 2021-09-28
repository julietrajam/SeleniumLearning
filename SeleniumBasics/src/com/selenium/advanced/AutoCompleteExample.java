package com.selenium.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement txtbox=driver.findElement(By.id("tags"));
		txtbox.sendKeys("s");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='ui-id-1\']/li"));
		
		for (WebElement webElement : elements) {
			
			if(webElement.getText().equals("Rest API"))
			{
				webElement.click();
		        break;
			
			}
		}
		
		
	}

}
