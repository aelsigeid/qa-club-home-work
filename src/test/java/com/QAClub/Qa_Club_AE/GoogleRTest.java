package com.QAClub.Qa_Club_AE;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleRTest {

	WebDriver driver;

	@Before 
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testgoogle() throws InterruptedException {
		driver.get("https://google.com.ua");
		driver.findElement(By.name("q")).sendKeys("GeeksForLess");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("GeeksForLess is a North American outsourcing IT company.")).click();
		Thread.sleep(8000);
	}

	@After
	public void tearDown(){
		
		driver.quit();
	}

}
