package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//import net.jodah.failsafe.internal.util.Assert;

public class Td15_scrollingAndSumming {

	public static void main(String[] args) {
		// SCROLLING
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");//to scroll window
		
		//to scroll any scrolling table or element present in the window
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> num = driver.findElements(By.xpath("//td[4]"));
		int n = num.size();
		int sum = 0;
		//ṇ
		for(int i=0; i<n; i++) {
			int number = Integer.parseInt(num.get(i).getText());
			sum = sum + number;
		}
		System.out.println("Sum = " + sum);
		
		String Total = driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
		int totalAmount = Integer.parseInt(Total);
		if(totalAmount == sum) {
			System.out.println("Corretly added.");
		}
		//Assert.assertEquals(sum,totalAmount);
		
	}

}
