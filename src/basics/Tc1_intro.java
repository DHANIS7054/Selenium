package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc1_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Str ="";
System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

driver.manage().window().maximize();

driver.get("https://www.google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
ḥī
	}

}
