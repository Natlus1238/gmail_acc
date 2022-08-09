package com.gmailaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamil_Account {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Gmail_Account\\Driver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		WebElement creatacc = driver.findElement(By.xpath("//span[contains(text(),'Sign up')]"));
		creatacc.click();
		Thread.sleep(4000);
		WebElement signup = driver.findElement(By.xpath("//span[contains(text(),'Sign up with phone or email')]"));
		signup.click();
		
	}

}
