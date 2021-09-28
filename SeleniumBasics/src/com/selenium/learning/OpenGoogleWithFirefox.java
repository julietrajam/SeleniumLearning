package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\seenuvas\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//Firefox is not installed in my laptop
		
		driver.get("https://www.google.com/");

	}

}
