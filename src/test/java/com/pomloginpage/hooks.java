package com.pomloginpage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pomBaseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class hooks extends BaseClass {
	
	@After
	public void afterclass (Scenario vk) {
		if (!vk.isFailed()) {	
		TakesScreenshot tk=(TakesScreenshot)driver;
	    byte[] by = tk.getScreenshotAs(OutputType.BYTES);
	    System.out.println(by);
	    vk.embed(by, "image/png");
	    
		}
		}
		

	
}
