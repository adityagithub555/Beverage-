package testLiquids1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomLiquids1.Headers1;

public class TestLiquids2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:\\Velocity\\PATH\\path of chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	driver.get("https://livingliquidz.com/");

	Headers1 headers1 =new Headers1 (driver);
	headers1.clickOnHeaders();
	
}
}
