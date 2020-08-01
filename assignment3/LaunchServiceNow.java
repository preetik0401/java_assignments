package assignment;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchServiceNow {

	
		public RemoteWebDriver driver;
		
		@BeforeClass
		public void init() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		@Test(priority=1)
		public void GoToHomePage() {
			driver.get("https://dev88793.service-now.com/");
			WebElement logo = driver.findElement(By.className("navbar-brand"));
			assertTrue(logo.isDisplayed(),"Logo is not displayed");
		}
		
		@Test(priority=2)
		public void GoToLaunchPage() {
			//driver.findElement(By.id("gsft_main"));
			driver.switchTo().frame(driver.findElement(By.id("gsft_main")));
			WebElement userNameTab = driver.findElement(By.id("user_name"));
			userNameTab.sendKeys("admin");
			WebElement passwordTab = driver.findElement(By.id("user_password"));
			passwordTab.sendKeys("Sethpreeti7");
			WebElement loginBtn = driver.findElement(By.id("sysverb_login"));
			loginBtn.click();
			WebElement userMenu = driver.findElement(By.xpath("//span[text()='User menu']"));
			assertTrue(userMenu.isDisplayed(),"Page is not dispalyed");
	}
		@Test(priority=3)
		public void GoToSearchBar() {
			WebElement searchBar = driver.findElement(By.id("filter"));

			searchBar.sendKeys("incident");
			WebElement createNewOption = driver.findElement(By.linkText("Create New"));
			createNewOption.click();
			//WebElement incidentID = driver.findElement(By.id("incident.form_scroll"));
			//assertTrue(incidentID.isDisplayed(),"Page is not dispalyed");
		}
		
		@Test(priority=4)
		public void storeTheValue() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='gsft_main']")));
		//driver.switchTo().frame(driver.findElement(By.id("sys_original.incident.number")));
		Thread.sleep(1000);
		//int x= 	driver.findElement(By.xpath("//div[@id = 'element.incident.number']")).getLocation().getX();
		//int y= 	driver.findElement(By.xpath("//div[@id = 'element.incident.number']")).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement incidentNo = 	driver.findElement(By.id("sys_original.incident.number"));
		js.executeScript("arguments[0].setAttribute('type', '')",incidentNo);
		String incidentValue =  incidentNo.getAttribute("value");
		//System.out.println("incidentValue "+incidentValue);
		System.out.println(driver.findElement(By.id("sys_original.incident.number")).getAttribute("value"));
		 
		//System.out.println("ValINC_Bool " + incidentValue.startsWith("INC"));
			//assertTrue(incidentValue.startsWith("INC"),"Page is not dispalyed");
		}
		@AfterClass
		public void tearDown() {
			driver.quit();
			
		}
}


