package TestCases;

 //TestCases;package

import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Utility;

public class Clipart_validation extends Utility {
	
	public static void DesignTool_Clipart_validation(String File_TestData) throws Throwable
	{
	WebDriverWait wait = new WebDriverWait(driver, 130);
	 
	
//	getexcelurl = "https://www.bannerbuzz.com/customer/account/login";
	
//	try {
//
	driver.get("https://www.bannerbuzz.com/customer/account/login");
//	System.out.println( i   +  "getexcelurl "+ getexcelurl);
//	Reporter.Reportlog("Done", "Launching Url is "+getexcelurl);
//	
//	}catch(Exception e) {
//		
//	}
	Thread.sleep(5000);

	clickjavascriptelement(driver,driver.findElement(By.xpath("//*[@class='linkButton googlePlus']")));

	//driver.findElement(By.xpath("//*[@class='linkButton googlePlus']")).click();
			Thread.sleep(5000);
			
			 String parent=driver.getWindowHandle();
			 String winHandleBefore = driver.getWindowHandle();
	         Set<String> handles =  driver.getWindowHandles();
	         for(String windowHandle  : handles)
	            {
	            if(!windowHandle.equals(parent))
	               {
	            	driver.switchTo().window(windowHandle);
	            	//Thread.sleep(5000);
	     WebElement gml  = driver.findElement(By.name("identifier"));
	     gml.clear();
////	     setExcelFile(Path_TestData + File_TestData,"Sheet1");
////			String gml1 = getCellData(i,3);
////			System.out.println("getexcelurl "+gml1);
			gml.sendKeys("ray78733@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
		    Thread.sleep(4000);
	   clickjavascriptelement(driver,driver.findElement(By.xpath("//span[contains(text(),'Next')]")));
	    Thread.sleep(3000);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
//	   // driver.findElement(By.xpath("//*[@type='password']")).sendKeys("7978489934");
	  //  driver.findElement(By.name("password")).sendKeys("7873356770");
//	    Thread.sleep(3000);
	    WebElement psw=driver.findElement(By.xpath("//input[@type='password']"));
	    psw.sendKeys("7873356770");
//	 //   System.out.println(psw);
//	 //   psw.clear();
//	       // Thread.sleep(4000);
////	        setExcelFile(Path_TestData + File_TestData,"Sheet1");
////			String psw1 = getCellData(i,4);
////			System.out.println("getpwd "+psw1);
////		   
////			//Thread.sleep(2000);
////			psw.sendKeys(psw1);
//			    
//		    Thread.sleep(2000);
			clickjavascriptelement(driver,driver.findElement(By.xpath("//span[text()='Next']")));
		    Thread.sleep(10000);
			driver.switchTo().window(parent);
			Thread.sleep(20000);
	               }
	            }
	         
	         for(int i=1;i<=1;i++)
	     	{
	     		//try {
	     		long time=System.currentTimeMillis();
	     		
	     		setExcelFile(Path_TestData + File_TestData,"Input");
	     	    String	getexcelurl = getCellData(i,0);   
	            driver.get(getexcelurl);
	        
	         
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Proceed & Checkout']")));     
	clickjavascriptelement(driver,driver.findElement(By.xpath("//*[text()='Proceed & Checkout']")));
	//JOptionPane.showConfirmDialog(null, null);
	System.out.println("before loader");
	waitForLoaderToDisMiss(driver);
	Thread.sleep(15000);
	System.out.println("after loader");

	

	try {
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='tata-ajax-loader-img']")));
	System.out.println("no skip exception");
	clickjavascriptelement(driver, driver.findElement(By.xpath("//*[@class='btnpopupclose']")));	
	}catch(Exception e) {
		//System.out.println("" + e.printStackTrace());
		System.out.println("skip exception");
		e.printStackTrace();
	}
	
             driver.switchTo().frame("designtool-frame");
             System.out.println("Enter into frame");
             Thread.sleep(5000);
         //  JOptionPane.showConfirmDialog(null, null);
            // WebElement popup=driver.findElement(By.xpath("//button[@class='tourClose introclose']")); 
  // JOptionPane.showConfirmDialog(null, null);
             try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='tourClose introclose']")));
             System.out.println("no skip exception1");
//                 if (ele2.isDisplayed() && popup.isEnabled()) {
             JOptionPane.showConfirmDialog(null, null);
                        clickjavascriptelement(driver, driver.findElement(By.xpath("//button[@class='tourClose introclose']")));
               //  }
                        // JOptionPane.showConfirmDialog(null, null);
         }catch (Exception e) {
      	   e.printStackTrace();
      	   System.out.println("skip exception1");
         }
Thread.sleep(5000);
//JOptionPane.showConfirmDialog(null, null);
                        clickjavascriptelement(driver,driver.findElement(By.xpath("(//*[@class='spride-svg'])[8]")));
 

                        Thread.sleep(15000);

              
                    	Select drp = new Select(driver.findElement(By.xpath("//*[@id='clipart_cat']")));
                    	List<WebElement> drpcnt = drp.getOptions();
                    	
                    for(int j=29;j<drpcnt.size();j++)
                    	//j=0;j<drpcnt.size()
                    {
                //    	drp.selectByVisibleText("Animal");
                    	drp.selectByIndex(j);
                    	Thread.sleep(5000);
                    	
                        List<WebElement> imgdata = driver.findElements(By.xpath("//*[@data-target='clipart']"));	
                     	System.out.println("test "+imgdata.size());	
                    	
                    	for(WebElement imgdata1: imgdata)
                    	{
                    		
                    		//imgdata1.click();
                    		try {
                    		clickjavascriptelement(driver, imgdata1);
                    		Thread.sleep(5000);
                    	                 		
                    		}catch(Exception e) {
                    			e.printStackTrace();
                    		}                   //		Reporter.Reportlog(img, "Done");
//                    		//--wait for loader to dismiss
                    		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='tata-ajax-loader-img']")));
//                    		
                    		Thread.sleep(5000);
                    		String img = imgdata1.getAttribute("src");
                    		setExcelFile(Path_TestData + File_TestData, "Input");
                    		setCellData(img, i, 1,File_TestData);
                    		
                    		String productname1 = driver.findElement(By.xpath("//div[@class='artwork-title']")).getText();
                    		String productname = productname1.replaceAll(" ", "_");
                    		System.out.println("img "+img+ "     "+productname);
                    		Reportlog(driver,"Done", "captureImg "+img,productname+"//"+j+"//"+"Screenshot");
                    		//Reportlog(driver, img, "captureImg");
//                    		//---get Actual image
//                    		  WebElement element = driver.findElement(By.xpath(""));
//                    	         
//                    	        File source = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
//                    	        FileHandler.copy(source, new File("./screenshots/element.png"));

                    		Thread.sleep(4000);
                    		driver.findElement(By.xpath("//*[@id='trash']")).click();
                    		driver.switchTo( ).alert( ).accept();
                    	}		
                    	}
                    //	

             driver.switchTo().defaultContent();
//}catch(Exception e) {
//
//}
}}
}


