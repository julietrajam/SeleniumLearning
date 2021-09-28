package com.selenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		
		driver.get("http://www.leafground.com/pages/Calendar.html");


		WebElement calendar=driver.findElement(By.id("datepicker"));

		//calendar.sendKeys("09/10/2021");

		 calendar.click();


		WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));

		next.click();


		WebElement DateToBEGiven=driver.findElement(By.xpath("//a[contains(text(),'10')]"));

		DateToBEGiven.click();
		
	}

}
