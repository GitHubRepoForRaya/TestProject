package module_LogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyProfilePage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement Profile;
	
	public VerifyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUserID()
	{
		String UserID = Profile.getText();
		
		return UserID;
	}
}
