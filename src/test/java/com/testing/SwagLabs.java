package com.testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ReusableMethods.Base_Class;

public class SwagLabs extends Base_Class {
	
	@Test(groups="Login")
      private void browserLaunch () {
		launchBrowser("chrome");	  
      }
       @Test(dependsOnMethods= "browserLaunch", groups="Login")
	 private void urlLaunch() {
			launchUrl("https://www.saucedemo.com/v1/index.html");	  
	      }
       @Test(dependsOnMethods="urlLaunch", groups ="Login" )
      private void login() {
    	   driver.findElement(By.id("user-name")).sendKeys("standard_user"); 	 
    	   driver.findElement(By.id("password")).sendKeys("secret_sauce"); 	
    	   driver.findElement(By.id("login-button")).click(); 
    	   String currentUrl= driver.getCurrentUrl();   	  
    	   System.out.println(currentUrl);
    	   Assert.assertEquals(currentUrl,"https://www.saucedemo.com/v1/inventory.html");
      }
     @Test(dependsOnMethods = "login", groups= "Product")
       private void  searchproduct() {
    	 driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click(); 
	      }
     
    @Test (dependsOnMethods= "searchproduct",groups= "Product" )
   private void addToCart(){  
    	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
    	driver.findElement(By.xpath("//*[@class='fa-layers-counter shopping_cart_badge']")).click();
    	driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
    }
    @Test(dependsOnMethods= "addToCart",groups= "Product" )
     private void checkOut() {
       driver.findElement(By.id("first-name")).sendKeys("Madhura"); 	 
  	   driver.findElement(By.id("last-name")).sendKeys("Akathi"); 	
  	   driver.findElement(By.id("postal-code")).sendKeys("614602"); 
  	   driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
  	   driver.findElement(By.xpath("//a[text()='FINISH']")).click();	
    }
    @Test(dependsOnMethods="checkOut", groups="login")
     private void logOut() {
    	 terminateBrowser();
     }
     
}
