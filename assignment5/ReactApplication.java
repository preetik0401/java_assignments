package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReactApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//load url
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		
		WebElement selPrice = driver.findElement(By.tagName("select"));
		Select sel = new Select(selPrice);
	    sel.selectByVisibleText("Highest to lowest");
	    
	  //  WebElement selXSSize = driver.findElement(By.className("checkmark"));
	      WebElement selXSSize = driver.findElement(By.xpath("//span[text()='XS']"));
	      selXSSize.click();
	    
	      WebElement selSSize = driver.findElement(By.xpath("//span[text()='S']"));
	      selSSize.click();
	      
	     Thread.sleep(1000);
	      
	      ((Select) selXSSize).deselectAll();
	      
	    
	   // driver.quit();

	}

}
