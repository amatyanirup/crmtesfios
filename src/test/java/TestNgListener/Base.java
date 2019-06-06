package TestNgListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
 public static WebDriver driver;
 
 public static void initialization() {
	System.setProperty("webdriver.chrome.driver","C:\\Auto\\chromedriver.exe" );
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com");
 }
public void failscreenshot(String testmethodName) {
	File Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(Src,new File("C:\\Users\\Nirup\\eclipse-workspace\\Crm-techfios\\screenshot\\"+testmethodName+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
	
	
	
	
	
	
	
}
