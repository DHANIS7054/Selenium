package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc3_new_rahulshetty_windowSwitch {

	public static void main(String[] args) throws InterruptedException {
		// Switching between windows & drag and drop 
		// dragging email id from child window and dropping in parent window
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		Thread.sleep(2000);
		
		//for switching between windows
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		
		//dragging
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String email = driver.findElement(By.cssSelector("p.im-para.red")).getText().split(" ")[4].trim();
		
		//dropping
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);
		
		//clear
		driver.findElement(By.cssSelector("#username")).clear();
		
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		//driver.findElement(By.cssSelector(".checkmark")).click();
		driver.findElement(By.xpath("//*[@id = 'terms']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-info.btn-md")).click(); //btn btn-info btn-md
		driver.quit();
		
		
	}

}
