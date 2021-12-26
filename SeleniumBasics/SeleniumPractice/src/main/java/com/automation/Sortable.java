package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");

		List<WebElement> element=driver.findElements(By.xpath("//*[@id='sortable']/li"));


		WebElement from=element.get(6);

		WebElement to=element.get(0);


		Actions acc=new Actions(driver);


		acc.dragAndDrop(from,to).build().perform();
		
		
	}

}
