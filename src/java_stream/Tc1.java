package java_stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		
		driver.findElement(By.id("name")).sendKeys("Dhanishtha Sahu");
		driver.findElement(By.id("email")).sendKeys("dhanishthashu2906@gmail.com");
		driver.findElement(By.id("form-submit")).click();
		

		// click on column

		driver.findElement(By.xpath("//tr/td[1]")).click();



		// capture all webelements into list

		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));



		// capture text of all webelements into new(original) list

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());



		// sort on the original list of step 3 -> sorted list



		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		//Assert.assertTrue(originalList.equals(sortedList));

		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

		price = rows.stream().filter(s -> s.getText().contains("Rice"))

		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));

		if(price.size()<1)

		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();

		}

		}while(price.size()<1);



		}



		private static String getPriceVeggie(WebElement s) {

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return pricevalue;
	}

}
