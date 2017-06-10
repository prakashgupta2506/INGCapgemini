package com.ingcapgemini.wm.action;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefile", tags = { "@ApplyLeave1" }, plugin = {
		"pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json", "junit:target/cucumber.xml",
		"usage:target/cucumber-usage.json" ,"rerun:target/rerun.txt" }, glue = { "com.ingcapgemini" } )
//FOR
/*@CucumberOptions(features = {"@target/rerun.txt"}, plugin = {
		"pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json", "junit:target/cucumber.xml",
		"usage:target/cucumber-usage.json" ,"rerun:target/rerun.txt" }, glue = { "com.ingcapgemini" } )*/

public class TestRunner {
	
	@BeforeClass
	public static void beforeClass(){ //For BeforeClass annotation static is compulsory because JVM calls it directly

		if(System.getProperty("Browser")==null){
			System.setProperty("Browser", "ie");
			
		}
		if(System.getProperty("ENV")==null){
			System.setProperty("ENV", "SIT");
			
		}
		
		
	}
	
	@AfterClass
	public static void afterClass(){
		
	}

}
