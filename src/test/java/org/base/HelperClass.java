package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	
	public static WebDriver driver;
	
	public void launchbrowser() {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
	}
	
	public void loadUrl (String url) {
	
		driver.get(url);

	}
	
	public void maxBrowser() {
	
		driver.manage().window().maximize();
		
	}
	
	public void filltextbox (WebElement element, String value) {
	
		element.sendKeys(value);
		
	}

	public void loginbtn() {
	
		WebElement loginbtn = driver.findElement(By.name("login-button"));
		loginbtn.click();
		
	}
	
	

}
