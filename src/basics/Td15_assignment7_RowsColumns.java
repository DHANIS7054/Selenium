package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Td15_assignment7_RowsColumns {

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
		
		List<WebElement> element = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		int rows = element.size();
		System.out.println("NO. OF ROWS = " + rows);
		
		int column = driver.findElements(By.xpath("//table[@class=\"table-display\"]//tr[2]//td")).size();
		System.out.println("NO. OF COLUMNS = " + column);
		
		List<WebElement> text = driver.findElements(By.xpath("//table[@class=\"table-display\"]//tr[3]//td"));
		for(int i=0; i<column; i++) {
		System.out.println(text.get(i).getText());
		}
	}

}
