package mavenlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openGooglemaven {

	 static WebDriver driver; 
	 public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver", "D:\\CTS\\geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
	    driver.findElement(By.name("q")).submit();
	   // driver.quit();
	}

}
