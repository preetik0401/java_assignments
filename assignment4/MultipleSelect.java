package assignment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//load url
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	/*	WebElement selItems = driver.findElement(By.id("selectable"));
		Select oSelect = new Select(selItems);
		oSelect.selectByVisibleText("Item 1");
		oSelect.selectByVisibleText("Item 3");
		oSelect.selectByVisibleText("Item 5");*/
		WebElement selItem1 = driver.findElement(By.xpath("//ol/li[text()='Item 1']"));
		//selItem1.click();
		WebElement selItem3 = driver.findElement(By.xpath("//ol/li[text()='Item 3']"));
		//selItem3.click();
		WebElement selItem5 = driver.findElement(By.xpath("//ol/li[text()='Item 5']"));
		//selItem1.click();
		WebElement selItems = driver.findElement(By.id("selectable"));
		//List<WebElement> itemList = selItems.findElements(By.tagName("li"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selItem1).click(selItem3).click(selItem5).build().perform();
	}

}
