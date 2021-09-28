package com.day1.websitelaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FlipkartWebsiteLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\seenuvas\\Downloads\\geckodriver-v0.29.1-win64.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
	}

}
