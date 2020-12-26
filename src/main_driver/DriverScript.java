package main_driver;

import java.lang.reflect.Method;

import Utilities.Utility;



public class DriverScript extends Utility{
	public static TestSuite actionKeywords;
	public static String sActionKeyword;

	public static Method method[] ;


    public static void main(String[] args) throws Throwable {
		actionKeywords = new TestSuite();
		method = actionKeywords.getClass().getMethods();
		setExcelFile(System.getProperty("user.dir")+"\\src\\Run_Manager.xlsx", "Input");

		for(int z=1;z<=7;z++)
		{
			if(getCellData(z, 3).trim().equalsIgnoreCase("Yes"))
			{
				
				System.out.println("data "+method[z].getName());
		    	String sActionKeyword = getCellData(z, 1).trim();
		    	System.out.println("getexcelurl "+sActionKeyword);
				for(int i = 1;i<=7;i++){
				if(method[i].getName().equals(sActionKeyword)){
					initialize();
					method[i].invoke(actionKeywords);
					System.out.println("execute");
					writeResults();
					driver.quit();
					break;
					}
				}
		    	
		
			}
		}
	}
 }