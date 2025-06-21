package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc5_amazon_mouseGesture{

	public static void main(String[] args) throws InterruptedException {
		//mouse gesture -> move, click, shift+key = CAPS, double click to select, right click
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		//moving mouse pointer & right click(context click)   //build & perform ***
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		//HARRY(caps) and selecting it
		WebElement boxId = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(boxId).click().keyDown(Keys.SHIFT).sendKeys("harry").doubleClick().build().perform();
		
		
	}

}
