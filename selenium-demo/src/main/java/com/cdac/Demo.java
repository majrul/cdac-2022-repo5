package com.cdac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		System.out.println(driver.getTitle());
		//driver.close();
	}
}
