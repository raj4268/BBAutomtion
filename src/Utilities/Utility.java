package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import html_Reportmethods.Reporter;

public class Utility extends Reporter{

	public static WebDriver driver = getdriver("chrome");	
//	public static WebDriver driver = null;
//	public static final String Path_TestData = "F:\\COMERCPUNDIT19\\Cp2020\\src\\testData\\";
//	public static final String File_TestData = "Xmltest.xlsx";
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static int timeInterval = 5;
	public static int Timeinsec=20;


	
	public static void setCellData(String Result, int RowNum, int ColNum,String File_TestData) throws Exception {

		try {

			Row = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(Path_TestData + File_TestData);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}

	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

	// This method is to set the File path and to open the Excel file, Pass Excel
	// Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}
	
//	public static void loadprofile() throws Throwable
//	{
//	//	prop = new Properties();
//	    InputStream input = null;
//
//	        input = new FileInputStream("config.properties");
//
//	        // load a properties file
//	        prop.load(input);
//
//	}
	
	
	
	
//	public static  WebDriver Browser(String Browser)
//	{
//	
//		
//		switch(Browser) {
//        case "chrome" :
//           System.out.println("Chrome driver launched"); 
//   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
//   		
//   	    driver = new ChromeDriver();
//   	    
//   	   // HtmlUnitDriver driver = new HtmlUnitDriver();
//   		driver.manage().window().maximize();
//   		return driver;	
//        case "firefox" :
//           System.out.println("Firefox driver launched");
//           
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

	public static void clickjavascriptelement(WebDriver driver, WebElement element){

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

		}

	public static void waitForLoaderToDisMiss(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 170);
			new WebDriverWait(driver, 150);
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@src='/static/images/store/3/loader/Loader-GIF-Animation.gif'] | //*[@src='/static/images/store/1/loader/Loader-GIF-Animation.gif']"), ""));
			
			
			
			}catch (Exception e) {
				System.out.println("Loader does not exist");
			}
	}

//	public static WebDriver driver = getdriver("chrome");
	
	public static void launchURL(String url) throws Throwable
	{
		
	System.out.println(" path "+Path_TestData);
//	System.out.println("file "+File_TestData);
	System.out.println("**Chrome driver initiated**");
	if (driver==null)
	{
		Reportlog(driver,"Done", "Driver session is not null","");
		
	}
	else
	{
		try {	
			
			
			driver.get(url);
			Reportlog(driver,"Done", "Launching URL","");
	System.out.println("**Chrome driver initiated**2");
		} catch (Exception e) {
			System.out.println("Error " + e.toString());
			Reportlog(driver,"Error", e.toString(),"");
			
		}
		}	

}
	public static WebDriver getdriver(String Browser)
	{
		
//		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
//			  
//		    driver = new ChromeDriver();
//		    driver.manage().window().maximize();
//		    System.out.println("**Chrome driver initiated1**");
//		return driver;
		switch(Browser) {
        case "chrome" :
           System.out.println("Chrome driver launched"); 
          // Reporter.Reportlog(driver,"Done", "Chrome driver launched");
   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Chromdrivr\\chromedriver.exe\\");
   		
   	    driver = new ChromeDriver();
   	    
   	   // HtmlUnitDriver driver = new HtmlUnitDriver();
   		driver.manage().window().maximize();
   		return driver;	
        case "firefox" :
           System.out.println("Firefox driver launched");
    //      Reporter.Reportlog(driver,"Done", "Firefox driver launched");
       	System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\gecko\\geckodriver.exe");
		
		  driver = new FirefoxDriver();
		    
		   // HtmlUnitDriver driver = new HtmlUnitDriver();
			driver.manage().window().maximize();
          return driver;
           default :
           System.out.println("No driver launched");
		
		}
		return null;
		}

	public static void scroll(String xpath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement Element = driver.findElement(By.xpath(xpath));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[6].scrollIntoView();", Element);
	}
	

	}











