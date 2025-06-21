package selenium_4_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator.*;



public class Tc1_topBottom_leftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		//System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		//System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());


		
	}

}
