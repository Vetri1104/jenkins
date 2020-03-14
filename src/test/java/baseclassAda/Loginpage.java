package baseclassAda;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import baseclassfile.baseClassAda;
import cucumber.api.java.en.*;
public class Loginpage extends baseClassAda {
WebDriver driver;
	@Given("user is on hotel page")
	public void user_is_on_hotel_page() {
	driver=	getDriver();
	loadurl("http://adactin.com/HotelApp/");
	}
	@When("user enter details")
	public void user_enter_details(io.cucumber.datatable.DataTable data) {
	   List<Map<String, String>> emp = data.asMaps();
	   String s1 = emp.get(0).get("username");
	   WebElement username = driver.findElement(By.id("username"));
	   fill(username, s1);
	   
	   String s2 = emp.get(0).get("password");
	   WebElement userpass = driver.findElement(By.id("password"));
	   fill(userpass, s2);
	   
	   WebElement loginbtn = driver.findElement(By.id("login"));
	   click(loginbtn);
	   String s3 = emp.get(0).get("Location");
	   WebElement loc = driver.findElement(By.id("location"));
		fill(loc,s3);
		
		String s4 = emp.get(0).get("Hotels");
		WebElement hot = driver.findElement(By.id("hotels"));
		fill(hot,s4);
		
		String s5 = emp.get(0).get("Room Type");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		fill(roomtype,s5);
		
		String s6 = emp.get(0).get("Number of Rooms");
		WebElement roomno = driver.findElement(By.id("room_nos"));
		fill(roomno,s6);
		
		String s7 = emp.get(0).get("CheckInDate");
		WebElement findElement = driver.findElement(By.id("datepick_in"));
		fill(findElement,s7);
		
		String s8 = emp.get(0).get("CheckOutDate");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		fill(checkout,s8);
		
		String s9 = emp.get(0).get("Adults per Room");
		WebElement adult = driver.findElement(By.id("adult_room"));
		fill(adult,s9);
		
		String s10 = emp.get(0).get("Children per Room");
		WebElement children = driver.findElement(By.id("child_room"));
		fill(children,s10);
		
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();


		String b1 = emp.get(0).get("First Name");
		WebElement childrenn = driver.findElement(By.id("first_name"));
		fill(childrenn, b1);
		String b2 = emp.get(0).get("Last Name");
		WebElement lastname = driver.findElement(By.id("last_name"));
		fill(lastname, b2);

		String b3 = emp.get(0).get("Billing Address");
		WebElement address = driver.findElement(By.id("address"));
		fill(address, b3);

		String b4 = emp.get(0).get("Credit Card No");
		WebElement cardno = driver.findElement(By.id("cc_num"));
        fill(cardno, b4);
		
		String b5 = emp.get(0).get("Credit Card Type");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		fill(cardtype, b5);
		
		String b6 = emp.get(0).get("Expiry Year");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		fill(expyear, b6);
		
		String b7 = emp.get(0).get("Expiry Date");
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		fill(expmonth, b7);
		
		String b8 = emp.get(0).get("CVV Number");
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		fill(cvvno, b8);
		
	
		WebElement booknow = driver.findElement(By.id("book_now"));
	    click(booknow);
		
	
		WebElement order = driver.findElement(By.id("order_no"));
		
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
	   
	}

	@Then("user should verify the message")
	public void user_should_verify_the_message() {
	}


















}