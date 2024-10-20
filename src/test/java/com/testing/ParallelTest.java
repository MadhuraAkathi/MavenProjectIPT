package com.testing;

import org.testng.annotations.Test;

import com.ReusableMethods.Base_Class;
@Test
public class ParallelTest extends Base_Class {
private void chrome() { 
		
		launchBrowser("chrome");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID :"+ Thread.currentThread().getId());
	
	}  
	@Test
    private void edge() { 
		
		launchBrowser("edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID :"+ Thread.currentThread().getId());
		
	}
	@Test
    private void firefox() { 
		
		launchBrowser("firefox");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID :"+ Thread.currentThread().getId());
		
	}
}
