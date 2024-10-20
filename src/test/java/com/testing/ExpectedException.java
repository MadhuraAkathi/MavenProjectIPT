package com.testing;

import org.testng.annotations.Test;

import com.ReusableMethods.Base_Class;

public class ExpectedException extends Base_Class {
	@Test(expectedExceptions= ArithmeticException.class)
	private void exception() {
		
		launchBrowser("chrome");
		launchUrl("https://www.google.co.in/");
		int i=10/0; //--> Arithmetic Exception
		System.out.println("Browser launched ");
		
		
	}
}
