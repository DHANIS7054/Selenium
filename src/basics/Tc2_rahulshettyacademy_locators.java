package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc2_rahulshettyacademy_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("harry potter");
		driver.findElement(By.name("inputPassword")).sendKeys("qwer123");
		driver.findElement(By.className("signInBtn")).click();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		String a = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(a);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Elena");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("elena@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder*='Number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String b = driver.findElement(By.xpath("//div/form/p")).getText();
		System.out.println(b);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Elena");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		//driver.findElement(By.cssSelector("div span input")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		//String c = driver.findElement(By.cssSelector("div div div div h2")).getText();
		//String d = driver.findElement(By.cssSelector("div div div div h1")).getText();
		//System.out.println(c);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
