package com.test1;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends ReadExcel{
	public static void main(String[] args) throws IOException {
		browserLaunch();
		urlLaunch("https://www.facebook.com");
	    WebElement userName = driver.findElement(By.id("email"));
	    username(userName, writeExcel(1, 0, "Sheet1"));
	    WebElement password = driver.findElement(By.name("pass"));
	    password(password, writeExcel(1, 1, "Sheet1"));
	    WebElement login = driver.findElement(By.name("login"));
	    login(login);
	}

}
