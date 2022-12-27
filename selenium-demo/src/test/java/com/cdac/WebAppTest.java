package com.cdac;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAppTest {

	@Test
	public void checkSuccessfulLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:9191/selenium-demo/");
		driver.findElement(By.id("link1")).click();
		driver.findElement(By.id("uname")).sendKeys("majrul");
		driver.findElement(By.id("pwd")).sendKeys("123456");
		driver.findElement(By.tagName("button")).submit();
		
		String actual = driver.findElement(By.tagName("h1")).getText();
		String expected = "Welcome back";
		
		assertEquals(expected, actual);
		
		driver.close();
	}

}
