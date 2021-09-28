package com.selenium.learning;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement btnposition=driver.findElement(By.id("position"));
		Point xypoint = btnposition.getLocation();
		System.out.println("Position of X:"+xypoint.getX());
		System.out.println("Position of Y:"+xypoint.getY());
		
		WebElement btncolor=driver.findElement(By.id("color"));
	    String color=btncolor.getCssValue("background-color");
	    System.out.println("Color of the button:"+color);
				
		WebElement btnsize=driver.findElement(By.id("size"));
		int hgt=btnsize.getSize().getHeight();
		int wdt=btnsize.getSize().getWidth();
		System.out.println("Height of the button:"+ hgt + "Weight of the button:" +wdt);
		
		WebElement btnhome=driver.findElement(By.id("home"));
		btnhome.click();
		
		

	}

}
