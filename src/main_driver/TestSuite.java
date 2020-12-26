
package main_driver;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestCases.*;
 
public class TestSuite {

	public static void Zeropricefunctionality() throws Throwable
	{
	//	Test_cases.Zeropricefunctionality("Xmltest.xlsx");
	}
		 
	public static void DesignTool_Template() throws Throwable
	{
		DesignTool_Template.designTool_Template("Designtool_Template.xlsx");
	}
	
	public static void Shipping_Boxvalidation() throws Throwable
	{
		Shipping_Boxvalidation.freebie("ShipingBox_us.xlsx");
	}
	public static void breadcumb_Validation() throws Throwable
	{
		Test_cases1.breadcumb_Validation("BreadcumbValidtn.xlsx");
	}
	
	public static void DesignTool_shapesvalidtion() throws Throwable
	{
		DesignTool_shapesvalidtion.DesignTool_shapesvalidtion("Designtool_shapes.xlsx");
	}
	
	public static void Shipping_feedpricevalidtion() throws Throwable
	{
		Shipping_feedpricevalidtion.Shipping_feedpricevalidtion("AuShippingpricevalidtion.xlsx");
	}
	public static void DesignTool_Clipart_validation() throws Throwable
	{
		Clipart_validation.DesignTool_Clipart_validation("Designtool_clipart.xlsx");
	}
 }

