package com.test3;

import org.openqa.selenium.WebElement;

import com.test.HelperClass;

public class Sample extends Pojo{
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://www.facebook.com");
		Pojo p=new Pojo();
		WebElement user = p.getUserName();
		username(user, "nithya29@gmail.com");
		WebElement pass = p.getPassWord();
		password(pass, "ni125896");
		WebElement login = p.getLogin();
		login(login);
	}
}
