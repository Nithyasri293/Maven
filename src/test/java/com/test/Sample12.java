package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample12 extends HelperClass {

	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username(username, "nithya@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password(password, "nithya120");
		WebElement login = driver.findElement(By.name("login"));
		login(login);

	}

}
