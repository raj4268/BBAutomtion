package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Utility;

//import bBScripts_withHtmlReport.Reporter;

public class Shipping_feedpricevalidtion extends Utility {
	public static void Shipping_feedpricevalidtion(String File_TestData) throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 35);
		 
		for(int i=364;i<=930;i++)
		{
			//try {
			long time=System.currentTimeMillis();
			
			setExcelFile(Path_TestData + File_TestData,"Input");
		  String getexcelurl = getCellData(i,0);
			try {

			driver.get(getexcelurl);
			System.out.println( i   +  "getexcelurl "+ getexcelurl);
		//	Reporter.Reportlog("Done", "Launching Url is "+getexcelurl);
			
			}catch(Exception e) {
				
			}
			
			//waitForLoaderToDisMiss2(driver);
			
			//JOptionPane.showConfirmDialog(null, null);
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			try {
				if(driver.findElements(By.xpath("//span[text()='Upload Artwork']")).size()>0)
					System.out.println("Size is  " + driver.findElements(By.xpath("//span[text()='Upload Artwork'] ")).size());
				{
			//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Upload Artwork']")));
					//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//span[text()='Upload Artwork']")));
					// userdefinedDynamicwait(30,"//span[text()='Upload Artwork']");
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Upload Artwork'] | //button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[contains(text(),'Upload Artwork & Checkout')]")));
			Thread.sleep(2000);
			//shortwaitForVisisble((By.xpath("//span[text()='Upload Artwork']")));
			clickjavascriptelement(driver, driver.findElement(By.xpath("//span[text()='Upload Artwork'] |//button[contains(text(),'Upload Artwork & Checkout')] | //button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')]")));
				}
			} catch (Exception e1)
			{
				
			}	
		try {
			if(driver.findElements(By.xpath("//span[text()='Upload Artwork'] | //button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[contains(text(),'Upload Artwork & Checkout')]")).size()>0)
				System.out.println("Size is  " + driver.findElements(By.xpath("//span[text()='Upload Artwork'] | //button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')]  //button[contains(text(),'Upload Artwork & Checkout')]")).size());
			{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[text()='Upload Artwork & Checkout']")));
//////				//JOptionPane.showConfirmDialog(null, null);
//////				//Thread.sleep(5000);
//////			// userdefinedDynamicwait(30,"//button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[text()='Upload Artwork & Checkout']");
		//	shortwaitForVisisble((By.xpath("//button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[text()='Upload Artwork & Checkout']")));
			
			clickjavascriptelement(driver, driver.findElement(By.xpath("//button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[text()='Upload Artwork & Checkout']")));
			}
			} catch (Exception e1)
		{
		}
			
			
			try {
				
				
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btnpopupclose']")));
			Thread.sleep(2000);
			clickjavascriptelement(driver,driver.findElement(By.xpath("//button[@class='btnpopupclose']")));
			//shortwaitForVisisble((By.xpath("//button[@class='btnpopupclose']")));
			
			clickjavascriptelement(driver,driver.findElement(By.xpath("//button[text()='Add To Cart']")));
			}catch(Exception e) {
				e.printStackTrace();
			}

		
		//CHoice between Add to cart, Proceed & Checkout and UPload artwork
//		WebElement elementToClick=null;
//		try {
//			By addToCard=(By.xpath("//button[text()='Add To Cart']"));
//			shortwaitForVisisble(addToCard);
//			elementToClick=driver.findElement(addToCard);
//			
//		}catch(Exception e) {}
	//	
//		if(elementToClick==null) {
//		try {
//			By addToCard=(By.xpath("//button[contains(text(),'Proceed & Checkout')]"));
//			shortwaitForVisisble(addToCard);
//			elementToClick=driver.findElement(addToCard);
//			
//		}catch(Exception e) {}
//		}
	//	
//		if(elementToClick==null) {
//		try {
//			By addToCard=(By.xpath(" //button[text()='Upload Artwork & Checkout']"));
//			shortwaitForVisisble(addToCard);
//			elementToClick=driver.findElement(addToCard);
//			
//		}catch(Exception e) {}
//		}
//		clickjavascriptelement(driver, elementToClick);
	//	
		
//		try {
//			//Thread.sleep(2000);
//		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btnpopupclose']")));
//		shortwaitForVisisble((By.xpath("//button[@class='btnpopupclose']")));
//		clickjavascriptelement(driver,driver.findElement(By.xpath("//button[@class='btnpopupclose']")));
//		//Thread.sleep(2000);
////		clickjavascriptelement(driver, driver.findElement(By.xpath("//button[text()='Add To Cart'] | //button[contains(text(),'Proceed & Checkout')] | //button[text()='Upload Artwork & Checkout']")));
	//	
//		//clickjavascriptelement(driver,driver.findElement(By.xpath("//button[text()='Add To Cart']")));
////		if(popup.isDisplayed()) {
////			
////			clickjavascriptelement(driver,popup);
////		}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//				
//			}
			//waitForLoaderToDisMiss(driver);
			try {
				//JOptionPane.showConfirmDialog(null, null);
			//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btnSecondaryOne addToCartAfterOrderBtn']")));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btnSecondaryOne addToCartAfterOrderBtn']")));
			//Thread.sleep(6000);
				//shortwaitForVisisble((By.xpath("//button[@class='btn btnSecondaryOne addToCartAfterOrderBtn']")));

				Actions act=new Actions(driver);
				WebElement el=driver.findElement(By.xpath("//button[@class='btn btnSecondaryOne addToCartAfterOrderBtn']"));
				//JOptionPane.showConfirmDialog(null, null);
				Thread.sleep(1000);
				act.moveToElement(el).build().perform();
		
				clickjavascriptelement(driver, driver.findElement(By.xpath("//button[@class='btn btnSecondaryOne addToCartAfterOrderBtn']")));

			}catch(Exception e)
				{
				e.printStackTrace();
					System.out.println("Add to card buttn is not succesfull");

				}	
		try
		{
			waitForLoaderToDisMiss(driver);
			//Thread.sleep(20000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btnSecondaryOne addToCartAfterOrderBtn']")));
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@class='linkButton remove']")));
			////button[text()='Proceed to checkout']
			//select super saver
			//shortwaitForVisisble(By.xpath("/*[@id='cartsummary-heading-2']/div/a"));
	    	
			clickjavascriptelement(driver,driver.findElement(By.xpath("//*[@id='cartsummary-heading-2']/div/a")));
		     JavascriptExecutor jse = (JavascriptExecutor)driver;
		      jse.executeScript("window.scrollBy(0,360)");
		       WebElement rb= driver.findElement(By.xpath("//span[text()='Super Saver']"));
		       clickjavascriptelement(driver,rb);
		       waitForLoaderToDisMiss(driver);
		      // Thread.sleep(4000);
			//Select express
//			
//			clickjavascriptelement(driver,driver.findElement(By.xpath("//*[@id='cartsummary-heading-2']/div/a")));
//		      JavascriptExecutor jse = (JavascriptExecutor)driver;
//		       jse.executeScript("window.scrollBy(0,360)");
//		       WebElement rb= driver.findElement(By.xpath("//span[text()='Express']"));
//		       clickjavascriptelement(driver,rb);
//		       waitForLoaderToDisMiss(driver);
//		       Thread.sleep(3000);
		       //shortwaitForVisisble(By.xpath("//*[@id='__next']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/span[2]"));
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/span[2]")));
		    //	shortwaitForVisisble(By.xpath("//*[@id='__next']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/span[2]"));
		    	
		    	//TimeUnit.SECONDS.sleep(5);
		    	
		       
		    Thread.sleep(5000);
			String getdata = driver.findElement(By.xpath("//*[@id='__next']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/span[2]")).getText();
			String getdata1=getdata.replace("$", "");
			//$
			//£
			//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='__next']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/span[2]", "getdata")));
			System.out.println("Actual price "+getdata1);
			//TimeUnit.SECONDS.sleep(5);
			//JOptionPane.showConfirmDialog(null, null);
			//shortwaitForVisisble(By.xpath("//*[@class='linkButton remove']"));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='linkButton remove']")));

			setExcelFile(Path_TestData + File_TestData, "Input");
			setCellData(getdata1, i, 2,File_TestData);
			
			if(getCellData(i, 1).trim().equalsIgnoreCase(getdata1.trim()) )
				//
					{
				System.out.println("expected"  + getCellData(i, 1));
						System.out.println("pass");
				   	   setExcelFile(Path_TestData + File_TestData, "Input");
						setCellData("Pass", i, 3,File_TestData);
						Reportlog(driver,"pass", "Shipping charge as expected "+getexcelurl,"//"+"Screenshot");
						//Reporter.Reportlog("Pass", "Url is "+   getexcelurl);	
						
							
					}
					else
					{
						System.out.println("expected"  + getCellData(i, 1));
						System.out.println("fail");
						setExcelFile(Path_TestData + File_TestData, "Input");
						setCellData("Fail", i, 3,File_TestData);
						Reportlog(driver,"Fail", "Shipping charge not expected "+getexcelurl,"//"+"Screenshot");
						//Reporter.Reportlog("Fail", "Url is "+   getexcelurl);
					}
			
		}catch(Exception e)
		{
		}
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@class='linkButton remove']")));
			clickjavascriptelement(driver,driver.findElement(By.xpath("//*[@class='linkButton remove']")));
		Thread.sleep(2000);

		
		
		clickjavascriptelement(driver,driver.findElement(By.xpath("//*[@class='btn btnSecondaryOne btn btn-default']")));
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
		}
		System.out.println("TIme taken in secs: "+(System.currentTimeMillis()-time)/1000);
	}
			
		
	}
}
