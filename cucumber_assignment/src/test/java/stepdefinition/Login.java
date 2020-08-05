package stepdefinition;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;
import hooks.DriverInstance;



public class Login extends DriverInstance{
	
	@Given("Launch the ZoomCar Instance")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("load the URL")
	public void loadTheURL() {
		driver.get("https://www.zoomcar.com/chennai/");
	}


	@When("user click on start your wonderful journey")
	public void userStartJourney() {
		//String user = "";
		WebElement clickStartJourney = driver.findElement(By.xpath("//a[@title='Start your wonderful journey']"));
		clickStartJourney.click();
	}

	@And("user click on the popular pickup point as Porur")
	public void userSelectPickUpPoint() {
		WebElement selectPickUpPoint = driver.findElement(By.xpath("//div[contains(text(),'Thuraipakkam')]"));
		selectPickUpPoint.click();
	}

	@And("user click on NEXT")
	public void userClickOnNext() {
		WebElement clickNextBtn = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		clickNextBtn.click();
	}

	@Then("NEXT should success")
	public void nextShouldSuccess() {
		System.out.println("Next success");
	}
	
	@When("user select start date as tomorrow")
	public void selStartDate() {
		WebDriverWait wait =new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.urlToBe("https://www.zoomcar.com/chennai/search"));
		List<WebElement> days = driver.findElementsByXPath("//div[@class='day']");
		days.get(0).click();
	}
	
	@And("user click on next button")
	public void clickOnNext() {
		driver.findElementByXPath("//button[text()='Next']").click();
	}
	
	@Then("next button should success")
	public void nextSuccess() {
		System.out.println("Next success");
	}
	
	@And("user click on the last day")
	public void clickOnLastDay() {
		WebDriverWait wait =new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.urlToBe("https://www.zoomcar.com/chennai/search"));
		List<WebElement> lastdays = driver.findElementsByXPath("//div[@class='day']");
		int days2 = lastdays.size();
		lastdays.get(days2-1).click();
	}
	
	@And("click on DONE")
	public void clickOnDone() {
		driver.findElementByXPath("//button[text()='Done']").click();
	}
	
	@Then("DONE should success")
	public void doneSuccess()  {
		System.out.println("Done Sucess");
	}
		
	@And("user find no of cars available")
	public void findNoOfCars() {
		List<WebElement> carList =driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println("Total no of cars :" + carList.size());
	}
	
	@And("find the highest car price and car name")
	public void selectSubCategory()  {
		WebDriverWait wait =new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.titleContains("Book A Car"));
		List<WebElement> carPriceElement =driver.findElementsByXPath("//div[@class='price']");
		int[] carPrices= new int[carPriceElement.size()];
		System.out.println("carPriceElement size111"+carPriceElement);
		System.out.println("carPriceElement size111"+carPriceElement.size());

		int i=0;
		for(WebElement e:carPriceElement) {
			System.out.println("text " + e.getText());
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
	}

}
