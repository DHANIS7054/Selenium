package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc9_RS_filghtbooking_staticDropdown {

	public static void main(String[] args) {
		// Static drop_down -> just select one option from FINITE options
		// select is tag name in developers tool
System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//to select web element of the box in which options are kept
WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
// to select option
Select option = new Select(drop);
option.selectByIndex(2); // by index/string value attribute/string visible name
System.out.println(option.getFirstSelectedOption().getText());

	}

}
