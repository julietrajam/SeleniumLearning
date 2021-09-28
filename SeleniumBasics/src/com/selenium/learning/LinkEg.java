package com.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
     	WebElement home=driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find where"));
		String where=whereToGo.getAttribute("href");
		System.out.println("This link is going to "+where);
		
		WebElement amIBroken=driver.findElement(By.partialLinkText("am I"));
		amIBroken.click();
		String pageTitle=driver.getTitle();
		if(pageTitle.contains("404"))
			System.out.println("Web Page is broken");
		else
			System.out.println("Web Page is not broken");
		
		
		driver.navigate().back();
		
		
		//Home Page
		
		WebElement home1=driver.findElement(By.linkText("Go to Home Page"));
		home1.click();
		
		driver.navigate().back();
		

	   //How many links are in web page	
	   List<WebElement> links= driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
		
		/*
		 * WebElement hyperLink=driver.findElement(By.linkText("HyperLink"));
		 * hyperLink.click();
		 */
		
		/*
		 * WebElement find=driver.findElement(By.partialLinkText("where am")); //
		 * find.click();
		 * 
		 * WebElement broken=driver.findElement(By.partialLinkText("am I")); //
		 * broken.click();
		 */			
		

	}

}
