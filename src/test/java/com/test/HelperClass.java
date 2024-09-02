package com.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HelperClass {
	protected static WebDriver driver;
	public static void browserLaunch() {
		 driver=new EdgeDriver();

	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	public static void username(WebElement we,String value) {
		we.sendKeys(value);

	}
	
	public static void password(WebElement w,String value) {
		w.sendKeys(value);

	}
	
	public static void login(WebElement e) {
		e.click();

	}

}
