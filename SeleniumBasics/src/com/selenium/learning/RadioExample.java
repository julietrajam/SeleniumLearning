package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement uncheckedinradio2 = driver.findElement(By.xpath("//input[@name='news']"));
		WebElement checkedradio3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		
		Boolean unchecked=uncheckedinradio2.isSelected();
		System.out.println("Is Radio Box Checked:"+unchecked);
		
		Boolean checked=checkedradio3.isSelected();
		System.out.println("Is Radio Box Checked:"+checked);
		
		WebElement enjoyclass=driver.findElement(By.xpath("//input[@id='no']"));
		enjoyclass.click();
		
		WebElement uncheckedinradio = driver.findElement(By.xpath("//input[@name='news']"));
		uncheckedinradio.click();
		
		WebElement above40=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
		above40.click();
		
		
				
		

	}

}
