package baseclassfile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClassAda {
	WebDriver driver;
	public WebDriver getDriver() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vetri\\eclipse-workspace\\CucumberAdahotel\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		return driver;
	}
	public void loadurl(String url) {
		driver.get(url);
	}
	
    public void fill (WebElement e, String text) {
	e.sendKeys(text);
	}
 public void getattribute(WebElement e) {
	 String attribute = e.getAttribute("value");
 }
  public String generaterandomdate() {
	  return new SimpleDateFormat("EE_MM_dd_yyyy_hhmmss").format(new Date());  
 }
  public void screenshot() {

	  TakesScreenshot tk=(TakesScreenshot)driver;
	  File s = tk.getScreenshotAs(OutputType.FILE);
      File d=new File ("C:\\Users\\Vetri\\eclipse-workspace\\CucumberAdahotel\\Screenshot"+generaterandomdate()+".png");
       try {
		FileUtils.copyFile(s, d);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
       public void click(WebElement e) {
    	   e.click();
    	   screenshot();
    	   
       
	}





}