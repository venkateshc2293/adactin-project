package org.emp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\VENKATESH\\eclipse-workspace\\AaactinHotelApp\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
WebElement search = driver.findElement(By.name("keyword"));
		
		search.sendKeys("hand satnizer",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement satnizer = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div[1]/span/a/div/img"));
		satnizer.click();
		
		String handle = driver.getWindowHandle();
		Set<String> firstwin = driver.getWindowHandles();
		for (String windowid : firstwin) {
			if(!satnizer.equals(firstwin)) {
				driver.switchTo().window(windowid);

		}}
		WebElement addtocard = driver.findElement(By.xpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
		addtocard.click();
		WebElement text = driver.findElement(By.xpath("//span[@class='mess-text']"));
		String text2 = text.getText();
		System.out.println(text2);
		driver.switchTo().window(handle);

}


		

}
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.switchTo().frame(frame);
		
		//WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
		
		//login.sendKeys("venk@1234");
	//	String loginid = login.getAttribute("value");
//System.out.println("login is "+loginid);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

