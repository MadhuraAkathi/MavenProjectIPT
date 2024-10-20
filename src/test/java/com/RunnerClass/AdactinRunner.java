package com.RunnerClass;


	
	import com.PageObjectModel.AdactinLoginPagePOM;
import com.ReusableMethods.Base_Class;

	public class AdactinRunner extends Base_Class {
		
		public static void main(String[] args) {
		 
		launchBrowser("chrome");
		
		launchUrl("https://adactinhotelapp.com/");

			  AdactinLoginPagePOM adactin = new AdactinLoginPagePOM();
		      adactin.LoginPage();
	}
	}

