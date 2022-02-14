package org.locat;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPojo extends HelperClass {

	public SauceLoginPojo() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name")
	private WebElement userid;
	
	@FindBy(id="password")
	private WebElement passwd;
	
	@FindBy(name="login-button")
	private WebElement loginbtn;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
