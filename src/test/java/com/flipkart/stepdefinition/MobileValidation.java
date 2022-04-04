package com.flipkart.stepdefinition;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

	

public class MobileValidation {
	
	
			
			static long startTime;
			static String name1;
	        static String mn;
		
			@Given("user login by entering valid credetials")
			public void user_login_by_entering_valid_credetials() {
				try {
					WebElement close=Hooks.driver.findElement(By.xpath("//button[text()='✕']"));
					
					close.click();
				}
				catch(Exception e){
					//handle exception
				}
			   
			}
			
			

			@When("user Search mobile")
			public void user_Search_mobile() {
				mn="realme";
				WebElement search=Hooks.driver.findElement(By.name("q"));
				search.sendKeys(mn,Keys.ENTER);
			    
			}

			@When("user click on the mobile name")
			public void user_click_on_the_mobile_name() {
				WebElement mobileName1=Hooks.driver.findElement(By.xpath("//input[@value='"+mn+"']"));
				name1=mobileName1.getText();
				System.out.println(name1);
				mobileName1.click();
			    
			}

			@Then("user validate the mobile name")
			public void user_validate_the_mobile_name() {
			   
				String parent= Hooks.driver.getWindowHandle();
				Set<String> children=Hooks.driver.getWindowHandles();
				for(String x:children) {
					if(!parent.equals(x)) {
						Hooks.driver.switchTo().window(x);
					}
				}
				
				WebElement mobileName2=Hooks.driver.findElement(By.xpath("//div[contains(text(),'"+mn+"')][1]"));
				String name2=mobileName2.getText();
				System.out.println(name2);
				mobileName2.click();
				Hooks.driver.quit();
				
			}
			@When("user Search mobile by one dim List")
			public void user_Search_mobile_by_one_dim_List(io.cucumber.datatable.DataTable dataTable) {
			   List<String> datas=dataTable.asList();
			   mn=datas.get(0);
			   WebElement search=Hooks.driver.findElement(By.name("q"));
				search.sendKeys(mn,Keys.ENTER);
			}
			@When("user Search mobile by one dim Map")
			public void user_Search_mobile_by_one_dim_Map(io.cucumber.datatable.DataTable dataTable) {
			   Map<String,String> datas=dataTable.asMap(String.class,String.class);
			   mn=datas.get("0");
			   
			   WebElement search=Hooks.driver.findElement(By.name("q"));
						search.sendKeys(mn,Keys.ENTER);
			}
			
			@When("user Search mobile {string}")
			public void user_Search_mobile(String phone) {
				mn=phone;
				 WebElement search=Hooks.driver.findElement(By.name("q"));
					search.sendKeys(mn,Keys.ENTER);
			    
			}


}
