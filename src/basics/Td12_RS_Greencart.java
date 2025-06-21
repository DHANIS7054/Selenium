package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Td12_RS_Greencart {

	public static void main(String[] args) throws InterruptedException {
		// E2E GREEN CART
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","carrot"};
		int[] kg = {1,3,1,1};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);
		
		int n = itemsNeeded.length;
		int m = driver.findElements(By.cssSelector("h4.product-name")).size();
		
		for(int i=0; i<m; i++) {
			String vege = driver.findElements(By.cssSelector("h4.product-name")).get(i).getText().split("-")[0].trim();
			for(int j=0; j<n; j++) {
				if(vege.equalsIgnoreCase(itemsNeeded[j])) {
					for(int k=1; k < kg[j]; k++)//k=1 -> 1kg is already there 
					{
					driver.findElements(By.className("increment")).get(i).click();
					}
					driver.findElements(By.xpath("//button[@type='button']")).get(i+1).click();
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		//WebDriverWait w = new WebDriverWait(driver,8);
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("span.promoInfo"))));
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		
	}

}
	

