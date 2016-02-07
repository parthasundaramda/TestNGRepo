package com.testng.maven.testNGMaven;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgMavenExampleTest {
	public String baseUrl = "http://localhost:8080/spring3-mvc-maven-xml-hello-world-1.0-SNAPSHOT";
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void verifyHomePage(){
		driver.get(baseUrl);
		String expectedTitle = "Spring 3 MVC Project";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
	
}
