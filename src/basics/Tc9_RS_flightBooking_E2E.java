package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc9_RS_flightBooking_E2E {

	public static void main(String[] args) throws InterruptedException {
		//E2E FLIGHT BOOKING
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//COUNTRY
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

		//CURRENCY 
		WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select option = new Select(drop);
		int n = 2; //index of currency
		option.selectByIndex(n); // by index/string value/string name
		System.out.println(option.getFirstSelectedOption().getText());
		
		
		//PASSENGERS
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		int adults = 3; //Put value for no. of adults
		for(int i=1;i<adults;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		int childs = 2; //put value for no. of child
		for(int i=0; i<childs; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		int infants = 1; ////put value for no. of infants
		for(int i=0; i<infants; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		
		//CITY
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		//DATE(today's)
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[2]/a")).click();
		
		//CHECKBOX
		driver.findElement(By.cssSelector("[name*='friendsandfamily']")).click();
		
		//SEARCH
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//RADIO BUTTON
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.close();
		System.out.println("Done!! Flight booked.");
		
	}

}
