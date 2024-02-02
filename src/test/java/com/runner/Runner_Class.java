package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Selenium\\Lime_Road_Project\\src\\test\\java\\com\\feature\\lime.feature",
                  glue = "com.step",
                  monochrome = true,
                  dryRun = false,
                  strict = true,
                  tags = "@Regression",
                  
                  plugin={"pretty",
                		  "html:Report/lime.html",
                		  "json:Rep/limeroad.json",
                		  
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                  })

public class Runner_Class extends Base_Class{
	@BeforeClass
	public static void browserLauch() {
		launchBrowser("chrome");
	}
}
