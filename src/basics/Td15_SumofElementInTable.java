package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Td15_SumofElementInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('table#product')");
		
		List<WebElement> element = driver.findElements(By.xpath("//table[@class='table-display']//td[3]"));
		int size = element.size();
		int sum = 0;
		for(int i=0; i<size; i++) {
			int num =Integer.parseInt(element.get(i).getText());
			sum = sum + num;
		}
	System.out.println("SumTotal = " + sum);
		
	}

}
