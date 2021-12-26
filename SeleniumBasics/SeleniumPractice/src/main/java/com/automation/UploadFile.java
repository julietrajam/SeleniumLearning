package com.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");

		Thread.sleep(5);
		
		/*
		 * WebElement uploadButton=driver.findElement(By.
		 * xpath("//input[@type='file' and @ name='filename']"));
		 * 
		 * uploadButton.click();
		 */
		
		Actions click = new Actions(driver);
		WebElement uploadbutton = driver.findElement(By.name("filename"));
		click.moveToElement(uploadbutton).click().build().perform();
		
		// windows controls begins here

		Thread.sleep(3000);
		String	file="C:\\Users\\seenuvas\\OneDrive\\Documents\\contacts";

		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
	}

}
