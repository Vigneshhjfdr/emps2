package allure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeTest;

public class raau {
	static WebDriver driver;
	
	public void setup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Promantus\\eclipse-workspace\\Allurepro\\exe\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	public static WebDriver getdriver() {
		return driver;
	}

}
