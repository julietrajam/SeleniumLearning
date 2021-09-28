package com.selenium.advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		// Storing oldwindow id
		String oldWindow = driver.getWindowHandle();

		// Clicking Open Home Page Button
		WebElement home = driver.findElement(By.id("home"));
		home.click();

		// Clicking Edit button
		Set<String> windowHandles = driver.getWindowHandles();

		for (String nextWindow : windowHandles) {

			driver.switchTo().window(nextWindow);

		}

		WebElement edit = driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']"));
		edit.click();

		driver.switchTo().window(oldWindow);

		// Clicking Open Multiple Windows button
		WebElement multiWindowButton = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		multiWindowButton.click();

		int size = driver.getWindowHandles().size();
		System.out.println("Number of windows opened" + size);

		Set<String> allwindows = driver.getWindowHandles();

		for (String currentWindow : allwindows) {
			if (!currentWindow.equals(oldWindow)) {
				driver.switchTo().window(currentWindow).close();
			}

		}

	}

}
