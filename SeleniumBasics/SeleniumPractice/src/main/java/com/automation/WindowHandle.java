package com.automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		
		WebElement openHome=driver.findElement(By.id("home"));
		openHome.click();
		
		Set<String> winSet=driver.getWindowHandles();
		List<String> winList=new ArrayList<String>(winSet);
		
		driver.switchTo().window(winList.get(1)).close();
		
		driver.switchTo().window(oldWindow);
		
		Thread.sleep(5);
		WebElement openMulti=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		openMulti.click();
		
//		Set<String> winSet1=driver.getWindowHandles();
//		List<String> winList1=new ArrayList<String>(winSet1);
//		
//		driver.switchTo().window(winList1.get(0));
		
		driver.switchTo().window(oldWindow);
		
		Thread.sleep(5);
		WebElement dontClose=driver.findElement(By.id("color"));
		dontClose.click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for (String everyWindow : allWindows) {
			
			if(!everyWindow.equals(oldWindow))
			{
				driver.switchTo().window(everyWindow).close();
			}
		}
		
		
		
		
		
		
				

	}

}
