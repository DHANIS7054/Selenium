package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc9_RS_flightbooking_autoSuggestiveDD {

	public static void main(String[] args) throws InterruptedException {
		// Auto suggestive drop_down
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
		
	}

}
