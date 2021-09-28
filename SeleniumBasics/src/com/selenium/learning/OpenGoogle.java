package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']") );
		
		search.sendKeys("Juliet");
		
		//to press Enter Key search.sendKeys("Juliet"+Keys.ENTER);
		
		search.submit();
		
		//driver.quit();
		
	}

}
