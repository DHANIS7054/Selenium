package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc7_assignment5_frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Nested Frames")).click(); //using link_text locator
		driver.switchTo().frame("frame-top"); //switching by string
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
	
	}

}
