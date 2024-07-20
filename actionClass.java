package SeleniumBasic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebElement about,acadmincs,reseach,administration,bod,studentcorner, usefulLinks,eLearnig,feedback, contact;
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		
		about =driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
		
		//action class use for performing mouse hover, right click, drag and drop, single click, double click
		Actions action = new Actions(driver);		
		action.moveToElement(about).build().perform();
		
		Thread.sleep(2000);				
		acadmincs = driver.findElement(By.xpath("//span[@id='stUI45_txt']"));
		action.moveToElement(acadmincs).doubleClick().build().perform();
		
		reseach = driver.findElement(By.xpath("//span[@id='stUI187_txt']"));
		Thread.sleep(2000);
		action.moveToElement(reseach).build().perform();
		
		administration = driver.findElement(By.xpath("//td[@id='stUI197_cnt']"));
		Thread.sleep(2000);
		action.moveToElement(administration).build().perform();
		
		bod = driver.findElement(By.cssSelector("tbody tr td:nth-child(11)"));
		Thread.sleep(2000);
		action.moveToElement(bod).build().perform();
		
		studentcorner = driver.findElement(By.xpath("//span[@id='stUI239_txt']"));
		Thread.sleep(2000);
		action.moveToElement(studentcorner).build().perform();
		
		usefulLinks = driver.findElement(By.xpath("//span[@id='stUI263_txt']"));
		Thread.sleep(2000);
		action.moveToElement(usefulLinks).build().perform();
		
		eLearnig = driver.findElement(By.xpath("//span[@id='stUI287_txt']"));
		Thread.sleep(2000);
		action.moveToElement(eLearnig).build().perform();
		
		feedback = driver.findElement(By.xpath("//span[@id='stUI296_txt']"));
		Thread.sleep(2000);
		action.click(feedback).build().perform();
		
		contact = driver.findElement(By.cssSelector("#stUI296_txt"));
		Thread.sleep(2000);
		action.contextClick(contact).build().perform();
		
		Thread.sleep(10000);
		driver.close();
	}

}
