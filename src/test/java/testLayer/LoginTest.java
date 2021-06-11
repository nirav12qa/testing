package testLayer;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMpackage.POM_Login;
import basePackage.BaseHRM;

public class LoginTest extends BaseHRM {

	POM_Login Log;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void initialSetup() {
		initiate();
		Log = new POM_Login();
	}
	
	@Test
	public void Title() {
		String actual = Log.verify();
		Assert.assertEquals(actual, "OrangeHRM");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
}
