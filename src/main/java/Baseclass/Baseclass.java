package Baseclass;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	
	public static void BrowserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	
	public static boolean elementIsDispalyed(WebElement element) {
		boolean display=false;
		try {
			display=element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not visible : "+e.getMessage());
		}
		return display;
	}
	
	public static String PropertyRead(String key) throws IOException {
		String path=".\\src\\test\\resources\\propertyfile\\Config.properties";
		String value=null;
		try {
			FileReader f=new FileReader(path);
			Properties pro=new Properties();
			pro.load(f);
				 value = pro.getProperty(key);
		} catch (Exception e) {
			
		}
		return value;
	}
	
	
}
