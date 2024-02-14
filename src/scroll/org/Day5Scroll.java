package scroll.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor) driver;
	Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-500)");
		//WebElement btn1 = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		WebElement btn1 = driver.findElement(By.xpath("//div[@class='youtube__channel--info']"));
		j.executeScript("arguments[0].scrollIntoView(true)",btn1);
		//btn1.click();
		//WebElement btn2 = driver.findElement(By.xpath("//h1[@class='articles__list--heading']"));
		
		
	}

}
