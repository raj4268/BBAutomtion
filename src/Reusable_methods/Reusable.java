package Reusable_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

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

import TestCases.Test_cases;
import Utilities.Utility;
import config.Configdata;
import html_Reportmethods.Reporter;

public class Reusable extends Utility{
	

	
	public static WebDriverWait wait = new WebDriverWait(driver, 40);
	
	
	public static void waitForLoaderToDisMiss2(WebDriver driver) {
		try {
			new WebDriverWait(driver, 100).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//img[@alt='Loader'])[1]"))));
			}catch (Exception e) {
				System.out.println("Loader does not exist");
			}
		}
	public static void waitForLoaderToDisMiss(WebDriver driver) {
		try {
			new WebDriverWait(driver, 150);
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@src='/static/images/store/3/loader/Loader-GIF-Animation.gif'] | //*[@src='/static/images/store/1/loader/Loader-GIF-Animation.gif']"), ""));
			
			
			
			}catch (Exception e) {
				System.out.println("Loader does not exist");
			}
	}
	
}	



