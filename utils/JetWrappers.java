package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;

import com.spicejet.pages.LoginjetPage;
import com.spicejet.pages.OnewaySearchFlightPage;
import com.spicejet.pages.TwowaySearchFlightPage;


public class JetWrappers extends SeWrappersJet {
	SeWrappersJet se= new SeWrappersJet();

	public void loginSpicejet()
	{
		try
		{
			LoginjetPage login=PageFactory.initElements(driver, LoginjetPage.class);
			se.frameByname("juspay-hidden-form1693479009936");
			login.ClickLogin();
			driver.switchTo().defaultContent();
			login.Mobno("9025727902");
			login.Password("Uma@220800");
			login.ClickLoginButton();
			Thread.sleep(4000);
			//login.SelectFrom("BOM");
			//login.SelectTo("DEL");
			//login.FromTo();
			//login.Benglore();
			//login.delh();
			Thread.sleep(4000);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void invalidLogin()
	{
		try
		{
			LoginjetPage login=PageFactory.initElements(driver, LoginjetPage.class);
			se.frameByname("juspay-hidden-form1693479009936");
			login.ClickLogin();
			driver.switchTo().defaultContent();
			login.Mobno("9025727902");
			login.Password("Uma@2208");
			login.ClickLoginButton();
			Thread.sleep(4000);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//=========================================================================
	
	public void oneWayFlight()
	{
		try
		{
			OnewaySearchFlightPage owPage=PageFactory.initElements(driver, OnewaySearchFlightPage.class);
		
		   
			owPage.clickOrigin();
			
			owPage.date(10);
			owPage.Travellers();
			owPage.Adults();
			
			owPage.clickCurrency();
			owPage.chooseCurrency();
			Thread.sleep(4000);
			owPage.searchFlights();
			Thread.sleep(9000);
			owPage.BookingFlights();
			Thread.sleep(9000);
		}
		 catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }
	}
	//===========================================================
	
	public void RoundTripFlight()
	{
		try
		{
			TwowaySearchFlightPage twPage=PageFactory.initElements(driver, TwowaySearchFlightPage.class);

			twPage.roundTrip();
			twPage.Choosedate(10);
		
			twPage.Searchflights();
			Thread.sleep(9000);
			
		}
		 catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }
	}
	
	public void bookingFlights()
	{
		try
		{
			BookingPage bPage=PageFactory.initElements(driver, BookingPage.class);
			bPage.BookingFlights("Uma","makeswari","9025727902","uma220800@gmail.com","nashik","uma", "makeswari", "9003633556");
			
			
		}
		 catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }
	}	
		public void FlightStatus() throws InterruptedException
		{
			
			FlightStatusPage stPage=PageFactory.initElements(driver, FlightStatusPage.class);
			stPage.CheckStatus();

			stPage.Flightstatus();
		}
		
	}
