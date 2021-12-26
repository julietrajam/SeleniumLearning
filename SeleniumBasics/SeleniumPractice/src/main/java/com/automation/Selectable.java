package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List <WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		
		Actions acc=new Actions(driver);
		acc.keyDown(Keys.CONTROL).click(selectable.get(0))
		                         .click(selectable.get(1))
		                         .click(selectable.get(2)).build().perform();
		
//		acc.clickAndHold(selectable.get(0));
//		acc.clickAndHold(selectable.get(1));
//		acc.clickAndHold(selectable.get(2));
//		acc.build().perform();
		
	}

}
