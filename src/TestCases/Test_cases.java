package TestCases;


import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Utilities.Utility;


public class Test_cases extends Utility{
	
	//public static WebDriver driver = getdriver("chrome");
	
//	public static void launchURL(String url) throws Throwable
//	{
//		
//	System.out.println(" path "+Path_TestData);
//	System.out.println("file "+File_TestData);
//	System.out.println("**Chrome driver initiated**");
//	if (driver==null)
//	{
//		Reportlog(driver,"Done", "Driver session is not null","");
//		
//	}
//	else
//	{
//		try {	
//			
//			
//			driver.get(url);
//			Reportlog(driver,"Done", "Launching URL","");
//	System.out.println("**Chrome driver initiated**2");
//		} catch (Exception e) {
//			System.out.println("Error " + e.toString());
//			Reportlog(driver,"Error", e.toString(),"");
//			
//		}
//		}	
//
//}
//
//	public static WebDriver getdriver(String Browser)
//	{
//		
////		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
////			  
////		    driver = new ChromeDriver();
////		    driver.manage().window().maximize();
////		    System.out.println("**Chrome driver initiated1**");
////		return driver;
//		switch(Browser) {
//        case "chrome" :
//           System.out.println("Chrome driver launched"); 
//          // Reporter.Reportlog(driver,"Done", "Chrome driver launched");
//   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Chromdrivr\\chromedriver.exe\\");
//   		
//   	    driver = new ChromeDriver();
//   	    
//   	   // HtmlUnitDriver driver = new HtmlUnitDriver();
//   		driver.manage().window().maximize();
//   		return driver;	
//        case "firefox" :
//           System.out.println("Firefox driver launched");
//    //      Reporter.Reportlog(driver,"Done", "Firefox driver launched");
//       	System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\gecko\\geckodriver.exe");
//		
//		  driver = new FirefoxDriver();
//		    
//		   // HtmlUnitDriver driver = new HtmlUnitDriver();
//			driver.manage().window().maximize();
//          return driver;
//           default :
//           System.out.println("No driver launched");
//		
//		}
//		return null;
//		}

	
//	public static void Zeropricefunctionality(String File_TestData) throws Throwable
//	{
//	try {
//			for (int i=0;i<=0;i++ )
//			{	
//				System.out.println("Path_TestData + File_TestData "+Path_TestData + File_TestData);
//				setExcelFile(Path_TestData + File_TestData, "Input");
//			String getexcelurl = getCellData(i, 0);
//			System.out.println("getexcelurl "+getexcelurl);
//			driver.get(getexcelurl);
//			JOptionPane.showConfirmDialog(null, null);
//			Reportlog(driver,"Done", "Fetch URL from Excel : "+getexcelurl);
//	    System.out.println(i+" "+getexcelurl);	
//	    try {
//	    WebDriverWait wait = new WebDriverWait(driver,Timeinsec);
//	   	wait.until(ExpectedConditions.elementToBeClickable
//					(By.xpath("//a[@class='closebtn']")));
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[@class='closebtn']")).click();
//			System.out.println("popup closed");
//			Thread.sleep(5000);
//			}catch (Exception e)
//	    {
//				e.printStackTrace();
//	    }
//			if(driver.getCurrentUrl().contains("404")) 
//			{
//				  System.out.println("Fail "+ driver.getCurrentUrl() +" contains  404");
//				  Reportlog(driver,"Fail", driver.getCurrentUrl() +" contains  404");
//				  String url=driver.getCurrentUrl();
//				  
//				  System.out.println("broken url is"+ url );
//				  Reportlog(driver,"Done", "broken url is"+ url );
//				  setExcelFile(Path_TestData + File_TestData, "Sheet1");
//					setCellData(url, i, 2);
//				  
//			}
//			else 
//			{
//				try
//				{
//						
//		//	waitForLoaderToDisMiss2(driver);
//			Thread.sleep(3000);
//			String getdata = driver.findElement(By.xpath("//span[@itemprop='price']")).getText();
//			
//			System.out.println("Actual price "+getdata);
//			if(getdata.trim().equals("0.00"))		
//			{
//				Reportlog(driver,"Fail", "Actual price "+getdata );
//			}
//			else
//			{
//				Reportlog(driver,"Pass", "Actual price "+getdata );
//			}
//				
//			setExcelFile(Path_TestData + File_TestData, "Input");
//			setCellData(getdata, i, 1);
//			String getactpric=getCellData(i, 2);
//			System.out.println("Actual price  "+getactpric  );
//		//	Reportlog(driver,"Done", "Actual price  "+getactpric);
//				} catch (Exception e) {
//				      System.out.println("Fail Something went wrong. "+driver.getCurrentUrl());
//				      JOptionPane.showConfirmDialog(null, null);
//				      Reportlog(driver,"Fail", "Something went wrong. "+ driver.getCurrentUrl());
//				      
//				    }
//			
//				String getexpprice = getCellData(i, 1);
//				System.out.println("expected price" + getexpprice);
//					}}}catch(Exception e) {
//					throw (e);
//				}
//	
//	}
	
	public static void test()
	{
//		JOptionPane.showConfirmDialog(null, null);
		driver.get("https://yahoo.com");
		//WebDriverWait wait = new WebDriverWait(driver, 170);
//		JOptionPane.showConfirmDialog(null,"data1");
		
	}

	
}
