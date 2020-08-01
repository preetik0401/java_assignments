package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//load url
		driver.get("https://www.amazon.com");
		
		 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		 searchBox.sendKeys("oneplus");
		 
		WebElement submitBtn =  driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']"));
		submitBtn.click();
		
		WebElement searchResult = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']/img[@alt='OnePlus 6T A6013 128GB Storage + 8GB Memory T-Mobile and GSM + Verizon Unlocked 6.41 inch AMOLED Display Android 9 - Mirror Black US Version']"));
		searchResult.click();
		
		WebElement printTitle = driver.findElementByXPath("//span[@id='productTitle' and  @class = 'a-size-large'] ");
		printTitle.getText();
		System.out.println(printTitle.getText());
		
		driver.navigate().back();
		WebElement searchBox1 = driver.findElementByXPath("//input[@id='twotabsearchtextbox' and @value='oneplus']");
		System.out.println("aa"+searchBox1.getText());
		
		//driver.quit();

	}

}
