package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_1.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Enter Email/Mobile number']")).sendKeys("8218272772");

	}

}
