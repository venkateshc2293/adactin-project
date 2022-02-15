package org.emp;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.nio.channels.Selector;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New {
	public static <WebElements> void main(String[]args) throws InterruptedException, AWTException, IOException {

	
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
	Select x=new Select(locationdown);
	
	
	List<WebElement> options = x.getOptions();
	for (WebElement y : options) {
		String text = y.getText();
		x.selectByVisibleText(text);
//System.out.println(text);
	}
boolean multiple = x.isMultiple();
	System.out.println(multiple);
	
	
	
	
	
	
//		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
	//	Select select=new Select(country);
      //List<WebElement>alloptions=select.getOptions();
       // int length = alloptions.size();
        //System.out.println(length);

  //      WebElement value = alloptions.get(22);
    //    String text = value.getText();
      //  System.out.println("   "+text);
        
        //for (WebElement x : alloptions) {
			//String y = x.getAttribute("value");
		//	System.out.println(y);

		//}
		
		
		
		
		
		
		
}
	
}
