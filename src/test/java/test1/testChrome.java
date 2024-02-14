package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChrome {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {

		init();
		testLocators();
	}

	public static void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void testLocators() throws InterruptedException {

//		driver.findElement(By.name("firstname")).sendKeys("Selenium");

// upload file
// If the tag is input, use .sendkeys
// if the tag in anything else other then input, use Robot class
//		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Shihab\\Desktop\\Techfios Class\\Selenium\\Selenium\\Session 1.docx");

// link text
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		Thread.sleep(2000);
//		driver.navigate().back();
		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Product")).click();
		
		//xpath absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");

	}

}
