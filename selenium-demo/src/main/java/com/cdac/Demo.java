package com.cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:9191/selenium-demo/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("link1")).click();
		driver.findElement(By.className("someeffect")).click();
		
		driver.findElement(By.id("uname")).sendKeys("majrul");
		driver.findElement(By.id("pwd")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		//driver.findElement(By.tagName("button")).submit();
		
		System.out.println(driver.findElement(By.tagName("h1")).getText());
				
		try { Thread.sleep(5000); } catch(Exception e) { }
		driver.close();
	}
}
