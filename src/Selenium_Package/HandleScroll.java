package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //Specify the website URL
		
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(3000);
		
		//to perform Scroll on application using Selenium
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		//executeScript(window.scrollBy(x-pixels, y-pixels)");
		
		Thread.sleep(5000);
		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
	WebElement Element = driver.findElement(By.linkText("VBScript"));
	Thread.sleep(20000);
	//This will scroll the page Horizontally till the element is found
	js.executeScript("arguments[0].scrollIntoView();",Element);
	
	
		

	}

}
