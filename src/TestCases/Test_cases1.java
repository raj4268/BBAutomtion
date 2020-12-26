package TestCases;


//import javax.swing.JOptionPane;

//import java.util.List;
//import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_methods.Reusable;
//import bBScripts_withHtmlReport.Reporter;
import Utilities.Utility;


public class Test_cases1 extends Utility{
	
//	public static WebDriver driver = getdriver("chrome");

//	//}

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
//
//
//	
//	public static void test()
//	{
//	//	JOptionPane.showConfirmDialog(null, null);
//		driver.get("https://yahoo.com");
//		//WebDriverWait wait = new WebDriverWait(driver, 170);
//		//JOptionPane.showConfirmDialog(null,"data1");
//		
//	}

	public static void breadcumb_Validation(String File_TestData) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		for(int i=1;i<=1;i++)
		{
			//try {
			long time=System.currentTimeMillis();
			
			setExcelFile(Path_TestData + File_TestData,"Input");
			System.out.println("Path_TestData + File_TestData "+Path_TestData + File_TestData);
			String getexcelurl = getCellData(i,0);
		//	try {

			driver.get(getexcelurl);
			System.out.println( i   +  "getexcelurl "+ getexcelurl);
			Reportlog(driver,"Done", "Launching Url is "+getexcelurl,"");
	//--get link count
		
			int	linkcnt = driver.findElements(By.xpath("//*[@id='__next']/div/div[2]/div[1]/div/ul/li\r\n")).size();
			System.out.println("linkcnt "+linkcnt);
			
			for(int k=linkcnt;k>=1;k--)
			{
				Thread.sleep(5000);
				System.out.println("xpath "+"(//*[@itemprop='name'])["+k+"]");
			clickjavascriptelement(driver,driver.findElement(By.xpath("(//*[@itemprop='name'])["+k+"]")));
				
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='Loading...']")));
			//	JOptionPane.showConfirmDialog(null, null);
				Thread.sleep(10000);
			//	wait.until
				String getcurturl = driver.getCurrentUrl();
				
				System.out.println("getcurturl "+getcurturl);
				
				if(!(k==1))
				{
				
				String getlinktext = driver.findElement(By.xpath("(//*[@itemprop='name'])["+k+"]")).getText();
				
				System.out.println("getlinktext "+getlinktext);
				
				String expurl = "https://www.bannerbuzz.com/"+getlinktext.replaceAll(" ", "-");
				System.out.println("expurl "+expurl);
				
				if(expurl.trim().equalsIgnoreCase(getcurturl.trim()) && (!driver.getPageSource().contains("PageNotFound")) && (!driver.getPageSource().contains("Page Not Found")))
				{
					System.out.println("pass");
					setCellData("pass", i, 1,File_TestData);
					Reportlog(driver,"Pass", "Expected URL Exist in page  & url is "+getcurturl,"//"+"Screenshot");
				
				
			}
				else
				{
					System.out.println("fail");
					setCellData("fail", i, 1,File_TestData);
					Reportlog(driver,"pass", "Expected URL   Exist in page  & url is "+getcurturl,"//"+"Screenshot");
				}
				}
			}
	}

	}
	
	
	
	
}
