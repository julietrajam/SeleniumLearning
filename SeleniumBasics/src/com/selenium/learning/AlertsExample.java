
       	package com.selenium.learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement normalalert=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		normalalert.click();
		
		Alert a1=driver.switchTo().alert();
		Thread.sleep(4000);
		a1.accept();
		
		WebElement confirmalert=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmalert.click();
		
		Alert a2=driver.switchTo().alert();
		Thread.sleep(4000);
		a2.dismiss();
		
		WebElement promptalert=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptalert.click();
		
		Alert a3=driver.switchTo().alert();
		a3.sendKeys("Juls");
		a3.accept();
		
	}
}
