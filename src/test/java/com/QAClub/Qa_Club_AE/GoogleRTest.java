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
	 
	@Test
	public void copy_text() throws InterruptedException {
		driver.get("https://google.com.ua");
		driver.findElement(By.name("q")).sendKeys("GeeksForLess");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		String a = driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/div/div/span")).getText();
		String b = driver.findElement(By.xpath(".//*[@id='rso']/div/div[2]/div/div/div/span")).getText();
		String c = driver.findElement(By.xpath(".//*[@id='rso']/div/div[3]/div/div/div/span")).getText();
		String d = driver.findElement(By.xpath(".//*[@id='rso']/div/div[4]/div/div/div/span")).getText();
		String e = driver.findElement(By.xpath(".//*[@id='rso']/div/div[5]/div/div/div/span")).getText();
		String f = driver.findElement(By.xpath(".//*[@id='rso']/div/div[6]/div/div/div/span")).getText();
		String g = driver.findElement(By.xpath(".//*[@id='rso']/div/div[7]/div/div/div/span")).getText();
		String h = driver.findElement(By.xpath(".//*[@id='rso']/div/div[8]/div/div/div/span")).getText();
		String i = driver.findElement(By.xpath(".//*[@id='rso']/div/div[9]/div/div/div/span")).getText();
		String j = driver.findElement(By.xpath(".//*[@id='rso']/div/div[10]/div/div/div/span")).getText();
		String arr[] ={a, b, c, d, e, f, g, h, i, j};
		for (String v:arr){
			System.out.println(v);
			
		}

	}

	@After
	public void tearDown(){

		driver.quit();
	}

}
