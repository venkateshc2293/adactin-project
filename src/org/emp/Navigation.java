package org.emp;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
public static <WebElements> void main(String[]args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VENKATESH\\eclipse-workspace\\SeleniumTaskTwo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.google.com/");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("sony mobiles",Keys.ENTER);
	Thread.sleep(5000);

WebElement down = driver.findElement(By.id("Wprf1b"));
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].scrollIntoView(true)",down);
Thread.sleep(5000);

WebElement pageup = driver.findElement(By.xpath("//h3[@role='heading']"));
executor.executeScript("arguments[0].scrollIntoView(false)",pageup);
Thread.sleep(5000);

	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
}
