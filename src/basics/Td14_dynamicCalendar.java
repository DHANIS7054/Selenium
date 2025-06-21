package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Td14_dynamicCalendar {

	public static void main(String[] args) {
		//Dynamic Calendar
		String month = "January";
		String date = "6";
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		calendar(driver,month,date);
	}
	public static void calendar(WebDriver driver,String month, String date) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		//current date
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.cssSelector("td.active.day")).click();
		System.out.println(driver.findElement(By.id("travel_date")).getText());
		
		//random date -> 6jan
		driver.findElement(By.id("travel_date")).click();
		String monthFrame = driver.findElement(By.className("datepicker-switch")).getText();
		while(!monthFrame.equalsIgnoreCase(month)) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[2]")).click();
		}
		List<WebElement> dateFrame = driver.findElements(By.className("datepicker"));
		int n = dateFrame.size();
		for(int i=0; i<n; i++) {
			if(dateFrame.get(i).getText().equalsIgnoreCase(date)) {
				if(dateFrame.get(i).isEnabled()) {
					dateFrame.get(i).click();
					break;
				}
			}
		}
	}

}
