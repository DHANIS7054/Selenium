package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Td11_assignment2 {
	public static void main(String[] args) throws InterruptedException {
		//ui dropbox
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")).click();
		WebElement adult = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select"));
		Select opt1 = new Select(adult);
		opt1.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select")).click();
		WebElement child = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select"));
		Select opt2 = new Select(child);
		opt2.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[5]/select")).click();
		WebElement infant = driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[5]/select"));
		Select opt3 = new Select(infant);
		opt3.selectByValue("1");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div/a")).click();
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indigo");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[8]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		//*[@id="root"]/div/div/div[1]/div[1]/div[2]/div/div[8]
		
		
	}
}
