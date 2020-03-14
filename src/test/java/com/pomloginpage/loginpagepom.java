package com.pomloginpage;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomBaseclass.BaseClass;
import com.pomStepdefi.PageObjectManager;
import com.pomStepdefi.bookHotel;
import com.pomStepdefi.loginPage;
import com.pomStepdefi.searchHotel;
import com.pomStepdefi.selectHotel;

import baseclassAda.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginpagepom extends BaseClass {
	WebDriver driver;
	PageObjectManager page;
		
	@Given("user is on hotel page")
	public void user_is_on_hotel_page() {
	driver=	getDriver();
	loadurl("https://adactin.com/HotelApp/");
	}
	@When("user enter details")
	public void user_enter_details(io.cucumber.datatable.DataTable data) {
	   List<Map<String, String>> emp = data.asMaps();
	   
	   String b1 = emp.get(0).get("username");
	   String b2 =emp.get(0).get("password");
page=new PageObjectManager();
	 
	 type(page.getLogin().getUsername(), b1);
	type(page.getLogin().getUserpass(), b2);
	click(page.getLogin().getLoginbtn());
	

	String s1 = emp.get(0).get("Location");
	type(page.getSearcHotel().getLoc(),s1);
	String s2 = emp.get(0).get("Hotels");
	type(page.getSearcHotel().getHot(), s2);
	String s3 = emp.get(0).get("Room Type");
	type(page.getSearcHotel().getRoomtype(), s3);
	String s4 = emp.get(0).get("Number of Rooms");
	type(page.getSearcHotel().getRoomno(), s4);
	String s5 = emp.get(0).get("CheckInDate");
	type(page.getSearcHotel().getFindElement(), s5);
	String s6 = emp.get(0).get("CheckOutDate");
	type(page.getSearcHotel().getCheckout(), s6);
	String s7 = emp.get(0).get("Adults per Room");
	type(page.getSearcHotel().getAdult(), s7);
	String s8 = emp.get(0).get("Children per Room");
	type(page.getSearcHotel().getChildren(), s8);
	click(page.getSearcHotel().getSub());
	
	click(page.getSelHotel().getClick());
	click(page.getSelHotel().getConti());
	
	String h1 = emp.get(0).get("First Name");
	type(page.getBookHotel().getFirstname(),h1);
	
	String h2 = emp.get(0).get("Last Name");
	type(page.getBookHotel().getLastname(),h2);
	
	String h3 = emp.get(0).get("Billing Address");
	type(page.getBookHotel().getAddress(),h3);
	
	String h4 = emp.get(0).get("Credit Card No");
	type(page.getBookHotel().getCardno(),h4);
	
	String h5 = emp.get(0).get("Credit Card Type");
	type(page.getBookHotel().getCardtype(),h5);
	
	String h6 = emp.get(0).get("Expiry Date");
	type(page.getBookHotel().getExpmonth(),h6);
	
	String h7 = emp.get(0).get("Expiry Year");
	type(page.getBookHotel().getExpyear(),h7);
	
	String h8 = emp.get(0).get("CVV Number");
	type(page.getBookHotel().getCvvno(),h8);
	
	click(page.getBookHotel().getBooknow());
	}
	@Then("user should verify the message")
	public void user_should_verify_the_message() throws InterruptedException {
		Thread.sleep(10000);
WebElement ab = driver.findElement(By.id("order_no"));
String attribute = ab.getAttribute("value");
System.out.println(attribute);
driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
WebElement can = driver.findElement(By.xpath("//input[@value='"+attribute+"']/parent::td/preceding-sibling::td"));
can.click();
WebElement findElement = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
findElement.click();

Alert a = driver.switchTo().alert();
a.accept();
		
	
		
	}









}
