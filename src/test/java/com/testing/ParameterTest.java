package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ReusableMethods.Base_Class;

public class ParameterTest extends Base_Class {
	   @Test(groups="login")
	   @Parameters({"username","password"})
	   public void login(String username, String password) { 
			
			launchBrowser("chrome");
			launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			 driver.findElement(By.name("username")).sendKeys(username); 	 
	 	     driver.findElement(By.name("password")).sendKeys("password"); 
	 	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	 	    }

}
