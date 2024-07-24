package SeleniumBasic;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class robot_JSE{

	public static void main(String[] args) throws AWTException {
			
		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='gn-search-input']")).sendKeys("football shoes");
	
		//when search button is not available then use robot class for perform some keyboard actions
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(1000);
		
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
	
	}

}
