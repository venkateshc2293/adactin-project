package org.emp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\VENKATESH\\eclipse-workspace\\AaactinHotelApp\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.w3schools.com/html/html_tables.asp");
	//String title = driver.getTitle();
	//System.out.println(title);
	
	WebElement table = driver.findElement(By.id("customers"));
	List<WebElement> list = table.findElements(By.tagName("tr"));
	int x = list.size();
	System.out.println("length of the list "+x);
	
	System.out.println("get table data");

	String alltext = table.getText();
	System.out.println(alltext);
	
	System.out.println("get last row table data");
	WebElement lasttext = list.get(x-1);
	String text1 = lasttext.getText();
	System.out.println(text1);
	System.out.println("specific text present or not chech");

	if (text1.equals("Germanyy")) {
		System.out.println("Germany");
	} else {
		System.out.println("not match");

	}
	System.out.println("      ");
	
	
	System.out.println("collect each table row data");

	for (int i = 0; i <x; i++) {
		WebElement row = list.get(i);
		List<WebElement> list2 = row.findElements(By.tagName("td"));
		for (int j = 0; j <list2.size(); j++) {
			WebElement element = list2.get(j);
			String text = element.getText();
			System.out.println(text);

		}}}}