package allure;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.fasterxml.jackson.databind.type.TypeBase;

import base.allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners({ allure.class })
public class test extends raau {
	static WebDriver driver;

	@BeforeClass
	public static void driverInitialization() {
		raau bs = new raau();
		bs.setup();
		driver = getdriver();
		driver.get("https://dashboard-emps.g10.pw/organization/transport-manager/login");

	}

	public void homepage() {
		WebElement login = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		login.click();
	}

	@Test(priority = 2)
	@Description("This case is tested by valid function")
	@Severity(SeverityLevel.NORMAL)
	public void loginpage() {
		WebElement username = driver.findElement(By.xpath("(//input[@aria-label='Username'])[1]"));
		username.sendKeys("vasudevan@promantus.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("sddl4");
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
	}
		@Test(priority = 3)
		@Description("This case is tested by invalid function")
		@Severity(SeverityLevel.BLOCKER)
		public void invalidloginpage1(){
			WebElement username1 = driver.findElement(By.xpath("(//input[@aria-label='Username'])[1]"));
			username1.sendKeys("vasudevan@proma.com");
			WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
			password1.sendKeys("sdd");
			WebElement login1 = driver.findElement(By.xpath("//span[text()='Login']"));
			login1.click();
		}
		@Test(priority = 4)
		@Description("This case is tested by invalid function")
		@Severity(SeverityLevel.BLOCKER)
		public void invalidloginpage11(){
			WebElement username1 = driver.findElement(By.xpath("(//input[@aria-label='Username'])[1]"));
			username1.sendKeys("1234567a.com");
			WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
			password1.sendKeys("sd45678d");
			WebElement login1 = driver.findElement(By.xpath("//span[text()='Login']"));
			login1.click();
			WebElement forget = driver.findElement(By.xpath("//i[@mattooltip=\"Show Password\"]"));
			forget.click();
		}
		@Test(priority = 5)
		@Description("This case is tested by shows password option")
		@Severity(SeverityLevel.NORMAL)
		public void forgetpassword(){
			WebElement forget = driver.findElement(By.xpath("//i[@mattooltip=\"Show Password\"]"));
			forget.click();
			
		}
		

	
	  private void invalidloginpage() {
		// TODO Auto-generated method stub
		
	}

	@Test(priority=5)
	  public void rostering() {
		  throw new SkipException( "skip the test");
}
//
//	  @AfterClass
//	  public void teardown() {
//		  driver.close();
	//  }
}	 
