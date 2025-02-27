package base;

import javax.swing.Spring;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.fasterxml.jackson.databind.type.TypeBase;

import allure.raau;
import allure.test;
import io.qameta.allure.Attachment;

public  class allure implements ITestListener{
	public void onTestFailuer(ITestResult result) {
         savescreenshotonfailure(raau.getdriver());
		  savelog(result.getMethod().getConstructorOrMethod().getName());
		  
		  
	  }
	 
	  @Attachment(value = "screenshot",type = "img/png")
	  public byte[] savescreenshotonfailure(WebDriver driver) {
		  return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	  }
	  @Attachment(value = "stackrace",type = "text/plain")
	  public static String savelog(String message) {
		  return message;

}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
