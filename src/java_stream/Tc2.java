package java_stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc2 {

	public static void main(String[] args) {
		// enter rice on search box and selecting rice
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

        //1 results

       List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).

        collect(Collectors.toList());

       //1 result

      // Assert.assertEquals(veggies.size(), filteredList.size());
	}

}
