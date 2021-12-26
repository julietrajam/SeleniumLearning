package com.automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
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
		
		Thread.sleep(3000);
		
		WebElement line=driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		line.click();
		
		Alert a4=driver.switchTo().alert();
		a4.accept();
		
		
		
	
	WebElement sweet=driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(sweet));
	
    sweet.click();
		
		Alert a5=driver.switchTo().alert();
		a5.accept();
		
		
		
		
	}

}
