package com.pomRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import baseclassfile.JVMReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "com.pomloginpage" }, monochrome = true, plugin = {
		"json:src\\test\\resources\\Report\\demo.json" })
public class pomTestRunnner {

	@AfterClass
	public static void afterclass() {
		JVMReport.generatejvmreport("src\\test\\resources\\Report\\demo.json");
	}	
}