package scroll.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement perumbakkam = driver.findElement(By.xpath("(//span[@class='red_text'])[6]"));
		js.executeScript("arguments[0].scrollIntoView(true)",perumbakkam);
		String text=perumbakkam.getText();
		System.out.println(text);
		
		
	}
}
