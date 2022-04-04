package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvValidation {

	static WebDriver driver;
	static long startTime;
	static String name1;
    static String mn;
	
	
	

	@When("user Search Tv")
	public void user_Search_Tv() {
		mn="SAMSUNG";
		WebElement search=Hooks.driver.findElement(By.name("q"));
		search.sendKeys("SAMSUNG TV",Keys.ENTER);
	    
	}

	@When("user click on the Tv name")
	public void user_click_on_the_Tv_name() {
		WebElement tvName1=Hooks.driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		name1=tvName1.getText();
		System.out.println(name1);
		tvName1.click();
	    
	}

	@Then("user validate the Tv name")
	public void user_validate_Tv_name() {
	   
		String parent= Hooks.driver.getWindowHandle();
		Set<String> children=Hooks.driver.getWindowHandles();
		for(String x:children) {
			if(!parent.equals(x)) {
				Hooks.driver.switchTo().window(x);
			}
		}
		
		WebElement tvName2=Hooks.driver.findElement(By.xpath("//span[text()='SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV']"));
		String name2=tvName2.getText();
		System.out.println(name2);
		tvName2.click();
		Hooks.driver.quit();
		
	}
	
	    
	}




