package com.selenium.advanced;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement link=driver.findElement(By.linkText("Download PDF"));
		link.click();
		
		/*
		 *
		 * // String oldwindow=driver.getWindowHandle(); // Set<String>
		 * allwindows=driver.getWindowHandles();
		 * 
		 * for (String currentwindow : allwindows)
		 * 
		 * { driver.switchTo().window(currentwindow); }
		 * 
		 * // WebElement
		 * notnow=driver.findElement(By.className("type-spectrum-Button-label translate"
		 * )); // notnow.click();
		 * 
		 * WebElement downloadicon =
		 * driver.findElement(By.xpath("//*[@id=\'icon\']/iron-icon"));
		 * downloadicon.click();
		 */
		
		
		Thread.sleep(2000);
		
		File Fileloc=new File("C:\\Users\\seenuvas\\Downloads");
		
	    File[] totalfiles=Fileloc.listFiles();
	    
	    for (File file : totalfiles) {
	    	
	    	if(file.getName().equals("testleaf.pdf"))
	    	{
	    		System.out.println("File is downloaded");
	    		break;
	    	}
			
		}

		}
	}


