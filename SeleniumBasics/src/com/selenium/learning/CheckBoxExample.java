package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seenuvas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement checkedbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		Boolean checked=checkedbox.isSelected();
		System.out.println("Is selected checkbox:"+checked);
		
		WebElement first=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
	    if(first.isSelected())
	    {
	    	first.click();
	    }
		
		WebElement second=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
	    if(second.isSelected())
	    {
	    	second.click();
	    }
	    
	    Thread.sleep(3000);
	    
	    WebElement option1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
	    option1.click();
	    
	    WebElement option2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
	    option2.click();
	    
	    WebElement option3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
	    option3.click();
	    
	    WebElement option4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input"));
	    option4.click();
	    
	    WebElement option5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input"));
	    option5.click();

	}

}
