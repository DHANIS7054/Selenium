package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Td13_sync_assignment3{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.pollingEvery(Duration.ofSeconds(5));
		
		//EXPLICIT WAIT
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());
		
	}

}
