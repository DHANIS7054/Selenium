package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import net.jodah.failsafe.internal.util.Assert;

public class Tc9_RS_flightBooking_enabledDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

//		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
//
//		{
//
//		System.out.println("its enabled");
//
//		Assert.assertTrue(true);
//
//		}
//
//		else
//
//		{
//
//		Assert.assertTrue(false);
//
//		}
		
		
	}

}
