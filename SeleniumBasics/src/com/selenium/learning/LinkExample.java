package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
//	    WebElement link=driver.findElement(By.linkText("Go to Home Page"));
//	    link.click();
//	    
	    //Partial Link Text
	    
	    WebElement link=driver.findElement(By.partialLinkText("Go"));
	    link.click();
		
		
	}

}
