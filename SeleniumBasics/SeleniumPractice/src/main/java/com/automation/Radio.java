package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radio {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/radio.html");
			
			WebElement uncheckedinradio2 = driver.findElement(By.xpath("//input[@name='news']"));
			WebElement age = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
	
			Boolean unchecked=uncheckedinradio2.isSelected();
			System.out.println("Is Radio Box Checked:"+unchecked);
			
			Boolean checked=age.isSelected();
			System.out.println("Is Radio Box Checked:"+checked);
			
			WebElement enjoyclass=driver.findElement(By.xpath("//input[@id='no']"));
			enjoyclass.click();
			
			WebElement uncheckedinradio = driver.findElement(By.xpath("//input[@name='news']"));
			uncheckedinradio.click();
			
			WebElement above40=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
			above40.click();
			
			
		
		}

	}


