package TestCases;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Utility;
//import bBScripts_withHtmlReport.Reporter;
//import bBScripts_withHtmlReport.Reporter;

public class Shipping_Boxvalidation extends Utility{
	
	public static void freebie(String File_TestData) throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		for(int i=1;i<=1;i++)
		{
			//try {
			
			setExcelFile(Path_TestData + File_TestData,"Input");
		String 	getexcelurl = getCellData(i,0);
		System.out.println("initialpath "+Path_TestData + File_TestData);
			try {

			driver.get(getexcelurl);
			System.out.println( i   +  "getexcelurl "+ getexcelurl);
			Reportlog(driver,"Done", "captureImg "+getexcelurl,"//"+"Screenshot");
			
//			}catch(Exception e) {
//				
//			}
			try
			{
				//JOptionPane.showConfirmDialog(null, null);
			String ShipBox = driver.findElement(By.xpath("//div[@class='shippingBox']")).getText();
			System.out.println("Data is "+ ShipBox );
			setExcelFile(Path_TestData + File_TestData, "Input");
			System.out.println("writepath "+Path_TestData + File_TestData);
			Thread.sleep(2000);
			setCellData(ShipBox, i, 1,File_TestData);
			setCellData("pass", i, 2,File_TestData);
			Reportlog(driver,"Pass", "Shipping box Exist in page "+getexcelurl,"//"+"Screenshot");
			//Reporter.Reportlog("Pass", " Shipping box Exist in page " +  getCellData(i,0) );
			
			}
			catch(Exception e)
			{
				setExcelFile(Path_TestData + File_TestData, "Input");
				System.out.println("writepathfail "+Path_TestData + File_TestData);
				setCellData("Fail", i, 2,File_TestData);
				Reportlog(driver,"Fail", "Shipping box not Exist in page "+getexcelurl,"//"+"Screenshot");
				
			}
		}catch(Exception e) {
			System.out.println("writepathouterfail "+Path_TestData + File_TestData);
		}
			
			

}}}