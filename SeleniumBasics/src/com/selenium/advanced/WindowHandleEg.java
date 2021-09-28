package com.selenium.advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//Store the Parentwindow
		String oldwindow=driver.getWindowHandle();
		
		WebElement firstbutton=driver.findElement(By.id("home"));
		firstbutton.click();
		
		//Strore all windows.Since user is not aware of the windows in particular app using Set
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String newwindow : allwindows) {
			
			driver.switchTo().window(newwindow);
		}
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a"));
		button.click();
		
		driver.close();
		
		//Switch to Parent Window
		driver.switchTo().window(oldwindow);
		
        WebElement multiwindow =driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
        multiwindow.click();
        
        //to return the number of windows
        int numwindow=driver.getWindowHandles().size();
        System.out.println("Number of Windows opened:"+numwindow);
        
        WebElement dontcloseme=driver.findElement(By.id("color"));
        dontcloseme.click();
        
        Set<String>secallwindows=driver.getWindowHandles();
        
        for (String everywindow : secallwindows) {
        	if(!everywindow.equals(oldwindow))
        	{
        		driver.switchTo().window(everywindow);
        		driver.close();
        	}
		}
	}

}
