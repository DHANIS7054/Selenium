package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc9_RS_filghtbooking_dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//above click is imp otherwise unable to locate below element
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		//two matching value for Delhi -> finding webelement of the destination & then of delhi
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
	}

}
