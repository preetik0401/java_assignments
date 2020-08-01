package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//load url
		driver.get("https://erail.in/");
		WebElement searchBoxFrom = driver.findElement(By.id("txtStationFrom"));
		searchBoxFrom.clear();
		searchBoxFrom.sendKeys("MAS",Keys.TAB);
		
		
		WebElement searchBoxTo = driver.findElement(By.id("txtStationTo"));
		searchBoxTo.clear();
		searchBoxTo.sendKeys("Kolkata",Keys.TAB);
		
		
		WebElement sortDateCheckBox = driver.findElement(By.id("chkSelectDateOnly"));
		sortDateCheckBox.click();
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		List<WebElement> trs = table.findElements(By.tagName("tr"));
		System.out.println(trs.size());
		
		List<String> list = new ArrayList<>();
		for (WebElement rows : trs) {
			List<WebElement> cols = rows.findElements(By.tagName("td"));
			list.add(cols.get(1).getText());
		}
		Collections.sort(list);
		/*for (String trainNames : list) {
			System.out.println(trainNames);
		}*/
		List<String> sortedList = new ArrayList<>();
		driver.findElementByLinkText("Train Name").click();
		WebElement sortedTable = 
				driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> sortedRows = sortedTable.findElements(By.tagName("tr"));
		for (WebElement sortedDatas : sortedRows) {
			List<WebElement> tds = sortedDatas.findElements(By.tagName("td"));
			sortedList.add(tds.get(1).getText());
		}
	/*	for (String sortedValues : sortedList) {
			if(sortedList.equals(list)) {
				System.out.println("Matched " + sortedValues);
			}else {
				System.out.println("Not matched " + sortedValues);
			}
		}
		*/
		for(int i=0;i<list.size();i++) {
			if(sortedList.get(i).equals(list.get(i))) {
				System.out.println("2 Matched " + sortedList.get(i));
			} else {
				System.out.println("2 Not matched " + sortedList.get(i));
			}
		}
	}

}
