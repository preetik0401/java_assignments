package assignment;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UIValidation {
	
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
		WebElement allOption = driver.findElement(By.xpath("//a[@id = 'b55b4ab0c0a80009007a9c0f03fb4da9']"));
		allOption.click();
		//WebElement incidentID = driver.findElement(By.id("incident.form_scroll"));
		//assertTrue(incidentID.isDisplayed(),"Page is not dispalyed");
	}
	
	@Test(priority=4)
	public void Validation() throws InterruptedException {
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='gsft_main']")));
	Thread.sleep(1000);
	WebElement incidentLink = 	driver.findElement(By.xpath("//h2[@class='navbar-title list_title ']"));
	//WebElement newBtn = 	driver.findElement(By.xpath("//button[@id ='sysverb_new']"));
	assertTrue(incidentLink.isDisplayed(),"Page is not dispalyed");
	}
	
	@Test(priority=5)
	public void verifyNewBtn() throws InterruptedException {
	
	WebElement newBtn = 	driver.findElement(By.xpath("//button[@id ='sysverb_new']"));
	assertTrue(newBtn.isDisplayed(),"Page is not dispalyed");
	}
	
	@Test(priority=6)
	public void verifySearchDropDown() {

		WebElement searchBtnDropDown = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select oSelect = new Select(searchBtnDropDown);
		//Select oSelect = new Select(selItems);
		WebElement option = oSelect.getFirstSelectedOption();
		String SelectedText = option.getText();
		//System.out.println(SelectedText);
		//Boolean noIsSelected = oSelect.selectByVisibleText("Number");
		assertTrue(option.isSelected(),"Page is not dispalyed");
	}
	
	@Test(priority=6)
	public void verifySearchTextBox()  {

		WebElement searchTextBox = driver.findElement(By.xpath("//input[@class='form-control' and @placeholder = 'Search']"));
		String searchTextBoxValue =  searchTextBox.getAttribute("placeholder");
		System.out.println(searchTextBoxValue);
		//assertTrue(searchTextBoxValue.isDisplayed(),"Page is not dispalyed");
	}
	
	@Test(priority=7)
	public void verifyTableHeader()  {

		WebElement showNumberHeader = driver.findElement(By.xpath("//i[@title='Column options']/following::a[text()='Number'][1]"));
		//String searchTextBoxValue =  searchTextBox.getAttribute("placeholder");
		//System.out.println(searchTextBoxValue);
		assertTrue(showNumberHeader.isDisplayed(),"Page is not dispalyed");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
