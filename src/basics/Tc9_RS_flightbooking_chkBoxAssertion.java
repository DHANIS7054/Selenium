package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;

public class Tc9_RS_flightbooking_chkBoxAssertion {

	public static void main(String[] args) {
		// Checkbox tick and assertion->true/false 

		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//ASSERTION
		//Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());		
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		
		//count of no. of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),"6");
		
	}

}
