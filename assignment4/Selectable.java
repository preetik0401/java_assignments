package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//load url
		driver.get("https://play.letcode.in/button");
		WebElement button1= driver.findElement(By.id("button1"));
		if(button1.isDisplayed()) {
		System.out.println("aa");	
		}
		if(button1.isEnabled()) {
			System.out.println("bb");	
			}
	}

}
