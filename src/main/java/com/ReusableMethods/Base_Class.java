package com.ReusableMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Base_Class {
 
               public static WebDriver driver;
               
              

		protected static WebDriver launchBrowser(String browserName) {
			
			if(browserName.equalsIgnoreCase("chrome")) {
				driver= new ChromeDriver();
				}
			else if (browserName.equalsIgnoreCase("edge")) {
				driver= new EdgeDriver();
				}
			else if (browserName.equalsIgnoreCase("Firefox")) {
				driver= new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			return driver;
			
		}
			
		protected static WebDriver launchUrl(String Url) {
			try {
				driver.get(Url);
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING ......");	
			}
			return driver;
		}
		protected static WebDriver getTitle (String Url) {
			try {
				 String getTitle = driver.getTitle();
				System.out.println(getTitle);
			} catch (Exception e) {
			    System.out.println();
			    Assert.fail("ERROR: OCCUR DURING ......");
			}
			return driver;
		
		}
		protected static WebDriver getCurrentUrl(String getCurrentUrl) {
			try {
				 String getcurrentUrl =driver.getCurrentUrl();
				System.out.println(getCurrentUrl);
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING ......");
			}
			return driver;
		}
			
		protected static void inputValues (WebElement element, String input) {
			try {
				element.sendKeys (input);
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING ......");
				
			}
			
		}
		protected static WebElement elementIsEnabled(WebElement element) {
			
			boolean enabled;
			try {
				enabled = element.isEnabled();
				
				System.out.println("The element isEnabled:"+ enabled);
			} catch (Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING ......");
			}
		return element;
		
	}
		
protected static WebElement elementIsSelected(WebElement element) {
			
			boolean selected;
			try {
				selected = element.isEnabled();
				System.out.println("The element isSelected:"+ selected);
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR ENABLING ......");
			}
		return element;
		
	} 
protected static WebElement elementIsDisplayed(WebElement element) {
	
	boolean displayed;
	try {
		displayed = element.isDisplayed();
		
		System.out.println("The element isDisplayed:"+ displayed);
	} catch (Exception e) {
		
		Assert.fail("ERROR: OCCUR DURING ......");
	}
return element;

}
		
		
		
	protected static WebElement  clickElement (WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING ......");

			}
		return element;
		}
	
	protected static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			
			Assert.fail("ERROR: OCCUR DURING ......");
		    }
		
	    }
		protected static void navigatepage(String URL) {
			try {
				driver.navigate().to(URL);
			} catch (Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING ......");	 
			}
			
		}
		
		
		protected static void navigateBack() {
			try {
				driver.navigate().back();
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING ......");	
				 
			}
			
		}
		
		protected static void navigateForward() {
			try {
				driver.navigate().forward();
			} catch (Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING ......");	
			}
			
		}
  protected static void framesDefaultContent (){
			
			try {
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING ......");	
			}	
		}
		
		
		protected static void framesIndex(int index) {
			
		try {
			driver.switchTo().frame(0);
		} catch (Exception e) {
			
			Assert.fail("ERROR: OCCUR GIVING ....");	 
		}
		
		}
		
		protected static void frameWebElement(WebElement element) {
			try {
				driver.switchTo().frame(element);
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING ......");
				 
			}	
			
		}
		protected static void framesID(String IDorNAME) {
			
			try {
				driver.switchTo().frame(IDorNAME);
			} catch (Exception e) {
				
				Assert.fail("ERROR: OCCUR DURING ......");
			}	
		}
		
	protected static void closebrowser () { 
			try {
				driver.close();
			} catch (Exception e) {
				Assert.fail("ERROR: OCCUR DURING ......");
			}
			
		}
		
	protected static void terminateBrowser() { 
	try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING ......");
				}
				
	}
	
	}

   
    

