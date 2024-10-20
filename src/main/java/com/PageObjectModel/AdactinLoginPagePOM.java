package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableMethods.Base_Class;

public class AdactinLoginPagePOM extends Base_Class   {
	
	@FindBy(id="username")
	private WebElement username;
	

	@FindBy(id="password")
	private WebElement password ;
	

	@FindBy(name="login")
	private WebElement loginButton;
	
	//Constractor
	public AdactinLoginPagePOM() {
		PageFactory.initElements(driver,this);
	}
	
	
	//Actions
	public void LoginPage() {
		inputValues(username, "MadhuraA");
		inputValues(password, "651786");
	       clickElement(loginButton);
		
	}
	
	
}
