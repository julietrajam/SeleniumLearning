package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select s = new Select(dropdown1);
		s.selectByIndex(2);
		
		WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		Select s1=new Select(dropdown2);
		
		List<WebElement> allOptions=s1.getOptions();
		s1.selectByIndex(allOptions.size()-1);
		
		//Print all the options in DropDown
		WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(dropdown3);
		s2.selectByValue("2");
		
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select s3=new Select(dropdown4);
		List<WebElement> options=s3.getOptions();
		
		System.out.println("Values in dropdown:");
		for(WebElement values:options)
		{
			System.out.println(values.getText());
		}
		
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options);
//		}
			
		
		
		System.out.println("The number of elements in dropdwon:"+options.size());
		
		WebElement dropdown5= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");
		
		WebElement dropdown6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectbox=new Select(dropdown6);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
		
	}

}
