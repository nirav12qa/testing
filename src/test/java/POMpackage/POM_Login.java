package POMpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRM;

public class POM_Login extends BaseHRM {

	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement submitButton;
	
	public POM_Login() {
	
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername() {
		Username.sendKeys("Admin");
	}
	
	public void setPassword() {
		Password.sendKeys("admin123");
	}
	
	public void clickButton() {
		submitButton.click();
	}
	
	public String verify() {
		String a = driver.getTitle();
		System.out.println(a);
		return a;
		
	}
}

