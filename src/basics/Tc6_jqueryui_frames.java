package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc6_jqueryui_frames {

	public static void main(String[] args) throws InterruptedException {
		// Switching to frame and using mouse gesture-drag&drop in it
		//iframe or frameset or frame are tagnames in dev. tool
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		
		//switching to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame); //driver.switchto().frame((id)*/index/string or name/web element)
		
		//drag & drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//build and perform
		a.dragAndDrop(source, target).build().perform();
		
		//switching out of frame to perform other actions
		driver.switchTo().defaultContent();
		
	}

}
