package com.testing;

import org.testng.annotations.Test;

import com.ReusableMethods.Base_Class;

public class InvocationCount extends Base_Class {
 @Test	(invocationCount=4)
private void chrome() { 
		
		launchBrowser("chrome");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID :"+ Thread.currentThread().getId());
	
	}  
	

}
