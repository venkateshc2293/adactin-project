package org.emp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRow {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\VENKATESH\\eclipse-workspace\\AaactinHotelApp\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rowlist = table.findElements(By.tagName("tr"));
		int x = rowlist.size();
		System.out.println("length of the list "+x+"\n");
		
		System.out.println("print alternate row list"+"\n");

	for (int j = 0; j < rowlist.size(); j++) {
WebElement row= rowlist.get(j);
		
		String text = row.getText();
		System.out.println(text+"\n");
	}
		
		System.out.println("all row table data"+"\n");

		String alltext = table.getText();
		System.out.println(alltext+"\n");
		System.out.println("print coloums list"+"\n");

	
	List<WebElement> coloumslist = table.findElements(By.tagName("td"));
	int y = coloumslist.size();
	System.out.println("length of the list "+y+"\n");
	System.out.println("print alternate coloums list"+"\n");

	
	for (int i = 0; i <coloumslist.size() ; i++) {
		WebElement coloum = coloumslist.get(i=i+1);
		
		String text1 = coloum.getText();
		System.out.println(text1);
	}
	
	
	
	
	
	
}}
