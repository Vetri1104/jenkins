package com.pomStepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import com.pomBaseclass.BaseClass;

public class loginPage extends BaseClass {
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (id="username")
	private WebElement username1;
	
	@FindBy (id="password")
	private WebElement userpass;


	@FindBy (id="login")
	private WebElement loginbtn;


	public WebElement getUsername() {
		return username1;
	}


	public WebElement getUserpass() {
		return userpass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
		}

	
	