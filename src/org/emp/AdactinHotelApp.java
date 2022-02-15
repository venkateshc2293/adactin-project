package org.emp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelApp {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\VENKATESH\\eclipse-workspace\\AaactinHotelApp\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("chikannan");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Venk$22");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		
		WebElement locationdown = driver.findElement(By.id("location"));
		Select select=new Select(locationdown);
		select.selectByIndex(2);
		

		WebElement hoteldown = driver.findElement(By.id("hotels"));
		Select select1=new Select(hoteldown);
		select1.selectByIndex(2);

		WebElement roomdown = driver.findElement(By.id("room_type"));
		Select select2=new Select(roomdown);
		select2.selectByIndex(3);
		
		WebElement numofroom = driver.findElement(By.id("room_nos"));
		Select select3=new Select(numofroom);
		select3.selectByIndex(1);
		
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys("26/01/2022");
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("28/01/2022");

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select select4=new Select(adult);
		select4.selectByIndex(1);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select select5=new Select(child);
		select5.selectByIndex(0);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		
		WebElement clickhotel = driver.findElement(By.id("radiobutton_0"));
		clickhotel.click();
		
		WebElement continueclick = driver.findElement(By.id("continue"));
		continueclick.click();
		
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("ABC");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("z");
		
		WebElement addres = driver.findElement(By.id("address"));
		addres.sendKeys("india");
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("1234567890123456");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select select6=new Select(cardtype);
		select6.selectByIndex(2);
		
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select select7=new Select(expmonth);
		select7.selectByIndex(11);
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select select8=new Select(expyear);
		select8.selectByIndex(11);
		
		WebElement cardccv = driver.findElement(By.id("cc_cvv"));
		cardccv.sendKeys("987");
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement orderid = driver.findElement(By.xpath("//input[@name='order_no']"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		String attributevalue = orderid.getAttribute("value");
	System.out.println("print order id "+attributevalue);
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

