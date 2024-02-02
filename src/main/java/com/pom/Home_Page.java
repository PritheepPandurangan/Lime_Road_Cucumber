package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

public class Home_Page extends Base_Class {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[text()='Men']")
	private WebElement element;
	
	
	@FindBy(xpath = "//a[@id='men_category']")
    private WebElement men;
	
	@FindBy(xpath = "//a[text()='jeans']")
	private WebElement jeans;
	
	@FindBy(xpath = "//div[text()='High Price']")
	private WebElement high;
	
	@FindBy(xpath = "//img[@id='19712789']")
	private WebElement pant;
	
	@FindBy(xpath = "//span[@id='size_32824454']")
	private WebElement size;
	
	@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
	private WebElement cart;
	

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getElement() {
		return element;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getJeans() {
		return jeans;
	}

	public WebElement getHigh() {
		return high;
	}

	public WebElement getPant() {
		return pant;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCart() {
		return cart;
	}

    	
	

	

	
	
	
	
	
	
	}


