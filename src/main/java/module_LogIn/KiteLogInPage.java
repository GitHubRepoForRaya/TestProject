package module_LogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage 

{
	@FindBy(xpath="//input[@id='userid']") private WebElement UserName;
	@FindBy(xpath="//input[@id='password']") private WebElement Password;
	@FindBy(xpath="//button[text()='Login ']") private WebElement LoginButton;
	
	public KiteLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String UN)
	{
		UserName.sendKeys(UN);
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		LoginButton.click();
	}
}
