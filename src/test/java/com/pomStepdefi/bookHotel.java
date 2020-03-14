package com.pomStepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomBaseclass.BaseClass;

public class bookHotel extends BaseClass {
	
	public bookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="first_name")
	private WebElement firstname;

	@FindBy (id="last_name")
	private WebElement lastname;

	@FindBy (id="address")
	private WebElement address;

	@FindBy (id="cc_num")
	private WebElement cardno;

	@FindBy (id="cc_type")
	private WebElement cardtype;

	public WebElement getExpyear() {
		return expyear;
	}

	@FindBy (id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy (id="cc_exp_month")
	private WebElement expmonth;

	@FindBy (id="cc_cvv")
	private WebElement cvvno;

	@FindBy (id="book_now")
	private WebElement booknow;
	

	public WebElement getBook() {
		return book;
	}

	@FindBy (id="//input[@value='1956X85IHW']")
	private WebElement book;
	


		public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
