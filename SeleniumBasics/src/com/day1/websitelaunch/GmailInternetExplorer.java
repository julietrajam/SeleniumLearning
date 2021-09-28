package com.day1.websitelaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailInternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.ie.driver", "C:\\E\\sw\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        
        driver.get("http://gmail.com/");
        
        //FireFOx Driver
//        System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver"); // Setting system properties of FirefoxDriver
//        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		
		
	}

}
