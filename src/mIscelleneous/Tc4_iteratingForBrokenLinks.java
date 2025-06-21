package mIscelleneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc4_iteratingForBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// BROKEN LINK
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
		
			String url =link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			
			if(respCode>400) {
				System.out.println("The link with text "+link.getText()+"is broken with code "+respCode);
//				Assert.assertTrue(false);
			}
		
		}
	}
}
	



