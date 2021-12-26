package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		 WebElement source=driver.findElement(By.id("draggable"));
		 WebElement dest=driver.findElement(By.id("droppable"));
		 
		 Actions acc=new Actions(driver);
		 
		 //acc.clickAndHold(source).moveToElement(dest).release(dest).build().perform();
		 
		 acc.dragAndDrop(source, dest).build().perform();
		
	}

}
