package SeleniumBasic;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//locating dropdown element 
		WebElement dpElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//create a select class object
		Select dropDown = new Select(dpElement);		
			
		//all options of dropdown stored in list
		List<WebElement> options = dropDown.getOptions();
		
		System.out.println("Size of dropdown Options : "+options.size());
		
		int count = 0;
		//iterate through each option.... and select it
		for(WebElement option : options)
		{
			count++;
			dropDown.selectByVisibleText(option.getText());
			System.out.println(count+" - "+option.getText());
		}
	}

}
