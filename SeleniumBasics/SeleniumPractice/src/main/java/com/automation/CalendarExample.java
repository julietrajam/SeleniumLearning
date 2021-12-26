package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Calendar.html");


		WebElement calendar=driver.findElement(By.id("datepicker"));

		//calendar.sendKeys("09/10/2021"+Keys.ENTER);

		 calendar.click();

		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));

		next.click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement DateToBEGiven=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		DateToBEGiven.click();
		
	}

}
