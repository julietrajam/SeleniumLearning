package com.selenium.advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//Switching into first frame
		driver.switchTo().frame(0);
		
		WebElement button=driver.findElement(By.id("Click"));
		button.click();
		
		String text=driver.findElement(By.id("click")).getText();
		System.out.println("Text inside the button: "+text);
		
		
		//Switching to default content
		driver.switchTo().defaultContent();
		
		//Switching inside nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		//Clicking the clickMe button
		 driver.findElement(By.id("Click1")).click();
		 
		 driver.switchTo().defaultContent();
		
		  List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		  System.out.println("No of Frames:"+noOfFrames.size());
	
	}

}
