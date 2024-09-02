package com.test2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample1 extends WriteExcelData{
	public static void main(String[] args) throws IOException {
	   browserLaunch();
	   urlLaunch("https://www.facebook.com");
	   WebElement userName = driver.findElement(By.id("email"));
	   username(userName, writeExcel(1, 0, "Login"));
	   WebElement password = driver.findElement(By.name("pass"));
	   password(password, writeExcel(1, 1, "Login"));
}
}
