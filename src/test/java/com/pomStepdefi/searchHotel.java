package com.pomStepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomBaseclass.BaseClass;

public class searchHotel extends BaseClass{
	
	public searchHotel() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy (id="location")
	private WebElement loc;

	@FindBy (id="hotels")
	private WebElement hot;

	@FindBy (id="room_type")
	private WebElement roomtype;

	@FindBy (id="room_nos")
	private WebElement roomno;

	@FindBy (id="datepick_in")
	private WebElement findElement;

	@FindBy (id="datepick_out")
	private WebElement checkout;

	@FindBy (id="adult_room")
	private WebElement adult;

	@FindBy (id="child_room")
	private WebElement children;

	@FindBy (id="Submit")
	private WebElement sub;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getFindElement() {
		return findElement;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSub() {
		return sub;
	}
	


}
