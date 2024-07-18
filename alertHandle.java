package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class alertHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		Thread.sleep(1000);
		
		//alert box
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();		

		//alert class for switching handle to popups 
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.accept();
		
		//confirm box
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.accept();
		
		//prompt box
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Chaitanya Here");
		Thread.sleep(1000);
		alert.accept();	
		WebElement promptVerify = driver.findElement(By.xpath("//p[@id='promptreturn']"));
		System.out.println("Prompt send text : "+promptVerify.getText());
	}
}
