package com.pomStepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomBaseclass.BaseClass;

public class selectHotel extends BaseClass{

	
	public selectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="radiobutton_0")
	private WebElement click;

	@FindBy (id="continue")
	private WebElement conti;

	public WebElement getClick() {
		return click;
	}

	public WebElement getConti() {

		return conti;

	}
	
}
