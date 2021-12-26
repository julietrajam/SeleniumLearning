package com.automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Excel")).click();
		
		Thread.sleep(3000);
		
		File FileLocation=new File("C:\\Users\\seenuvas\\Downloads");
		
		File[] listFiles = FileLocation.listFiles();
		
		for (File file : listFiles) {
			
			if(file.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File downloaded");
				break;
			}
		}
		

	}

}
