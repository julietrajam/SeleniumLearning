package com.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		//driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement homeButton = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		homeButton.click();

		//driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement imageButton = driver.findElement(By.xpath("//img[@alt='Images']"));
        imageButton.click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement brokenImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));

		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("It is a broken image");
		} else {
			System.out.println("Its is not a broken image");
		}

	}

}
