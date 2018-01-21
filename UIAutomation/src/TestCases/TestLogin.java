package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {
	
	
	static ChromeDriver webdriver;
	
	@Test
	public void login() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		webdriver = new ChromeDriver(chromeOptions);
		
		webdriver.get("http://10.208.41.6:8080/BOE/BIAdminConsole");
		Thread.sleep(2000);
		webdriver.switchTo().frame("servletBridgeIframe");
		Thread.sleep(7000);
		WebElement userNameTB = webdriver.findElement(By.xpath("//*[@placeholder='User Name']"));
		userNameTB.sendKeys("Administrator");

		WebElement passwordTB = webdriver.findElement(By.xpath("//*[@placeholder='Password']"));
		passwordTB.sendKeys("Password1");

		WebElement signinB = webdriver.findElement(By.xpath("//*[text()='Sign in']"));
		signinB.click();
	}

	@BeforeSuite
	public static void beforeSuite() {
		System.setProperty("webdriver.chrome.driver","C:\\dependencies\\chromedriver.exe");	
	}

	@AfterSuite
	public void afterSuite() throws InterruptedException {
		Thread.sleep(10000);
		//webdriver.quit();
	}

}
