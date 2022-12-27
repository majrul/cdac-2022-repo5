package com.cdac;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vjmklvljn3.csb.app");
		//try { Thread.sleep(10000); } catch(Exception e) { }
		driver.manage().timeouts().implicitlyWait(Duration.of(15, ChronoUnit.SECONDS));

		driver.findElement(By.xpath("//div[@class='App']/span")).click();
		driver.findElement(By.xpath("//form/div[@class='form-group'][1]/input")).sendKeys("Majrul");
		driver.findElement(By.xpath("//form/div[@class='form-group'][2]/input")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Majrul");
		//driver.findElement(By.cssSelector("input[placeholder='Number']")).sendKeys("12345");
	}
}
