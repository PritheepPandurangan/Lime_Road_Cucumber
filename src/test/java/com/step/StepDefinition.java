package com.step;

import com.base.Base_Class;
import com.pom.Home_Page;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {
	
	Home_Page hp =  new Home_Page(driver);
	

	@Given("User enter the url {string}")
	public void user_enter_the_url(String string) {
		launchUrl(string);
	    
	}
	@When("User click on men")
	public void user_click_on_men() throws InterruptedException {
	   Thread.sleep(3000);
	   hp.getElement().click();
	}
   
	@Given("User Click On Mencategory")
	public void user_click_on_mencategory() {
	    hp.actionMtd(hp.getMen());
	}

	@Given("User Click on Jeans")
	public void user_click_on_jeans() throws InterruptedException {
	   Thread.sleep(2000);
	   hp.getJeans().click();
	}
	
	@Given("User Click On HighPrice")
	public void user_click_on_high_price() throws InterruptedException {
	    Thread.sleep(2000);
	    hp.getHigh().click();
	}
	
	@Given("User click on Pant")
	public void user_click_on_pant() throws InterruptedException {
	    Thread.sleep(2000);
	    hp.getPant().click();
	}
	
	@Given("User Click On Size Of The Pant")
	public void user_click_on_size_of_the_pant() throws InterruptedException {
	    Thread.sleep(2000);
	    hp.getSize().click();
	}
	
	@Given("User Click On Add To Cart")
	public void user_click_on_add_to_cart() throws InterruptedException {
	    Thread.sleep(2000);
	    hp.getCart().click();
	}


	
}
 