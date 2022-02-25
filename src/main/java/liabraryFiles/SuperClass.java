package liabraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClass 
{
	public WebDriver driver;
	
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Project Softwares\\ChromeDriver\\chromedriver_97\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
}
