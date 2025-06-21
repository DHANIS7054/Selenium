package basics;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc4_assignment4_windowSwitch{

	public static void main(String[] args) throws InterruptedException {
		
		//Switching from parent window to child and vice-versa
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'columns')]/div[@class='example']/h3")).getText());
		
		driver.quit();
	}

}
