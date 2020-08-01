package finalassingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomCar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//load url
		driver.get("https://www.zoomcar.com/chennai/");
		WebElement clickStartJourney = driver.findElement(By.xpath("//a[@title='Start your wonderful journey']"));
		clickStartJourney.click();
		
		WebElement selectPickUpPoint = driver.findElement(By.xpath("//div[contains(text(),'Thuraipakkam')]"));
		selectPickUpPoint.click();
		
		WebElement clickNextBtn = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		clickNextBtn.click();
		
		WebDriverWait wait =new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.urlToBe("https://www.zoomcar.com/chennai/search"));
		List<WebElement> days = driver.findElementsByXPath("//div[@class='day']");
		days.get(0).click();
		
			driver.findElementByXPath("//button[text()='Next']").click();
		
		wait.until(ExpectedConditions.urlToBe("https://www.zoomcar.com/chennai/search"));
		List<WebElement> lastdays = driver.findElementsByXPath("//div[@class='day']");
		int days2 = lastdays.size();
		lastdays.get(days2-1).click();
		driver.findElementByXPath("//button[text()='Done']").click();
		
		List<WebElement> carList =driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println("Total no of cars :" + carList.size());
		
		wait.until(ExpectedConditions.titleContains("Book A Car"));
		List<WebElement> carPriceElement =driver.findElementsByXPath("//div[@class='price']");
		int[] carPrices= new int[carPriceElement.size()];
		int i=0;
		for(WebElement e:carPriceElement) {
			carPrices[i] = Integer.parseInt(e.getText().replace(",", "").replace("₹", "").replace("\"", "").trim());
			i++;
		}		
		Arrays.sort(carPrices);
		
		System.out.println(carPrices[carPrices.length-1]);
		int max = Integer.MIN_VALUE;
		for(WebElement e:carPriceElement) {
			int curr = Integer.parseInt(e.getText().replace(",", "").replace("₹", "").replace("\"", "").trim());

			if(curr>max) {
				max = curr;
			}
		}		
		
		System.out.println("1 Max price =" + carPrices[carPrices.length-1]);
		System.out.println("2 Max price =" +carPrices[carPrices.length-1]);
		
		driver.quit();

	}

}
