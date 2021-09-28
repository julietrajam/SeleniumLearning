package com.selenium.advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.io.ManagedSelector.Selectable;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		Actions acc=new Actions(driver);
		
		acc.keyDown(Keys.CONTROL).click(selectable.get(0))
								 .click(selectable.get(1))
								 .click(selectable.get(2)).build().perform();
		
		/* acc.clickAndHold(selectable.get(0))
		   .clickAndHold(selectable.get(1))
		   .clickAndHold(selectable.get(2)).build().perform(); */
		
		
		
		
		
	}

}
