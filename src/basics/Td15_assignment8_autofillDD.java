package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Td15_assignment8_autofillDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		//driver.findElement(By.id("ui-id-1"));
		List<WebElement> countries = driver.findElements(By.className("ui-menu-item"));
		
		for(WebElement country : countries) {
			if(country.getText().equalsIgnoreCase("United Arab Emirates")) {
				country.click();
			}
		}
	}

}
