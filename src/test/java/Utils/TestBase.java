package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_propertyFile = prop.getProperty("browser");
		String mvn_browser = System.getProperty("browser");
		String browser = mvn_browser!=null ? mvn_browser : browser_propertyFile;
		
		if(driver == null) {
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("fireFox"))
			{
				driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}
			return driver;
	}

}
