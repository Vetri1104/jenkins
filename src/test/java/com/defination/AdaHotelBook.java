package com.defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class AdaHotelBook {

	WebDriver driver;

	@Given("user is on hotel page")
	public void user_is_on_hotel_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vetri\\eclipse-workspace\\CucumberAdahotel\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactin.com/HotelApp/");
	}

	@When("user enter {string},{string}")
	public void user_enter(String s01, String s02) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(s01);
		WebElement userpass = driver.findElement(By.id("password"));
		userpass.sendKeys(s02);
		WebElement butlogin = driver.findElement(By.id("login"));
		butlogin.click();
	}

	@When("user enter the details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_details(String s1, String s2, String s3, String s4, String s5, String s6, String s7,
			String s8) {
		WebElement loc = driver.findElement(By.id("location"));
		loc.sendKeys(s1);
		WebElement hot = driver.findElement(By.id("hotels"));
		hot.sendKeys(s2);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.sendKeys(s3);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		roomno.sendKeys(s4);
		WebElement findElement = driver.findElement(By.id("datepick_in"));
		findElement.sendKeys(s5);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys(s6);
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s = new Select(adult);
		s.selectByVisibleText(s7);
		WebElement children = driver.findElement(By.id("child_room"));
		children.sendKeys(s8);

	}

	@When("user clicks the Radio button")
	public void user_clicks_the_Radio_button() {
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

	}

	@When("user enter the payment details {string},{string},{string},{string},{string},{string} ,{string}and {string}")
	public void user_enter_the_payment_details_and(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8) {

		driver.findElement(By.id("first_name")).sendKeys(a1);
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys(a2);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(a3);

		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys(a4);
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		cardtype.sendKeys(a5);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		expyear.sendKeys(a6);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		expmonth.sendKeys(a7);
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		cvvno.sendKeys(a8);
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		WebElement order = driver.findElement(By.id("order_no"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
	}

	@Then("user should verify the message")
	public void user_should_verify_the_message() {
		String Url = driver.getCurrentUrl();
		boolean contains = Url.contains("HotelApp");
		Assert.assertTrue("verify url", contains);

	}
}
