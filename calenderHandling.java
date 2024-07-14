package SeleniumBasic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderHandling {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker")).click();
					
		String Date,Year,Month;
		Month= driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
		Year  = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
		Date = driver.findElement(By.xpath("//*[@class=\"ui-state-default ui-state-highlight ui-state-hover\"]")).getText();
		System.out.println("Todays Date : "+Date+" "+Month +" "+Year);
				
		while(!(Month.equals("August") && (Year.equals("2027")))) {
			
			driver.findElement(By.xpath("//a[@title=\"Next\"] ")).click();
			Month = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
			Year = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
			//System.out.println(Month +" "+Year);
		}
		
		//select the date		
		WebElement date = driver.findElement(By.xpath("//a[text()='15'] "));
		date.click();
		
		System.out.println("Selected date is : "+date.getText()+" "+Month+" "+Year);
	}

}
