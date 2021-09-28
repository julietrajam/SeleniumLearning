package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='sbq']"));
		searchbox.sendKeys("Rohan"+Keys.ENTER);
		
		WebElement res=driver.findElement(By.xpath("//body[@id='ysch']"));
		res.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
