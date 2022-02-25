package liabraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Class\\Testing\\Java\\codeWithPramod\\KiteZerodha\\TestData\\Aug21.xlsx");
		String value=WorkbookFactory.create(file).getSheet("DDF1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;	
	}
	
	public static void capureScreenshot(WebDriver driver, int TCID) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Class\\Testing\\Java\\codeWithPramod\\KiteZerodha\\Screenshot\\TCID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
}
