package selenium_secondclass;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw2 {
	WebDriver driver;

	@Before
	public void inte() {
		System.setProperty("webdriver.chrome.driver", "driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://objectspy.space/\r\n");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void locators() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("jorden");
		driver.findElement(By.name("lastname")).sendKeys("Biden");
		driver.findElement(By.name("Password")).click();
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("date");
		Thread.sleep(4000);

		// upolde the file

		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\diyor\\OneDrive\\Documents\\JIRA");

//		driver.findElement(By.id("photo"))
//				.sendKeys("C:\\Users\\diyor\\OneDrive\\Desktop\\TF Soft\\TF Soft\\How to install VMWare.docx");
		// if not input tag then wee need to use robot class

		// link text

		// driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// Thread.sleep(5000);

		// go back

		// driver.navigate().back();

		// partial link text

		// only one can run at time 45 or 55 line code
		// driver.findElement(By.partialLinkText("Backend")).click();

		// cssselecter
		driver.findElement(By.cssSelector("input#exp-4")).click();

//		line 51 & 52 code are same but different way make it
		// driver.findElement(By.cssSelector(" input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		driver.findElement(By.cssSelector("input[id='profession-0']")).click();

		// relative xpath
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium is fun");
		driver.findElement(By.xpath("//input[@value='7']")).click();
		driver.findElement(By.xpath("//input[@name='exp' and @value='4']")).click();

		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		// Thread.sleep(5000);
		// driver.navigate().back();
		// driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New
		// Page')]")).click();

		// driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium
		// is fun");

	}

	public void teardown() {
		driver.close();
		driver.quit();
	}
}