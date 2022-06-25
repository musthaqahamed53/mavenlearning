package mavenlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class openGooglemaven {

	 static WebDriver driver; 
	 public static void main(String[] args) {
		 ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		 ExtentReports extentReports = new ExtentReports();
		 extentReports.attachReporter(reporter);
		 ExtentTest test=extentReports.createTest("Whatsup Duck");
		 
		 
		 System.setProperty("webdriver.gecko.driver", "D:\\CTS\\geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
	    driver.findElement(By.name("q")).submit();
	   // driver.quit();
	    test.pass("Test Passed");
	    extentReports.flush();
	}

}
