package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	

	public static WebDriver driver;
	
	//1 Launch Browser
	public static WebDriver launchBrowser(String browsername) {	
	if (browsername.equalsIgnoreCase("chrome")) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("firefox")) {
				
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}	
	else if (browsername.equalsIgnoreCase("edge")) {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}	
	driver.manage().window().maximize();
	return driver;
	}
	// 2 get
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	
	}

	// 3 close
	public static void closeBrowser() {
		driver.close();
	}
	
	public static WebDriver actionMtd(WebElement element) {
		Actions as = new Actions(driver);
		as.moveToElement(element).build().perform();
		return driver;
		
	}

}
