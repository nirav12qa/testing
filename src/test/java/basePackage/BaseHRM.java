package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class BaseHRM {

	public static Properties prop = new Properties();
	public static WebDriver driver;
	
	
	//step - 1 , creating constructor
	public BaseHRM() {
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\nirav\\eclipse-workspace\\HRManagement\\src\\test\\java\\enviornmentVariables\\Config.properties");
			prop.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
	
	//Step - 2 , 
	public static void initiate() {
	String browsername  = prop.getProperty("browser");
	
	if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browsername.equals("Chrome")){
	
		System.setProperty("webdriver.chrome.driver", "chrome.exe");
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"))  ;
	}
	
	
}
