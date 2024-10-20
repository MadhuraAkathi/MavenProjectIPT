package com.RunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ReusableMethods.Base_Class;


public class TestClass extends Base_Class {
	
	public static void main(String[] args) {
		
		    launchBrowser("edge");
	       launchUrl("https://www.facebook.com/");  
	       driver.getTitle();
	       driver.getCurrentUrl();
	       WebElement loginEmail= driver.findElement(By.id("email"));
	       inputValues(loginEmail, "java program");
	       elementIsEnabled(loginEmail);
	       elementIsSelected(loginEmail);
	       elementIsDisplayed(loginEmail);
	       WebElement loginButton =driver.findElement(By.name("login"));
	       clickElement(loginButton);
	       driver.navigate().refresh();
	       driver.navigate().to("https://www.amazon.in/");
	       driver.navigate().back();
	       driver.navigate().forward();
	       framesDefaultContent();
	       framesIndex(0);
	       frameWebElement(loginEmail);
	       framesID("email"); 
	       driver.close();
	       terminateBrowser();
		
	}

	
	}

