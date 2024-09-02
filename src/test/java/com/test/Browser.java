package com.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class Browser {
	public static void main(String[] args) {
		
	  WebDriver driver=new FirefoxDriver();
			
		driver.get("https://www.facebook.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("nithya29bns@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("125896324k");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.quit();
		
		
	}

}
