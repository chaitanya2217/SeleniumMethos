package SeleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/?url=https://www.ajio.com%3Fgad_source%3D1&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_August2019&utm_content=&gclid=Cj0KCQjw-uK0BhC0ARIsANQtgGPg9vw2LPMI0rNiW05ETDjyWg60kE-y6Ht91o_ws26xniMxk2GVth0aAgaREALw_wcB");
		driver.manage().window().maximize();
		
		WebElement MEN = driver.findElement(By.xpath("//a[@title='MEN']"));
		
		//action class use for performing mouse hover, right click, drag and drop, single click, double click
		Actions action = new Actions(driver);		
		action.moveToElement(MEN).build().perform();
		
		Thread.sleep(2000);				
		WebElement jactetCoats = driver.findElement(By.xpath("//*[@href=\"/men-jackets-coats/c/830216010\"]"));
		action.moveToElement(jactetCoats).doubleClick().build().perform();
		
		WebElement WOMEN = driver.findElement(By.xpath("//a[@title='WOMEN']"));
		Thread.sleep(2000);
		action.moveToElement(WOMEN).build().perform();
		
		WebElement KIDS = driver.findElement(By.xpath("//span[@aria-label='KIDS']"));
		Thread.sleep(2000);
		action.moveToElement(KIDS).build().perform();
		
		WebElement BEAUTY = driver.findElement(By.xpath("//span[@aria-label='BEAUTY']"));
		Thread.sleep(2000);
		action.moveToElement(BEAUTY).build().perform();
		
		WebElement HOMEKITCHEN = driver.findElement(By.xpath("//span[@aria-label='HOME AND KITCHEN']"));
		Thread.sleep(2000);
		action.moveToElement(HOMEKITCHEN).build().perform();
		
		WebElement wishList = driver.findElement(By.xpath("//a[normalize-space()='Window Curtains']"));
		Thread.sleep(2000);
		action.contextClick(wishList).perform();
		
		
		
		Thread.sleep(10000);
		driver.close();
	}

}
