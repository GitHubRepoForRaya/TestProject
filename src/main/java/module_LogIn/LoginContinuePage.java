package module_LogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginContinuePage 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement ContinueButton;
	
	public LoginContinuePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPIN(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickContinueButton()
	{
		ContinueButton.click();
	}
}
