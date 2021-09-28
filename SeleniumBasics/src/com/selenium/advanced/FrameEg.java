package com.selenium.advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println("Test inside tag:"+text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> framecount = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames: "+framecount.size());
	}

}
