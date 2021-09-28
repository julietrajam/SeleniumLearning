package com.selenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://www.leafground.com/pages/drop.html");
       
       WebElement s=driver.findElement(By.id("draggable"));
       WebElement d=driver.findElement(By.id("droppable"));
       
       Actions acc=new Actions(driver);
      // acc.clickAndHold(s).moveToElement(d).release(d).build().perform();
       acc.dragAndDrop(s, d).build().perform();
		
	}

}
