 package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("juliet.ramasamy@gmail.com");
		
		WebElement app = driver.findElement(By.xpath("//input[@value='Append ']"));
		app.sendKeys("Juls");
		
		WebElement textget = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		System.out.println(textget.getAttribute("value"));
		
		WebElement textclear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		textclear.clear();
		
		WebElement disabletextbox =driver.findElement(By.xpath("//input[@disabled='true']"));
	    Boolean enabled=disabletextbox.isEnabled();
		System.out.println("Textbox is enabled:"+enabled);

	}

}
