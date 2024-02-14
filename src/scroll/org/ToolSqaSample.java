package scroll.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqaSample {
        public static void main(String[] args) {
        	WebDriver driver = new ChromeDriver();
        	driver.get("http://toolsqa.com/");
        	driver.manage().window().maximize();
        	JavascriptExecutor js=(JavascriptExecutor) driver;
        	WebElement la = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
        	js.executeScript("arguments[0],scrollIntoView(true)",la);
        	
   
        	
	
}
}
