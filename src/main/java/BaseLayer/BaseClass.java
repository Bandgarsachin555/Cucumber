package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void initialize()
	{
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "\\C:\\Setup Files\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		 driver.get("https://en-gb.facebook.com/reg");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
}
