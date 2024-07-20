package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;

public class ReusableMethod {
	public WebDriver driver;
	
	public ReusableMethod(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchWindowToChild() {
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		String parantWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
	

