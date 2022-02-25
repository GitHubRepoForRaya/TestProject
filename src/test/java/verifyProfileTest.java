import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import liabraryFiles.SuperClass;
import liabraryFiles.UtilityClass;
import module_LogIn.KiteLogInPage;
import module_LogIn.LoginContinuePage;
import module_LogIn.VerifyProfilePage;

public class verifyProfileTest extends SuperClass 
{
	KiteLogInPage objLoginPage;
	LoginContinuePage objLogInContinue;
	VerifyProfilePage objVerifyProfile;
	public int TCID;
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		objLoginPage=new KiteLogInPage(driver);
		objLogInContinue=new LoginContinuePage(driver);
		objVerifyProfile=new VerifyProfilePage(driver);
	}
	
	@BeforeMethod
	public void logIntoZerodha() throws EncryptedDocumentException, IOException, InterruptedException
	{
		objLoginPage.setUserName(UtilityClass.getTestData(0, 0));
		objLoginPage.setPassword(UtilityClass.getTestData(0, 1));
		
		Thread.sleep(2000);
		objLoginPage.clickLoginButton();
		
		objLogInContinue.setPIN(UtilityClass.getTestData(0, 2));
		objLogInContinue.clickContinueButton();
	}
	
	@Test
	public void VerifyUserName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=1;
		Thread.sleep(5000);
		String actualUID=UtilityClass.getTestData(0, 0);
		String expectedUID=objVerifyProfile.getUserID();

		Assert.assertEquals(actualUID, expectedUID);
	}
	
	@AfterMethod
	public void result(ITestResult r) throws IOException
	{
		if(r.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.capureScreenshot(driver, TCID);
		}
		else
			System.out.println("Profile Name Matched");
	}
}
