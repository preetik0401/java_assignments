package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks extends DriverInstance{

/*	@BeforeStep
	public void beforeStep(Scenario sc) {
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
	}

	@AfterStep
	public void afterStep(Scenario sc) {
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
	}*/

	@Before
	public void beforeScenairo(Scenario sc) {
		//driver = new ChromeDriver();
		String name = sc.getName();
		System.out.println("The scenario name: "+name);
		System.out.println("Status: "+sc.getStatus());
	}
	@After
	public void afterScenairo(Scenario sc) {
		System.out.println("is Failed: "+sc.isFailed());
		System.out.println("Status: "+sc.getStatus());
		//driver.quit();
	}
}
