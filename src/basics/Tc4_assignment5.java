package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc4_assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Switching from parent window to child and vice-versa
		
				System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();

				driver.manage().window().maximize();
				
				driver.get("https://rahulshettyacademy.com/loginpagePractise/");
				Thread.sleep(2000);
				
				driver.findElement(By.id("password")).sendKeys("learning");
				driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
				driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
				//driver.switchTo().alert();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
				driver.findElement(By.id("okayBtn")).click();

//				driver.findElement(By.className("form-control")).click();
//				driver.findElement(By.className("form-control")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
				
				WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
				Select dropdown = new Select(options);
				dropdown.selectByValue("consult");
				driver.findElement(By.id("signInBtn")).click();
				
				driver.findElement(By.id("terms")).click();
				driver.findElement(By.id("signInBtn")).click();
				//Thread.sleep(4000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
				
//				JavascriptExecutor js= (JavascriptExecutor)driver;
//				js.executeScript("window.scrollBy(0,500)");
				
				List<WebElement> buttons = driver.findElements(By.tagName("button"));
				int n = buttons.size();
				//start from 1, 0th index is hidden so non interactable
				for(int i=1; i<n; i++) {
					buttons.get(i).click();
				}
				
				//buttons.stream().forEach(s->s.click()); ->it starts from 0th index
				
				driver.findElement(By.xpath("//a[contains(@class,'btn-primary')]")).click();
			
	}

}
