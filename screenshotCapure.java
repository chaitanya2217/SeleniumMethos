package SeleniumBasic;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;


public class screenshotCapure {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"search_button\"]"));
		
		if(e1.isDisplayed())
		{
			System.out.println("Browser Launch & WebSite Will be opend succesfull");
		}
		
		File obj1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(obj1,new File(("D:\\eclipse_Installation\\output Sreenshots\\Screenshot3.png")));
		System.out.println("Screenshot is captured");	
		
		
	}

}
