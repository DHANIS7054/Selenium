package basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Td13_QAclick_E2ECountingOpeninglinks {

	public static void main(String[] args) {
		//Real time example -> counting no. of links & opening link in different windows
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//no. of links
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement column = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		//opening links in different windows
		int n = column.findElements(By.tagName("a")).size();
		for(int i=1; i<n; i++) {
//			String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
		}
		//getting title from each window
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
