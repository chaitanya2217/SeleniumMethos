package SeleniumBasic;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFileRobotClass {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Choose file")).click();
		
		//copy file(path) to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\Lenovo\\OneDrive\\Desktop\\SDET_Chaitanya_J_CV_2024_M.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//robot class for keyboard buttons
		Robot r = new Robot();
		r.delay(2000);
		
		//perform CONTROL + V btn for paste file path 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//release buttons
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
				
		System.out.println("File Uploaded Succesfull");
	}

}
